package homework5;

import homework5.business.abstracts.UserService;
import homework5.business.concretes.UserManager;
import homework5.core.GoogleManagerAdapter;
import homework5.dataAccess.concretes.HibernateUserDao;
import homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(),new GoogleManagerAdapter());
		
		
		User user = new User("Burak","BAÞAK","byrak45@gmail.com","123456");
		userService.add(user);

	}

}
