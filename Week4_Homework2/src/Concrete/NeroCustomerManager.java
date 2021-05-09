package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager  {
	
private CustomerCheckService _customerCheckService;
	
	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	public void save(Customer customer) {
		if(_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else
		{
			System.out.println("Not a valid person");
		}
	}

	

}
