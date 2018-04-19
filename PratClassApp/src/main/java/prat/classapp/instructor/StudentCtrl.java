package prat.classapp.instructor;

 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

 
@Controller
public class StudentCtrl {
	
	@Autowired
	private StudentRepo studRepo;
	
	private static final Logger logger = LogManager.getLogger(InstructorCtrl.class);
	
	@RequestMapping(method=RequestMethod.POST,value ="/students")
	public Student createStudent(@RequestBody Student student) {
		student =  setStudent();
		
		logger.info("Student Date "+ student.getCreateDate());
		logger.info("Student Name "+ student.getStudFname());
		logger.info("Student DOC "+ student.getDob());
	    return studRepo.save(student);
	}
	@RequestMapping(value = "/student/{id}")
	public @ResponseBody String showStudent(@RequestParam int id) {
		 
		logger.info("Student  Page" +  id);
		String name = studRepo.findByStudID(id).getStudFname();
		logger.info("Student  Page" +  name);
		return name;

	}
	
	private Student setStudent(){
		
		Student stud = new Student();
		 
		Date date = new Date();
		try {
			date = new SimpleDateFormat("YYYY-MM-DD").parse("2010-09-03");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		stud.setStudID(345);
		stud.setStudFname ("Prateek");
		stud.setStudLName("Agrawal");
		stud.setActive(true);
		stud.setDob(date );
		stud.setPhoneNumber(888401);
		stud.setSex('F');
		stud.setCreateDate(date);
		stud.setUpdateDate(date);
		
		
		return stud;
	}
}
