package pl.videopoint.carservice.controllers;

import java.util.Locale;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.videopoint.carservice.services.IssuesService;

@Controller
public class IssuesController {
private IssuesService issueService;

@Autowired
public IssuesController(IssuesService issueService) {
	super();
	this.issueService = issueService;
}


	@RequestMapping(path= {"/issue/{idIssue}/{test}","/issue/{idIssue}"}, method = RequestMethod.GET)
	@ResponseBody
	public String test3(@PathVariable("idIssue") String idIssue, @PathVariable("test") Optional<String> xx) {
		return "Zmienna "+xx.orElse("sgdhsghsdhs");
	}
	
	@RequestMapping(path= {"/"}, method = RequestMethod.GET)
	@ResponseBody
	public String testparam(@RequestParam(name="pageNumber", required = false) String pageNumber,@RequestHeader (name = "UserAgent", required=false) String userAgent,
			@RequestParam(name="recordCount", required = false) String recordCount, @CookieValue (name="rocordCount",required = false, defaultValue="10") String recordCauntCooki, HttpServletResponse response) {
		String recCount=null;
		if (recordCount!=null)
		{response.addCookie(new Cookie("recordCount", recordCount));
		recCount="Ustawione na wartosc"+recordCount;
		}else
		{recCount = "Odczytana wartosdc z ciasteczka to : "+recordCauntCooki;
			
		}
		
		
		return recCount;
	}
	
	
}
