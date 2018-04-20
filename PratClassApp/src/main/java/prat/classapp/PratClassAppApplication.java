package prat.classapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import prat.classapp.instructor.InstructorCtrl;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="prat.classapp.*")
//@EnableJpaRepositories("prat.classapp.instructor")
//@EntityScan("prat.classapp.instructor")
public class PratClassAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PratClassAppApplication.class, args);
	}
}
