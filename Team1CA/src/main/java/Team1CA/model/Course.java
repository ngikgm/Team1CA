package Team1CA.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Course {

	@Id
	private int courseId;
	private String courseName;
	private int unit;
	
	//students can join multiple course?
	@ManyToMany
	private List<Student> student_studentId;
}
