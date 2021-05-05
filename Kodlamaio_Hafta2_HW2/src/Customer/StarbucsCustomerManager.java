package Customer;

public class StarbucsCustomerManager extends BaseCustomerService{
	
	private CustomerCheckService checkCustomer;
	
	public StarbucsCustomerManager(CustomerCheckService checkCustomer) {
		this.checkCustomer =  checkCustomer;
	}
	
	public void save(Customer customer) {
		if(checkCustomer.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			System.out.println("Hata");
		}
	}
}
