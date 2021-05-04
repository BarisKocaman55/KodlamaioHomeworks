package Loggers;

public class Edevlet_Logger implements Logger{
	@Override
	public void log(String tc, String firstName, String lastName, String birthYear) {
		System.out.println("Doðrulama Bilgileri");
		System.out.println("Tc : " + tc);
		System.out.println("Ýsim - Soyisim : " + firstName + " " + lastName);
		System.out.println("Doðum Yýlý : " + birthYear);
		System.out.println("E-devlet üzerinden doðrulama gerçekleþti!!!");
	}
}
