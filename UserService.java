package homework5.business.abstracts;

import java.util.List;

import homework5.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();

}
