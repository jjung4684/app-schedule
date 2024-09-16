package app.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppScheduleApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		//System.setProperty("spring.config.location","classpath:/application-${spring.profiles.active}.yml,classpath:/application-${spring.profiles.active}.properties");
		System.setProperty("spring.config.location","classpath:/application-${spring.profiles.active}.yml");
		SpringApplication.run(AppScheduleApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AppScheduleApplication.class);
	}

}
