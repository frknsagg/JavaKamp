package Week5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Week5.dataAccess.abstracts.UserDao;
import Week5.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User>userList=new ArrayList<User>();
	List<String>emailList=new ArrayList<String>();
	

	@Override
	public void add(User user) {
		userList.add(user);
		emailList.add(user.getEmail());
		
		System.out.println("Hibernate ile eklendi "+user.getEmail());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getEmailList() {
		// TODO Auto-generated method stub
		return this.emailList;
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return this.userList;
	}

}
