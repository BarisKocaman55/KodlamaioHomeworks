package managerPackage;
import introPackage.User;
import introPackage.Instructor;

public class InstructorManager {
	public void instructorProfile(User user) {
		System.out.println("E�itmen Bilgileri");
		System.out.println("Ad - Soyad : " + user.getFirstName() + " " + user.getLastName());
		System.out.println("��renci Email : " + user.getEmail());
	}
	
	public void openLecture(Instructor instructor) {
		System.out.println("Ders Eklenmi�tir");
		System.out.println("Eklenen Ders" + instructor.getLectures());
	}
}
