package Players;

import Loggers.Logger;
import Loggers.Utils;

public class PlayerManager {
	private Logger[] loggers;
	
	public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void register(Player player) {
		System.out.println("Kullan�c� Ad� : " + player.getUsername());
		System.out.println("�ifre : " + player.getPassword());
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
	
	public void updateAccount(Player player) {
		System.out.println("Kullan�c� Ad� : " + player.getUsername());
		System.out.println("�ifre : " + player.getPassword());
		System.out.println("Hesap G�ncellenmi�tir!!!");
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
	
	public void deleteAccount(Player player) {
		System.out.println("Kullan�c� Ad� : " + player.getUsername());
		System.out.println("�ifre : " + player.getPassword());
		System.out.println("Hesap Silinmi�tir");
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
}
