package prat.classapp.student;

import org.springframework.data.jpa.repository.JpaRepository;

import prat.classapp.instructor.Instructor;


public interface StudentRepo extends JpaRepository<Student, String> {

}
