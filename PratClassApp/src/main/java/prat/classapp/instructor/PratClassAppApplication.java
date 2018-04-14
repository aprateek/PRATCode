package prat.classapp.instructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses=InstructorCtrl.class)
//@EnableJpaRepositories("prat.classapp.instructor")
//@EntityScan("prat.classapp.instructor")
public class PratClassAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PratClassAppApplication.class, args);
	}
}
