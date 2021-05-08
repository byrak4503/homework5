package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface EmailService {
	boolean CheckEmail(User user);
	int sendCode();

}
