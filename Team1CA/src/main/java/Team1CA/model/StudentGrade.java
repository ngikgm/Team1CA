package Team1CA.model;

import java.util.List;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class StudentGrade {

	private int studentGradeId;
	private int courseId ;
	private String grade;
	@ManyToOne
	private Faculty facultyId;
	@ManyToOne
	private Student student_studentId;
	@ManyToOne
	private Course course_courseId;
	
	//not sure how to link
	//private int course_student_studentId;
}
