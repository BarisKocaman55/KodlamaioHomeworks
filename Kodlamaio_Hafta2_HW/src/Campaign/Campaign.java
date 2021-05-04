package Campaign;

public class Campaign {
	private int id;
	private String campaignName;
	private int campaignrate;
	
	public Campaign() {
		this.id = 0;
		this.campaignName = "";
		this.campaignrate = 0;
	}
	
	public Campaign(int id, String campaignName, int campaignrate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignrate = campaignrate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getCampaignrate() {
		return campaignrate;
	}

	public void setCampaignrate(int campaignrate) {
		this.campaignrate = campaignrate;
	};
	
	
}
