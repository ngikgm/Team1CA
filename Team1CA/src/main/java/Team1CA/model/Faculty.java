package Team1CA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Faculty {

	@Id
	@GeneratedValue
	private int facultyId;
	private String facultyName;
	private String gender;
	private String DOB;
	private String mobile;
	private String email;
	
	//one faculty only has 1 course? according to the picture sent
	@OneToOne
	private Course course_courseId;
	//not sure how to link
	//private int course_student_studentId;
	
	@ManyToOne
	private int admin_adminId;
	
}
