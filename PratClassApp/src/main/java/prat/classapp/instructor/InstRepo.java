package prat.classapp.instructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstRepo extends JpaRepository<Instructor, Integer> {
	
	
  Instructor findByInstID(int instId);

}
