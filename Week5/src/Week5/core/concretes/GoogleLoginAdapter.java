package Week5.core.concretes;

import Week5.GoogleAuth.GoogleLogin;
import Week5.core.abstracts.AccountService;

public class GoogleLoginAdapter implements AccountService {

	@Override
	public void loginSocialAccounts(String email, String password) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.login(email, password);
		
	}

}
