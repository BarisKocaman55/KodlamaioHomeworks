package Main;

import Campaign.Campaign;
import Campaign.CampaignManager;
import GameSimulation.GameManager;
import GameSimulation.Games;
import Loggers.Edevlet_Logger;
import Loggers.Logger;
import Players.Player;
import Players.PlayerManager;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new Edevlet_Logger()};
		
		PlayerManager playerManager = new PlayerManager(loggers);
		Player player = new Player(1, "Barýþ", "Kocaman", "12345678911", "1999", "barisqo", "123");
		
		Games game = new Games(1, "Best Game", "Eðlencenin Doruðu", 250);
		GameManager gameManager = new GameManager();
		
		Campaign campaign = new Campaign(1, "Büyük Ýndirim", 20);
		CampaignManager campaignManager = new CampaignManager();
		
		playerManager.register(player);
		System.out.println("-----------");
		gameManager.newGame(game, player);
		System.out.println("-----------");
		campaignManager.addCampaing(campaign, game);
		
		
	}

}
