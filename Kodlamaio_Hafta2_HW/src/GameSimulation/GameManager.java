package GameSimulation;

import Players.Player;

public class GameManager implements iGameManage {

	@Override
	public void newGame(Games game, Player player) {
		System.out.println("Yeni oyun oluþturulmuþtur");
		System.out.println("Oyun Adý : " + game.getGame_name());
		System.out.println("Oyun Açýklamasý : " + game.getDescription());
		System.out.println("Oyun Fiyatý : " + game.getPrice());
		System.out.println("Oyunu Alan Kiþi : " + player.getUsername());
	}
}
