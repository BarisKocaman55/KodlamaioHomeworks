package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateWithCvFileDto;
import kodlamaio.hrms.entities.dtos.CandidateWithCvGraduate;

@RestController
@RequestMapping("api/candidates")
public class CandidateController {
	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Candidate>> getAll(int pageNo, int pageSize) {
		return this.candidateService.getAll(pageNo - 1, pageSize);
	}
	
	@GetMapping("/getById")
	public DataResult<Candidate> getByCandidateId(int id) {
		return this.candidateService.getByCandidateId(id);
	}
	
	@GetMapping("/getByName")
	public DataResult<Candidate> getByFirstNameAndLastName(String firstName, String lastName) {
		return this.candidateService.getByFirstNameAndLastName(firstName, lastName);
	}
	
	@GetMapping("getCandidateDetail")
	public DataResult<List<CandidateWithCvFileDto>> getCandidateWithCvDetails() {
		return this.candidateService.getCandidateWithCvDetails();
	}
	
	@GetMapping("/getCandidateWithGraduateTime")
	public DataResult<List<CandidateWithCvGraduate>> getCandidateWithGraduateTime() {
		return this.candidateService.getCandidateCvOrderByGraduateYear();
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@PostMapping("/uploadImage")
	public ResponseEntity<?> uploadImage(@RequestParam MultipartFile file) {
		var result = this.candidateService.imageUpload(file);
		return ResponseEntity.ok(result);
	}
}
