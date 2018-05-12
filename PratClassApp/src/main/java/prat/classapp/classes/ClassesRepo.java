package prat.classapp.classes;

import org.springframework.data.jpa.repository.JpaRepository;

import prat.classapp.student.Student;

public interface ClassesRepo extends JpaRepository<Classes, Integer> {
	Classes findByClassID(int instID);
}
