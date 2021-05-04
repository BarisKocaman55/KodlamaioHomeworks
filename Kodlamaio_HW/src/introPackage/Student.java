package introPackage;

public class Student extends User{
	private String studentNumber;
	private String enrolledCourses;
	private int progress;
	
	public Student() {
		this.studentNumber = " ";
		this.enrolledCourses = " ";
		this.progress = 0;
	}
	
	public Student(String studentNumber, String enrolledCourses, int progress) {
		this.studentNumber = studentNumber;
		this.enrolledCourses = enrolledCourses;
		this.progress = progress;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(String enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	
}
