package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.entities.concretes.JobPosting;

@RestController
@RequestMapping("api/jobPosting")
public class JobPostingController {
	
	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingController(JobPostingService jobPostingService) {
		this.jobPostingService = jobPostingService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobPosting>> getAll() {
		return this.jobPostingService.getAll();
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<JobPosting>> getAll(int pageNo, int pageSize) {
		return this.jobPostingService.getAll(pageNo - 1, pageSize);
	}
	
	@GetMapping("/getAllByActive")
	public DataResult<List<JobPosting>> getByisActiveTrue() {
		return this.jobPostingService.getByisActiveTrue();
	}
	
	@GetMapping("/getAllDescByDate")
	public DataResult<List<JobPosting>> getByIsActiveAndSortedByPublishDate() {
		return this.jobPostingService.getByIsActiveAndSortedByPublishDate();
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody int id) {
		return this.jobPostingService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.Update(jobPosting);
	}
	
	@PostMapping("/getAllByActive_CompanyName")
	public DataResult<List<JobPosting>> getByisActiveTrueAndEmployer_companyName(String companyName) {
		return this.jobPostingService.getByisActiveTrueAndEmployer_companyName(companyName);
	}
	
	@PostMapping("/getById")
	public DataResult<JobPosting> getById(@RequestBody int id) {
		return this.jobPostingService.getById(id);
	}
	
}
