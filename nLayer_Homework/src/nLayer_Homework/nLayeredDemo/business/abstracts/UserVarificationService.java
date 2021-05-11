package nLayer_Homework.nLayeredDemo.business.abstracts;

import nLayer_Homework.nLayeredDemo.entities.concretes.User;

public interface UserVarificationService {
	public boolean checkUser(User user);
	public boolean checkFirstName(String firstName);
	public boolean checkLastName(String lastName);
	public boolean checkPassword(String password);
	public boolean checkIfEmailExists(String email);
	public boolean sendEmail(String email);
	public void verifyMail(User user);
	public boolean checkEmpty(String email, String password);
}
