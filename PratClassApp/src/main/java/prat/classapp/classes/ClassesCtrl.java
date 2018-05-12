package prat.classapp.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import prat.classapp.instructor.InstructorCtrl;
 


@Controller
public class ClassesCtrl {
	@Autowired
	private ClassesRepo classesRepo;
	private static final Logger logger = LogManager.getLogger(InstructorCtrl.class);
	
	
	 
	// ------------------- Get a classes-----------------------------------------
	@RequestMapping(value = "/classes/{id}")
	public @ResponseBody String showClass(@RequestParam int id) {
		 
		logger.info("Class  Page" +  id);
		String name = classesRepo.findByClassID(id).getClassDiscription();
		logger.info("classes  Page" +  name);
		return name;

	}
}
