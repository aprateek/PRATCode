package prat.classapp.instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InstructorCtrl {
	@Autowired
	private InstRepo instRepo;

	Instructor inst = new Instructor();

	@RequestMapping(value = "/")
	public String index() {
		System.out.println("Home Page");
		return "index";
	}

	@RequestMapping(value = "/inst/{id}")
	public @ResponseBody String show(@RequestParam String id) {
		 

		String name = instRepo.findByid(id).getFirstName();
		System.out.println("Instructor  Page" +  name);

		return name;

	}

}
