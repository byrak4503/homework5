package homework5.dataAccess.concretes;
import java.util.List;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	public HibernateUserDao() {
		
	}
	

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : "+user.getName()+" "+user.getSurname());
		
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
