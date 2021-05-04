package introPackage;

public class Instructor extends User{
	private String instructorNumber;
	private String lectures;
	
	public Instructor() {
		this.instructorNumber = " ";
		this.lectures = " ";
	}
	
	public Instructor(String instructorNumber, String lectures) {
		this.instructorNumber = instructorNumber;
		this.lectures = lectures;
	}
	
	public String getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	public String getLectures() {
		return lectures;
	}
	public void setLectures(String lectures) {
		this.lectures = lectures;
	}
		
}
