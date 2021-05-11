package Adapter;

import Abstract.MemberCheckService;
import Entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MemberCheckService {

	@Override
	public boolean checkIfRealPeron(Member member) {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			result=kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(member.getNationalityId()),
					member.getFirstName().toUpperCase(),
					member.getLastName().toUpperCase(),
					member.getDateOfBirth().getYear());
		} catch (Exception e) {
			System.out.println("Hatalý kimlik bilgisi");
		}
		
		return result;
	}

}
