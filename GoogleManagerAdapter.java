package homework5.core;

import homework5.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void signToSystem(String message) {
		GoogleManager manager = new GoogleManager();
		manager.signGoogle(message);
		
	}

}
