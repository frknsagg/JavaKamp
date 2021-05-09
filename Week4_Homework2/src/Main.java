import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;




public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		
		
		customerManager.save(new Customer(1, "Furkan", "Sað", new Date(1998, 11, 18), "1111111111"));
		System.out.println("");
		
		

	}

}
