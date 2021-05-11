package nLayer_Homework.nLayeredDemo.dataAccess.concretes;

import java.util.ArrayList;

import nLayer_Homework.nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayer_Homework.nLayeredDemo.entities.concretes.User;

public class UserDataBase  implements UserDao{
	ArrayList<User> users = new ArrayList<User>();
	@Override
	public void saveUser(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added to mySQL database!!!");
	}

	@Override
	public User listEmail(String email) {
		for(User user:users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User checkEmailPassword(String email, String password) {
		for(User user:users) {
			if(user.getEmail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return null;
	}

}
