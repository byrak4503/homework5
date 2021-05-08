package homework5.business.concretes;

import java.util.List;
import homework5.business.abstracts.UserService;
import homework5.core.GoogleService;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;
import homework5.dataAccess.concretes.HibernateUserDao;


public class UserManager implements UserService {
	private UserDao userDao;
	private GoogleService googleService;
	
	
	
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		this.userDao = userDao;
		this.googleService=googleService;
		
		
		
		
	}

	@Override
	public void add(User user) {
		if (user.getPassword().length()>=6 && user.getName().length()>=2 && user.getSurname().length()>=2) {
			System.out.println("Kullanýcý eklendi : "+user.getName()+" "+user.getSurname());
			this.googleService.signToSystem("Google ile kayýt edildi : " + user.getName()+" "+user.getSurname());
			return;
			
		}else {
			System.out.println("Kullanýcý eklenemedi.Bilgileri kontrol ediniz.");
		}
		
		
		
		
		
	}
	
	

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
