package Team1CA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Team1CA.model.Course;
import Team1CA.service.CourseService;



@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	  
	@GetMapping("/list")
	public String getMasterCourse(Model model) {
		List<Course> masterCourses = courseService.getMasterCourses();
		model.addAttribute("courses", masterCourses);
		return "masterCourse";
	}
}