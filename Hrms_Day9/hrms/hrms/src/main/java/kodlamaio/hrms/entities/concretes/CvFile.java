package kodlamaio.hrms.entities.concretes;


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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonBackReference;

import kodlamaio.hrms.entities.abstracts.CvFileEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_file")
public class CvFile implements CvFileEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int cv_id;
	
	@Column(name = "cv_ref")
	private int cv_ref;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "department")
	private String department;
	
	@Min(1980)
	@Max(2021)
	@Column(name = "education_start_date")
	private int educationStartDate;
	
	@Min(1980)
	@Max(2021)
	@Column(name = "education_finish_date")
	private int educationFinishDate;
	
	@Column(name = "graduate_status")
	private boolean graduateStatus;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "position_name")
	private String position_name;
	
	@Min(1980)
	@Max(2021)
	@Column(name = "work_start_date")
	private int work_start_date;
	
	@Min(1980)
	@Max(2021)
	@Column(name = "work_finish_date")
	private int work_finish_date;
	
	@Column(name = "experience")
	private int experience = getExperience();
	
	@Column(name = "languages")
	private String languages;
	
	@Min(1)
	@Max(5)
	@Column(name = "language_status")
	private int languageStatus;
	
	@Column(name = "github")
	private String github;
	
	@Column(name = "linkedln")
	private String linkedln;
	
	@Column(name = "cover_letter")
	private String cover_letter;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "candidate_id")
	@JsonBackReference
	private Candidate candidate;
	
	public int getExperience() {
		return this.work_finish_date - this.work_start_date;
	}
	
}
