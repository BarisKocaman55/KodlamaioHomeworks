package Loggers;

public class Edevlet_Logger implements Logger{
	@Override
	public void log(String tc, String firstName, String lastName, String birthYear) {
		System.out.println("Do�rulama Bilgileri");
		System.out.println("Tc : " + tc);
		System.out.println("�sim - Soyisim : " + firstName + " " + lastName);
		System.out.println("Do�um Y�l� : " + birthYear);
		System.out.println("E-devlet �zerinden do�rulama ger�ekle�ti!!!");
	}
}
