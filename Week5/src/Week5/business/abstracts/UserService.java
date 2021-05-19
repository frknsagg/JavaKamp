package Week5.business.abstracts;

import Week5.entities.concretes.User;

public interface UserService {
	
	public void login(String email,String password,User user);
	public void logOut(User user);
	public void register(User user);

}
