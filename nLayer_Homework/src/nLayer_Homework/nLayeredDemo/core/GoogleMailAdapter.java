package nLayer_Homework.nLayeredDemo.core;

import nLayer_Homework.nLayeredDemo.business.abstracts.MailService;
import nLayer_Homework.nLayeredDemo.entities.concretes.User;
import nLayer_Homework.nLayeredDemo.googleService.GoogleMailManager;

public class GoogleMailAdapter implements MailService{
	@Override
	public boolean checkIfTrueMail(User user) {
		GoogleMailManager googleMailManager = new GoogleMailManager();
		return googleMailManager.checkIfTrueMail(user);
	}
	
}
