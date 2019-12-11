package Team1CA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Team1CA.model.Course;
import Team1CA.repo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getMasterCourses(){
		return courseRepo.findAll();
	}
}
