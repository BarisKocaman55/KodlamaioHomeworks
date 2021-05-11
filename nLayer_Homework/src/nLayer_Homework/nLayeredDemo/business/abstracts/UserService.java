package nLayer_Homework.nLayeredDemo.business.abstracts;

import nLayer_Homework.nLayeredDemo.entities.concretes.User;

public interface UserService {
	public void addUser(User user);
	public void login(String email, String password);
	
}
