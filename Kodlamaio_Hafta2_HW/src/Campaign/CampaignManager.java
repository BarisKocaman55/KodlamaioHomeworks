package Campaign;
import GameSimulation.Games;

public class CampaignManager implements iCampaignManager{

	@Override
	public void addCampaing(Campaign campaign, Games game) {
		System.out.println("Kampanya eklenmi�tir");
		System.out.println("Kampanya Ad� : " + campaign.getCampaignName());
		System.out.println("Kampanya Oran� : " + campaign.getCampaignrate());
		double new_price = game.getPrice() - (game.getPrice() * campaign.getCampaignrate() / 100);
		System.out.println("Kampanya Eklenen Oyun : " + game.getGame_name());
		System.out.println("Kampanya �ncesi Oyun Fiyat� : " + game.getPrice());
		System.out.println("Kampanya Sonras� Oyun Fiyat� : " + new_price);
		System.out.println("--------------");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya Ad� : " + campaign.getCampaignName());
		System.out.println("Kampanya G�ncellenmi�tir");
		System.out.println("--------------");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Ad� : " + campaign.getCampaignName());
		System.out.println("Kampanya Silinmi�tir");
		System.out.println("--------------");
	}
	
}
