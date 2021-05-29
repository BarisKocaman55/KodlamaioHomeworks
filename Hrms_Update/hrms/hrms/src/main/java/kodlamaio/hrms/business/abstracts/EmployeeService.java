package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {
	public DataResult<List<Employee>> getAll();
	public Result add(Employee employee);
}
