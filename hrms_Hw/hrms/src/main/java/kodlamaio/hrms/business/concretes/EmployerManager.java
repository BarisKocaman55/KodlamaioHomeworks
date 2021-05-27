package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.adapters.MernisService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	private MernisService mernisService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, MernisService mernisService) {
		super();
		this.employerDao = employerDao;
		this.mernisService = mernisService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(), "İş Verenler Görüntülendi!!!");
	}

	@Override
	public Result add(Employer employer) {
		if(!this.checkIfMailExists(employer)) {
			return new ErrorResult("Email Adresi Tekrar Kullanılamaz!!!");
		}
		
		else if(!this.checkIfRealCompany(employer)) {
			return new ErrorResult("Kullanıcı Bilgileri Doğrulanamadı!!!");
		}
		
		else {
			this.employerDao.save(employer);
			return new SuccessResult("Kullanıcı Başarıyla Eklendi!!!");
		}

	}
	
	
	public boolean checkIfRealCompany(Employer employer) {
		if(this.mernisService.validateCompany(employer.getCompanyName(), employer.getEmail())) {
			return true;
		}
		
		return false;
	}
	
	public boolean checkIfMailExists(Employer employer) {
		if(this.employerDao.existsByEmail(employer.getEmail())) {
			return false;
		}
		return true;
	}
	
	
}
