package prat.classapp.classes;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import prat.classapp.instructor.InstRepo;
import prat.classapp.instructor.Instructor;
import prat.classapp.instructor.InstructorCtrl;
 

@Controller
public class ClassesCtrl {
	@Autowired
	private ClassesRepo classesRepo;
	private InstRepo instRepo;
	
	private static final Logger logger = LogManager.getLogger(InstructorCtrl.class);
	
	// ------------------- Get a classes-----------------------------------------
	
	@RequestMapping(value = "/classes/{id}")
	public @ResponseBody String showClass(@RequestParam int id) {
		 
		logger.info("Class  Page" +  id);
		String name = classesRepo.findByClassID(id).getClassDiscription();
		logger.info("classes  Page" +  name);
		return name;

	}
	 
	// ------------------- Get Instructors for a given classes-----------------------------------------
	@RequestMapping(value = "/classes/inst/{id}")
	public @ResponseBody String showClassInst(@RequestParam int id) {
		 
		logger.info("Class  ID" +  id);
		String name = classesRepo.findByClassID(id).getClassDiscription();
		logger.info("classes  Name" +  name);
		Set <Instructor>inst  = classesRepo.findByClassID(id).getInstructors();
		logger.info("Instructors  For this class" +  inst.size());
		for(Instructor instcounter :  inst) {
            logger.info(instcounter.getFirstName());
        }
		return name;

	}
}
