package Players;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private String tc;
	private String birthYear;
	private String username;
	private String password;
	
	public Player() {
		this.id = 0;
		this.firstName = "";
		this.lastName = "";
		this.tc = "";
		this.birthYear = "";
		this.username = "";
		this.password = "";
	}

	public Player(int id, String firstName, String lastName, String tc, String birthYear, String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tc = tc;
		this.birthYear = birthYear;
		this.username = username;
		this.password = password;
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

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
