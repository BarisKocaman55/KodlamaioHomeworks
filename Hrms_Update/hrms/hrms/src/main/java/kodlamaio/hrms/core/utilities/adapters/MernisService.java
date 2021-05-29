package kodlamaio.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

@Service
public interface MernisService {
	public boolean validateByMernis(String firstname, String lastname, String national_id);
	public boolean validateCompany(String companyName, String email);
}
