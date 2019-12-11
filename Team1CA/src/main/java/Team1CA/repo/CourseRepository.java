package Team1CA.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Team1CA.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	List<Course> findAll();
}
