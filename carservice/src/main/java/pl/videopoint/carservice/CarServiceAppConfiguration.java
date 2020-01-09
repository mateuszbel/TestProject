package pl.videopoint.carservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.videopoint.carservice.services.AppIssueService;
import pl.videopoint.carservice.services.IssuesService;

@Configuration
public class CarServiceAppConfiguration {

	@Bean
	public IssuesService issueService() {
		return new AppIssueService();
	}
}
