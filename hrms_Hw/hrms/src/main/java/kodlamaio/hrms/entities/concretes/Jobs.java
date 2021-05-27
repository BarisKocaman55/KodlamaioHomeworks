package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.JobsEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="Jobs")
public class Jobs implements JobsEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String job_title;
	
	public Jobs() {
		
	}
	
	public Jobs(int id, String job_title) {
		super();
		this.id = id;
		this.job_title = job_title;
	}
}
