package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.adapters.MernisService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	private EmployeeDao employeeDao;
	private MernisService mernisService;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao, MernisService mernisService) {
		this.employeeDao = employeeDao;
		this.mernisService = mernisService;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(), "Çalışanlar Görüntülendi!!!");
	}

	@Override
	public Result add(Employee employee) {
		if(!this.checkIfMailExists(employee)) {
			return new ErrorResult("Email Adresi Tekrar Kullanılamaz!!!");
		}
		else if(!this.checkIfNationalIdExists(employee)) {
			return new ErrorResult("TC Numarası Tekrar Kullanılamaz!!!");
		}
		
		else if(!this.checkPasswordRetry(employee)) {
			return new ErrorResult("Parolar Eşleşmiyor. Lütfen Tekrar Giriniz!!!");
		}
		
		else if(!this.checkIfRealPerson(employee)) {
			return new ErrorResult("Kullanıcı Bilgileri Doğrulanamadı!!!");
		}
		
		else {
			this.employeeDao.save(employee);
			return new SuccessResult("Kullanıcı Başarıyla Eklendi!!!");
		}
	}

	
	
	public boolean checkIfMailExists(Employee employee) {
		if(this.employeeDao.existsByEmail(employee.getEmail())) {
			return false;
		}
		return true;
	}
	
	public boolean checkIfNationalIdExists(Employee employee) {
		if(this.employeeDao.existsByNationalId(employee.getNationalId())) {
			return false;
		}
		
		return true;
	}
	
	public boolean checkPasswordRetry(Employee employee) {
		if(!employee.getPassword().contains(employee.getPassword_again())) {
			return false;
		}
		
		return true;
	}
	
	public boolean checkIfRealPerson(Employee employee) {
		if(this.mernisService.validateByMernis(employee.getFirstname(), employee.getLastname(), employee.getNationalId())) {
			return true;
		}
		
		return false;
	}
	
}
