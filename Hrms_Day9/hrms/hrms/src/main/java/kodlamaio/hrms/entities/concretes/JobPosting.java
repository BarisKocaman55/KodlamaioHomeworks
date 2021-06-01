package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.JobPostingEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_posting")
public class JobPosting implements JobPostingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false)
	private int id;
	
	@Column(name = "job_description", nullable=false)
	private String jobDescription;
	
	@Column(name = "min_sallary", nullable=true)
	private int minSallary;
	
	@Column(name = "max_sallary", nullable=true)
	private int maxSallary;
	
	@Column(name = "available_pos", nullable=false)
	private int availablePos;
	
	@Column(name = "publish_date", nullable=false)
	private Date publishDate;
	
	@Column(name = "is_active", nullable=false)
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "job_id")
	private Jobs job;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "employer_id")
	private Employer employer;
}
