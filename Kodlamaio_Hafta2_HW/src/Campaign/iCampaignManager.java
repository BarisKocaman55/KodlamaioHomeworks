package Campaign;
import GameSimulation.Games;

public interface iCampaignManager {
	public void addCampaing(Campaign campaign, Games game);
	public void updateCampaign(Campaign campaign);
	public void deleteCampaign(Campaign campaign);
}
