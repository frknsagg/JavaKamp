package Week5;

import Week5.business.concretes.UserCheckManager;
import Week5.business.concretes.UserManager;
import Week5.business.concretes.VerifyManager;
import Week5.dataAccess.abstracts.UserDao;
import Week5.dataAccess.concretes.HibernateUserDao;
import Week5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User(1,"Furkan","Sağ","123456","furkan@gmail.com");
		User user2=new User(2,"Ahmet","Mehmet","123456","ahmet@gmail.com");
		User user3=new User(3,"Veli","Veli","123456","veli@gmail.com");
		User user4=new User(4,"Ayşe","Ayşe","123456","ayse@gmail.com");
		User user5=new User(5,"Zehra","Zehra","123456","zehra@gmail.com");
		User user6=new User(6,"Zehra","Zehra","123456","zehra@gmail.com");
		
		
		
		
		
		UserManager userManager=new UserManager(new HibernateUserDao(), new UserCheckManager(),
				new VerifyManager());
		
	    
		
		UserDao userDao=new HibernateUserDao();
		userManager.register(user1);//başarılı kayıt 
		userManager.register(user5);//başarılı kayıt
		userManager.register(user6);//başarısız kayıt
		userManager.login("furkan@gmail.com", "123456", user1); // başarılı giriş
		userManager.logOut(user1);//başarılı çıkış
		userManager.login("asdasd", "sdsdfsdf", user2);//başarısız giriş
		
		
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}


