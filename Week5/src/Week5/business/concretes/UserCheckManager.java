package Week5.business.concretes;

import java.util.List;
import java.util.regex.Pattern;


import Week5.business.abstracts.UserCheckService;
import Week5.business.abstracts.UserService;
import Week5.business.abstracts.VerifyService;
import Week5.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	private VerifyService verifyService;
	

	

	

	@Override
	public boolean check(User user,List<String> emailList) {
		
		if (this.checkMail(user, emailList) && this.checkPassword(user, user.getPassword())&&
				this.checkUserInfo(user, user.getFirstName(), user.getLastName())) {
			System.out.println("Doğrulama maili gönderildi "+user.getEmail() );
			
			
			return true;
			
		} else {
			return false;

		}
		
		
		
	}

	@Override
	public boolean checkMail(User user, List<String> emailList) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		for(String string : emailList) {
			if(string == user.getEmail()) {
				System.out.println("Bu mail adresi daha önce kullanılmış");
				return false;
			}
		}
		
		
		if (!Pattern.matches(regex, user.getEmail())) {
			System.out.println("Lütfen geçerli bir e-posta adresi giriniz");
			return false;
		}
		else {
			return true;
		}
		
		
		
		
		
	}

	@Override
	public boolean checkPassword(User user, String password) {
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden oluşmalıdır");
			return false;
			
		} else {
			return true;

		}
		
	}

	@Override
	public boolean checkUserInfo(User user, String firstName, String lastName) {
		if (firstName.length()<3) {
			System.out.println("Adınız 3 karakterden az olamaz.");
			return false;
			
		}
		else if(lastName.length()<3) {
			System.out.println("Soyadınız 3 karakterden az  olamaz.");
			return false;
			
		}
		else {
			return true;

		}
		
	}

}
