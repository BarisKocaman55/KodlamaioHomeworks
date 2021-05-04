package managerPackage;
import introPackage.User;
import introPackage.Student;


public class StudentManager {
	public void studentProfile(User user) {
		System.out.println("��renci Bilgileri");
		System.out.println("Ad - Soyad : " + user.getFirstName() + " " + user.getLastName());
		System.out.println("��renci Email : " + user.getEmail());
	}
	
	public void addLecture(Student student) {
		System.out.println("Ders Eklenmi�tir : " + student.getEnrolledCourses());
	}
	
	public void showProgress(Student student) {
		System.out.println("Ders Ad� : " + student.getEnrolledCourses());
		System.out.println("Derste Kalan Zaman : " + (100 - student.getProgress()));
	}
}
