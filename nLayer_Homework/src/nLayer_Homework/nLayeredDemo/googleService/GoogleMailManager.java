package nLayer_Homework.nLayeredDemo.googleService;

import nLayer_Homework.nLayeredDemo.entities.concretes.User;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleMailManager {
	public boolean checkIfTrueMail(User user) {
		Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.find();
	}
}
