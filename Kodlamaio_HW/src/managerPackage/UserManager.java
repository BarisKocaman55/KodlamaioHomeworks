package managerPackage;
import introPackage.User;

public class UserManager {
	public void changePassword(User user) {
		System.out.println("Þifre Deðiþtirilmiþtir");
		System.out.println("Yeni Þifre : " + user.getPassword());
	}
}
