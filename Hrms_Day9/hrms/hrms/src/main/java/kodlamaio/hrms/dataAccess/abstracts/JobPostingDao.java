package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{
	List<JobPosting> getByisActiveTrue(); // Aktif İş İlanları
	List<JobPosting> getByisActiveTrueAndEmployer_companyName(String companyName); // Aktif İş İlanı ve Şirket Adına Göre
}
