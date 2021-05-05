package Customer;
import java.util.Date;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private Date date;
	private String nationalId;
	
	public Customer() {
		super();
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.date = null;
		this.nationalId = "";
	}
	
	public Customer(int id, String firstName, String lastName, Date date, String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.nationalId = nationalId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	
}
