package homework5.business.concretes;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homework5.business.abstracts.EmailService;
import homework5.entities.concretes.User;

public class EmailManager implements EmailService {
	
	int verificationCode;
	
	public EmailManager() {
		Random a=new Random();
		this.verificationCode= a.nextInt(1000)*10;
	}
	
	
	String mail = "byrak45@gmail.com";
	
	Pattern pattern = Pattern.compile("@gmail");
	Matcher matcher = pattern.matcher(mail);
	@Override
	public boolean CheckEmail(User user) {
		if (matcher.find()) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public int sendCode() {
		return this.verificationCode;
		
	}
	
	
	
	

}
