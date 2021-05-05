package Main;
import java.util.Date;

import Customer.*;

public class Main {

	public static void main(String[] args) {
		
		Date date = new Date(1999, 2, 7);
		Customer customer = new Customer(1, "Baris", "Kocaman", date, "1434321412");
		

		CustomercheckService customerCheckService = new StarbucsCustomerManager(new MernisManager());
		iCustomerManager customerManager = new StarbucsCustomerManager(customerCheckService);
		customerManager.save(customer);
	}

}
