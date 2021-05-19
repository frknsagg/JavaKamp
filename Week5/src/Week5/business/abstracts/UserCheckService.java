package Week5.business.abstracts;

import java.util.List;

import Week5.entities.concretes.User;

public interface UserCheckService {
	public boolean check(User user,List<String> emailList);
	public boolean checkMail(User user,List<String> emailList);
	public boolean checkPassword(User user,String password);
	public boolean checkUserInfo(User user,String firstName,String lastName);

}
