package kodlamaio.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;
import kodlamaio.hrms.mernisService.concretes.MernisManager;

@Service
public class MernisAdapter implements MernisService{
	@Override
	public boolean validateByMernis(String firstname, String lastname, String national_id) {
		MernisManager client = new MernisManager();
		boolean result = false;
		try {
			result = client.validationProcess(firstname, lastname, national_id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public boolean validateCompany(String companyName, String email) {
		MernisManager client = new MernisManager();
		boolean result = false;
		try {
			result = client.validationForCompany(companyName, email);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
