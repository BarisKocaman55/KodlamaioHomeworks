package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService{
	
	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}
	
	@Override
	public Result add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("İş Ekleme Başarıyla Gerçekleşti!!!");
	}

	@Override
	public Result delete(int id) {
		if(!this.getById(id).getData().isActive()) {
			return new SuccessResult("İş İlanı Başarıyla Kaldırıldı!!!");
		}
		else {
			return new ErrorResult("İş İlanı Kaldırma Başarısız!!!");
		}
	}

	@Override
	public Result Update(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("İş İlanı Güncellemesi Başarılı!!!");
	}

	@Override
	public DataResult<List<JobPosting>> getByIsActiveAndSortedByPublishDate() {
		Sort sort = Sort.by(Sort.Direction.DESC, "publishDate");
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findAll(sort), "Aktif Olan İş İlanları Tarihe Göre Sıralanmıştır!!!");
	}

	@Override
	public DataResult<List<JobPosting>> getByisActiveTrue() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByisActiveTrue(), "Aktif Olan İş İlanları Görüntülenmektedir!!!");
	}

	@Override
	public DataResult<List<JobPosting>> getByisActiveTrueAndEmployer_companyName(String companyName) {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.getByisActiveTrueAndEmployer_companyName(companyName), "Aktif Olan İş İlanları Şirket İsmine Göre Görüntülenmektedir!!!");
	}

	@Override
	public DataResult<JobPosting> getById(int id) {
		return new SuccessDataResult<JobPosting>
		(this.jobPostingDao.getOne(id));
	}

	@Override
	public DataResult<List<JobPosting>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		return new SuccessDataResult<List<JobPosting>>
		(this.jobPostingDao.findAll());
	}

	

}
