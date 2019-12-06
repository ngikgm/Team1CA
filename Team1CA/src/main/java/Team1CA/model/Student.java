package Team1CA.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	private String gender;
	private String DOB;
	private String mobile;
	private String email;
	
	//student can join many course?
	@ManyToMany
	private List<Course> courseId;
	@ManyToOne
	private Admin admin_adminId;
	
	
}
