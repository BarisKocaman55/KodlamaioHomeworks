package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobs;

public interface JobsService {
	public DataResult<List<Jobs>> getAll();
	public Result add(Jobs job);
}
