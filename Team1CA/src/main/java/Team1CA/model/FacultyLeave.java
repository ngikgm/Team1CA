//package Team1CA.model;
//
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//
//public class FacultyLeave {
//	
//	@Id
//	private int leaveId;
//	private String status;
//	private LocalDate startDate;
//	private LocalDate endDate;
//	
//	@ManyToOne
//	private int faculty_facultyId;
//	
//	//not sure how to map
//	//private int faculty_course_courseId;
//	//not sure how to map
//	//private int faculty_course_student_studentId;
//	@OneToOne
//	private int admin_adminId;
//	
//}
