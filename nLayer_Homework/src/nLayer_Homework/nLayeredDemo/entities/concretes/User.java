package nLayer_Homework.nLayeredDemo.entities.concretes;

import nLayer_Homework.nLayeredDemo.entities.abstracts.Entity;

public class User implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private boolean user_varification;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String email, String password, boolean user_varification) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.user_varification = user_varification;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUser_varification() {
		return user_varification;
	}

	public void setUser_varification(boolean user_varification) {
		this.user_varification = user_varification;
	}

	
	
}
