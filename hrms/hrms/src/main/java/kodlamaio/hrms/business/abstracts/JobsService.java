package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jobs;

public interface JobsService {
	public List<Jobs> getAll();
}
