package pl.videopoint.carservice.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.videopoint.carservice.services.IssuesService;

@Controller
@RequestMapping("/comment")
public class CommentsController {
private IssuesService issueService;

@Autowired
public CommentsController(IssuesService issueService) {
	super();
	this.issueService = issueService;
}
	@RequestMapping("/**")
	@ResponseBody
	public String test() {
		return "comentaz";
	}

	@RequestMapping(value = "/add",  method=RequestMethod.POST)
	@ResponseBody
	public String addComment(@RequestBody MultiValueMap<String, String> body) {
		return body.toString();
	}
	
	
}
