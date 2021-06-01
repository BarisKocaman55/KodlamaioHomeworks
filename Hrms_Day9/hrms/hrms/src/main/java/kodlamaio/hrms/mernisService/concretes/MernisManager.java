package kodlamaio.hrms.mernisService.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.mernisService.abstracts.MernisDao;

@Service
public class MernisManager implements MernisDao{
	@Override
	public boolean validationProcess(String firstname, String lastname, String national_id) {
		System.out.println(firstname + " " + lastname + " kişisi onaylanmıştır!!!");
		return true;
	}
	
	public boolean validationForCompany(String companyName, String email) {
		System.out.println(companyName + " " + email + " firmasi onaylanmıştır!!!");
		return true;
	}
}
