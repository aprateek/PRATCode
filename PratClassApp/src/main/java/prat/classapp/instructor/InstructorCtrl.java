package prat.classapp.instructor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	private static final Logger logger = LogManager.getLogger(InstructorCtrl.class);
	 

	@RequestMapping(value = "/")
	public String index() {
		System.out.println("Home Page");
		return "index";
	}

	@RequestMapping(value = "/inst/{id}")
	public @ResponseBody String show(@RequestParam int id) {
		
		String name = instRepo.findByInstID(id).getFirstName();
		 logger.info("Instructor  Page" +  name);
		return name;

	}

}
