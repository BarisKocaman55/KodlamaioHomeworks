package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvFile;

public interface CvDao extends JpaRepository<CvFile, Integer>{
	
}
