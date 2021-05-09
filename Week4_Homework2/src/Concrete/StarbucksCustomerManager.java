package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
		
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (_customerCheckService.checkIfRealPerson(customer)) {
			this.save(customer);
			
		} else {
			System.out.println("Not a valid person");

		}
		
		
		
	}
	
	
	

}
