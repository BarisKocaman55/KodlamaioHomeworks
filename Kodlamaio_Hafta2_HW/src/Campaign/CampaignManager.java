package Campaign;
import GameSimulation.Games;

public class CampaignManager implements iCampaignManager{

	@Override
	public void addCampaing(Campaign campaign, Games game) {
		System.out.println("Kampanya eklenmiþtir");
		System.out.println("Kampanya Adý : " + campaign.getCampaignName());
		System.out.println("Kampanya Oraný : " + campaign.getCampaignrate());
		double new_price = game.getPrice() - (game.getPrice() * campaign.getCampaignrate() / 100);
		System.out.println("Kampanya Eklenen Oyun : " + game.getGame_name());
		System.out.println("Kampanya Öncesi Oyun Fiyatý : " + game.getPrice());
		System.out.println("Kampanya Sonrasý Oyun Fiyatý : " + new_price);
		System.out.println("--------------");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya Adý : " + campaign.getCampaignName());
		System.out.println("Kampanya Güncellenmiþtir");
		System.out.println("--------------");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Adý : " + campaign.getCampaignName());
		System.out.println("Kampanya Silinmiþtir");
		System.out.println("--------------");
	}
	
}
