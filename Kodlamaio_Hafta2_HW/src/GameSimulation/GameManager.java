package GameSimulation;

import Players.Player;

public class GameManager implements iGameManage {

	@Override
	public void newGame(Games game, Player player) {
		System.out.println("Yeni oyun olu�turulmu�tur");
		System.out.println("Oyun Ad� : " + game.getGame_name());
		System.out.println("Oyun A��klamas� : " + game.getDescription());
		System.out.println("Oyun Fiyat� : " + game.getPrice());
		System.out.println("Oyunu Alan Ki�i : " + player.getUsername());
	}
}
