package main;
import introPackage.Student;
import introPackage.Instructor;
import introPackage.User;
import managerPackage.StudentManager;
import managerPackage.InstructorManager;
import managerPackage.UserManager;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		StudentManager studentManager = new StudentManager();
		student1.setFirstName("Barýþ");
		student1.setLastName("Kocaman");
		student1.setEmail("bariskocaman5592@gmail.com");
		student1.setPassword("12345");
		student1.setStudentNumber("423412432");
		student1.setEnrolledCourses("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		student1.setProgress(48);
		
		studentManager.studentProfile(student1);
		System.out.println("--------");
		studentManager.addLecture(student1);
		System.out.println("--------");
		studentManager.showProgress(student1);
		
		Instructor instructor = new Instructor();
		InstructorManager instructorManager = new InstructorManager();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setLectures("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		
		System.out.println("--------");
		System.out.println("--------");
		instructorManager.instructorProfile(instructor);
		System.out.println("--------");
		instructorManager.openLecture(instructor);
		
		System.out.println("--------");
		UserManager userManager = new UserManager();
		System.out.println("Eski Þifre : " + student1.getPassword());
		student1.setPassword("password");
		userManager.changePassword(student1);
	}

}
