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
						System.out.println("Giri� i�lemi ba�ar�l� "+user.getEmail());
						user.setIsLogin(true);
					}
					else {
						System.out.println("Yanl�� �ifre");
					}
				}
				else {
					System.out.println("B�yle bir kullan�c� kay�tl� de�il");
				}
				
			}
			
		}
		
		else {
		System.out.println("i�lem ba�ar�s�z");
	}
		
		
	}

	@Override
	public void logOut(User user) {
		if (user.getIsLogin()) {
			user.setIsLogin(false);
			System.out.println("��k�� yap�ld� "+ user.getEmail());
			
		}
		else {
			System.out.println("Kullan�c� zaten oturum a�mam��");
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
			System.out.println("Kullan�c� bilgileri hatal�");
		}
		
		
	}

}
