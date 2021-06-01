package kodlamaio.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateWithCvGraduate {
	private int id;
	private String firstName;
	private String lastName;
	private String university;
	private String department;
	private int educationFinishDate;
	private boolean graduateStatus;
}
