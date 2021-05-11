package nLayer_Homework.nLayeredDemo.business.concretes;

import nLayer_Homework.nLayeredDemo.business.abstracts.UserVarificationService;
import nLayer_Homework.nLayeredDemo.entities.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nLayer_Homework.nLayeredDemo.core.checkUserVarifications;

public class UserVarificationManager implements UserVarificationService{
	public static final Pattern email_pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean checkUser(User user) {
		boolean result = checkUserVarifications.checkRules(
				this.checkFirstName(user.getFirstName()),
				this.checkLastName(user.getLastName()),
				this.checkPassword(user.getPassword()),
				this.checkIfEmailExists(user.getEmail())
				);
		return result;
	}

	@Override
	public boolean checkFirstName(String firstName) {
		if(firstName.length() < 2) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if(lastName.length() < 2) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		if(password.length() < 6) {
			return false;
		}
		return true;
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		Matcher matcher = email_pattern.matcher(email);
		return matcher.find();
	}
	
	@Override
	public boolean sendEmail(String email) {
		boolean clicked = true;
		if(clicked) {
			System.out.println("Click the link in your mail address which is " + email + " to verify your account!!!");
			return true;
		}
		return false;
	}
	
	@Override
	public void verifyMail(User user) {
		user.setUser_varification(true);
		System.out.println("Your accounted has been varified!!!");
	}
	
	@Override
	public boolean checkEmpty(String email, String password) {
		if(email == " " || password == " ") {
			return false;
		}
		return true;
	}
	
}
