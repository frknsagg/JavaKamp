package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean serviceResult = false;
		try{
			serviceResult = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), 
				customer.getDateOfBirth().getYear());
		}
			
		catch(Exception e) {
			System.out.println("Not a valid person");
			}
		return serviceResult;
		
	}

}
