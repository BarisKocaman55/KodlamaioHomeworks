package Players;

import Loggers.Logger;
import Loggers.Utils;

public class PlayerManager {
	private Logger[] loggers;
	
	public PlayerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	public void register(Player player) {
		System.out.println("Kullanýcý Adý : " + player.getUsername());
		System.out.println("Þifre : " + player.getPassword());
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
	
	public void updateAccount(Player player) {
		System.out.println("Kullanýcý Adý : " + player.getUsername());
		System.out.println("Þifre : " + player.getPassword());
		System.out.println("Hesap Güncellenmiþtir!!!");
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
	
	public void deleteAccount(Player player) {
		System.out.println("Kullanýcý Adý : " + player.getUsername());
		System.out.println("Þifre : " + player.getPassword());
		System.out.println("Hesap Silinmiþtir");
		System.out.println("-----------");
		Utils.RunLoggers(loggers, player.getTc(), player.getFirstName(), player.getLastName(), player.getBirthYear());
	}
}
