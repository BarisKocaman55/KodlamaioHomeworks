package nLayer_Homework.nLayeredDemo.dataAccess.abstracts;

import nLayer_Homework.nLayeredDemo.entities.concretes.User;

public interface UserDao { 
	public void saveUser(User user);
	public User listEmail(String email);
	public User checkEmailPassword(String email, String password);
}