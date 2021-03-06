package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobs;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobsService jobsService;

	@Autowired
	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Jobs>> getAll() {
		return this.jobsService.getAll();
	}
	
	@PostMapping("/addJobs")
	public Result add(@RequestBody Jobs job) {
		return this.jobsService.add(job);
	}
	
}
