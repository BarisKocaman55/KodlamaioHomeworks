package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concretes.CvFile;

@Service
public class CvManager implements CvService{
	private CvDao cvDao;

	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<CvFile>> getAll() {
		return new SuccessDataResult<List<CvFile>>
		(this.cvDao.findAll(), "Tüm Cv'ler Görüntülendi!!!");
	}
}
