package Week5.business.concretes;

import Week5.business.abstracts.VerifyService;
import java.util.Scanner;
import Week5.entities.concretes.User;

public class VerifyManager implements VerifyService {

	Scanner isVerify=new Scanner(System.in);
	@Override
	public boolean verifyEmailLink() {
		boolean isClick=isVerify.nextBoolean();
		
		if (isClick) {
			System.out.println("Do�rulama i�lemi ba�ar�l�");
			return true;
			
		} else {
			System.out.println("Do�rulama i�lemi ba�ar�s�z");
			return false;

		}
	}

	


}
