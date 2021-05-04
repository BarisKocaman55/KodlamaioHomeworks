package managerPackage;
import introPackage.User;
import introPackage.Student;


public class StudentManager {
	public void studentProfile(User user) {
		System.out.println("Öðrenci Bilgileri");
		System.out.println("Ad - Soyad : " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Öðrenci Email : " + user.getEmail());
	}
	
	public void addLecture(Student student) {
		System.out.println("Ders Eklenmiþtir : " + student.getEnrolledCourses());
	}
	
	public void showProgress(Student student) {
		System.out.println("Ders Adý : " + student.getEnrolledCourses());
		System.out.println("Derste Kalan Zaman : " + (100 - student.getProgress()));
	}
}
