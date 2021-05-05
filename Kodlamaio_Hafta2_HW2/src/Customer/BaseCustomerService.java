package Customer;

public abstract class BaseCustomerService implements iCustomerManager{
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}
}
