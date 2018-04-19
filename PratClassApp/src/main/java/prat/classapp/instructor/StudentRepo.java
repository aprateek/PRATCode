package prat.classapp.instructor;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student findByStudID(int id);
}
