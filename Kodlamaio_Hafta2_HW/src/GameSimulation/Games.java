package GameSimulation;

public class Games {
	private int id;
	private String game_name;
	private String description;
	private double price;
	
	public Games() {
		this.id = 0;
		this.game_name = "";
		this.description = "";
		this.price = 0;
	}
	
	public Games(int id, String game_name, String description, double price) {
		this.id = id;
		this.game_name = game_name;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGame_name() {
		return game_name;
	}

	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
