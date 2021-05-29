package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingService {
	Result add(JobPosting jobPosting);
	Result delete(int id);
	Result Update(JobPosting jobPosting);
	
	DataResult<List<JobPosting>> getByIsActiveAndSortedByPublishDate();
	DataResult<JobPosting> getById(int id);
	DataResult<List<JobPosting>> getAll();
	DataResult<List<JobPosting>> getAll(int pageNo, int pageSize);
	
	DataResult<List<JobPosting>> getByisActiveTrue();
	DataResult<List<JobPosting>> getByisActiveTrueAndEmployer_companyName(String companyName);
}
