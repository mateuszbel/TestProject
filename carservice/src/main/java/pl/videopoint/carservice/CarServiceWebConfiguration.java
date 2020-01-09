package pl.videopoint.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import pl.videopoint.carservice.services.IssuesService;
import pl.videopoint.carservice.services.WebIssueService;

@Configuration
@ComponentScan("pl.videopoint.carservice")
@EnableWebMvc
public class CarServiceWebConfiguration {

	//@Bean
	public IssuesService issueService() {
		return new WebIssueService();
	}
}
