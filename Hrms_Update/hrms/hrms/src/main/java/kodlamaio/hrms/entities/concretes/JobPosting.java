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
@Table(name = "jobPosting")
public class JobPosting implements JobPostingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable=false)
	private int id;
	
	@Column(name = "jobDescription", nullable=false)
	private String jobDescription;
	
	@Column(name = "minSallary", nullable=true)
	private int minSallary;
	
	@Column(name = "maxSallary", nullable=true)
	private int maxSallary;
	
	@Column(name = "availablePos", nullable=false)
	private int availablePos;
	
	@Column(name = "publishDate", nullable=false)
	private Date publishDate;
	
	@Column(name = "isActive", nullable=false)
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "jobId")
	private Jobs job;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "cityId")
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "employerId")
	private Employer employer;
}
