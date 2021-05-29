package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobsService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobsDao;
import kodlamaio.hrms.entities.concretes.Jobs;

@Service
public class JobsManager implements JobsService{
	private JobsDao jobsDao;
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}

	@Override
	public DataResult<List<Jobs>> getAll() {
		return new SuccessDataResult<List<Jobs>>
		(this.jobsDao.findAll(), "İşler Görüntülendi!!!");
	}

	@Override
	public Result add(Jobs job) {
		this.jobsDao.save(job);
		return new SuccessResult("İş Eklendi!!!");
	}
	
}
