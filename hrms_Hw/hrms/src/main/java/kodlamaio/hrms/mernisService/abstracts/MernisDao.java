package kodlamaio.hrms.mernisService.abstracts;

public interface MernisDao {
	public boolean validationProcess(String firstname, String lastname, String national_id);
	public boolean validationForCompany(String companyName, String email);
}
