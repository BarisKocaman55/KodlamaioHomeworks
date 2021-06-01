package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateWithCvFileDto;
import kodlamaio.hrms.entities.dtos.CandidateWithCvGraduate;

public interface CandidateService {
	Result add(Candidate candidate);
	DataResult<List<Candidate>> getAll();
	DataResult<List<Candidate>> getAll(int pageNo, int pageSize);
	DataResult<Candidate> getByCandidateId(int id);
	DataResult<Candidate> getByFirstNameAndLastName(String firstName, String lastName);
	
	DataResult<List<CandidateWithCvFileDto>> getCandidateWithCvDetails();
	DataResult<List<CandidateWithCvGraduate>> getCandidateCvOrderByGraduateYear();
	Result imageUpload(MultipartFile file);
}
