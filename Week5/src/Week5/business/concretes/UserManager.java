package Week5.business.concretes;

import Week5.business.abstracts.UserCheckService;
import Week5.business.abstracts.UserService;
import Week5.business.abstracts.VerifyService;
import Week5.dataAccess.abstracts.UserDao;
import Week5.dataAccess.concretes.HibernateUserDao;
import Week5.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private UserCheckService userCheckService;
	private VerifyService verifyService;
	

	public UserManager(UserDao userDao, UserCheckService userCheckService, VerifyService verifyService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.verifyService = verifyService;
	}

	@Override
	public void login(String email, String password,User user) {
		if (!user.getIsLogin()) {
			for (String emailList : userDao.getEmailList()) {
				System.out.println(emailList);
				if (emailList==email) {
					if (password==user.getPassword()) {
						System.out.println("Giriþ iþlemi baþarýlý "+user.getEmail());
						user.setIsLogin(true);
					}
					else {
						System.out.println("Yanlýþ þifre");
					}
				}
				else {
					System.out.println("Böyle bir kullanýcý kayýtlý deðil");
				}
				
			}
			
		}
		
		else {
		System.out.println("iþlem baþarýsýz");
	}
		
		
	}

	@Override
	public void logOut(User user) {
		if (user.getIsLogin()) {
			user.setIsLogin(false);
			System.out.println("Çýkýþ yapýldý "+ user.getEmail());
			
		}
		else {
			System.out.println("Kullanýcý zaten oturum açmamýþ");
		}
		
	}

	@Override
	public void register(User user) {
		 if (userCheckService.check(user, userDao.getEmailList())) {
			 
			if (verifyService.verifyEmailLink()) {
				this.userDao.add(user);
				
			}	

		}
		 else {
			System.out.println("Kullanýcý bilgileri hatalý");
		}
		
		
	}

}
