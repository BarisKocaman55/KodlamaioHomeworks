package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.JobsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Jobs")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPosting"})
public class Jobs implements JobsEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String job_title;
	
	@OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
	private List<JobPosting> jobPosting;
}
