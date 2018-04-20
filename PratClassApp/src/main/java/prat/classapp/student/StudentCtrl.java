package prat.classapp.student;

 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import prat.classapp.instructor.InstructorCtrl;

 
@Controller
public class StudentCtrl {
	
	@Autowired
	private StudentRepo studRepo;
	private static final Logger logger = LogManager.getLogger(InstructorCtrl.class);
	
	
	 
	// ------------------- Get a Student-----------------------------------------
	@RequestMapping(value = "/student/{id}")
	public @ResponseBody String showStudent(@RequestParam int id) {
		 
		logger.info("Student  Page" +  id);
		String name = studRepo.findByStudID(id).getStudFname();
		logger.info("Student  Page" +  name);
		return name;

	}
	// ------------------- Add a Student-----------------------------------------t 
		@RequestMapping(method=RequestMethod.POST,value ="/students")
		public Student createStudent(@RequestBody Student student) {
			student =  setStudent();
			
			logger.info("Student Date "+ student.getCreateDate());
			logger.info("Student Name "+ student.getStudFname());
			logger.info("Student DOC "+ student.getDob());
		    return studRepo.save(student);
		}
		
	// ------------------- modify a Student-----------------------------------------  
	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@RequestParam int id, @RequestBody Student stud) {
        logger.info("Updating student with id {}", id);
        stud = setStudent();
        Student currentUser = studRepo.findByStudID(id);
        logger.info( " Mdifying",currentUser.getStudFname());
        
        if (currentUser == null) {
            logger.error("Unable to update. User with id {} not found.", id);
            return new ResponseEntity( "Student Not Found",HttpStatus.NOT_FOUND);
        }
         currentUser.setStudFname(stud.getStudFname());
        //currentUser.setDob(stud.getDob());
        currentUser.setUpdateBy(stud.getUpdateBy());;
 
        studRepo.save(currentUser);
        return new ResponseEntity<Student>(currentUser, HttpStatus.OK);
    }
 
	// ------------------- Delete a Student-----------------------------------------
	 
    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteStudent(@RequestParam int id) {
        logger.info("Fetching & Deleting User with id {}", id);
 
        Student user = studRepo.findByStudID(id);
        if (user == null) {
            logger.error("Unable to delete. User with id {} not found.", id);
            return new ResponseEntity( ("Unable to delete. User with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        studRepo.deleteById(id);
        return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
    }
	
	// create a dummy student 
	private Student setStudent(){
		
		Student stud = new Student();
		 
		Date date = new Date();
		try {
			date = new SimpleDateFormat("YYYY-MM-DD").parse("2010-09-03");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//stud.setStudID(112);
		stud.setStudFname ("ANNNN");
		stud.setStudLName("Agrawal");
		stud.setActive(true);
		stud.setDob(date );
		stud.setPhoneNumber(888401);
		stud.setSex('F');
		stud.setCreateDate(date);
		stud.setUpdateDate(date);
		stud.setUpdateBy("HONOOO");
		
		return stud;
	}
}
