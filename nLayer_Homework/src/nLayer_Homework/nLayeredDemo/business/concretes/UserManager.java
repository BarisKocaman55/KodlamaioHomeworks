package nLayer_Homework.nLayeredDemo.business.concretes;

import nLayer_Homework.nLayeredDemo.business.abstracts.MailService;
import nLayer_Homework.nLayeredDemo.business.abstracts.UserService;
import nLayer_Homework.nLayeredDemo.business.abstracts.UserVarificationService;
import nLayer_Homework.nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayer_Homework.nLayeredDemo.entities.concretes.User;

public class UserManager implements UserService{
	public UserVarificationService userVerificationService;
	public UserDao userDao;
	public MailService mailCheckService;
	
	public UserManager(UserVarificationService userVerificationService, MailService mailCheckService, UserDao userDao) {
		super();
		this.userVerificationService = userVerificationService;
		this.mailCheckService = mailCheckService;
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		if(!checkIfUserExists(user.getEmail())) {
			System.out.println("This mail address is already exists!!!");
			return;
		}
		
		if(!this.mailCheckService.checkIfTrueMail(user)) {
			System.out.println("This mail address is not accepted by Google!!!");
			return;
		}
		
		if(!this.userVerificationService.checkUser(user)) {
			System.out.println("Yout firstName or lastName is shorter then 2 characters!!!");
			System.out.println("---OR---");
			System.out.println("Your password is shorter then 6 characters!!!");
		}
		
		this.userDao.saveUser(user);
		this.userVerificationService.sendEmail(user.getEmail());
	}

	@Override
	public void login(String email, String password) {
		if(!this.userVerificationService.checkEmpty(email, password)) {
			System.out.println("Login failed!!!");
			System.out.println("Empty mail or password!!!");
			return;
		}
		
		User user = this.userDao.checkEmailPassword(email, password);
		if(user != null && user.isUser_varification()) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " login successfully!!!");
		}
		
		else {
			System.out.println("Login failed!!!");
		}
		
	}
	
	private boolean checkIfUserExists(String email) {
		return userDao.listEmail(email) == null;
	}

}
