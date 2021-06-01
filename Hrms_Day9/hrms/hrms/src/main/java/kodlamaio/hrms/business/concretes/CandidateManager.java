package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.imageUpload.ImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateWithCvFileDto;
import kodlamaio.hrms.entities.dtos.CandidateWithCvGraduate;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@Service
public class CandidateManager implements CandidateService{
	private CandidateDao candidateDao;
	private ImageService imageService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, ImageService imageService) {
		super();
		this.candidateDao = candidateDao;
		this.imageService = imageService;
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Kişi Eklendi!!!");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(), "Kişiler Görüntülendi!!!");
	}

	@Override
	public DataResult<List<Candidate>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<Candidate> getByCandidateId(int id) {
		return new SuccessDataResult<>(this.candidateDao.findById(id).get());
	}

	@Override
	public Result imageUpload(MultipartFile file) {
		this.imageService.save(file);
		return new SuccessResult("Resim Yükleme Basarılı!!!");
	}


	@Override
	public DataResult<Candidate> getByFirstNameAndLastName(String firstName, String lastName) {
		return new SuccessDataResult<Candidate>
		(this.candidateDao.getByFirstNameAndLastName(firstName, lastName));
	}

	@Override
	public DataResult<List<CandidateWithCvFileDto>> getCandidateWithCvDetails() {
		return new SuccessDataResult<List<CandidateWithCvFileDto>>
		(this.candidateDao.getCandidateWithCvDetails(), "Aday Ayrıntıları Görüntülendi!!!");
	}

	@Override
	public DataResult<List<CandidateWithCvGraduate>> getCandidateCvOrderByGraduateYear() {
		return new SuccessDataResult<List<CandidateWithCvGraduate>>
		(this.candidateDao.getCandidateCvOrderByGraduateYear(), "Bilgiler Yıla Göre Sıralandı!!!");
	
	}

}
