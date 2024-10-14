package app.schedule;

import org.springframework.boot.SpringApplication;

public class TestAppScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.from(AppScheduleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
