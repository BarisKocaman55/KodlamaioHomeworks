package managerPackage;
import introPackage.User;

public class UserManager {
	public void changePassword(User user) {
		System.out.println("�ifre De�i�tirilmi�tir");
		System.out.println("Yeni �ifre : " + user.getPassword());
	}
}
