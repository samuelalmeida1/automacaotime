package elemento;

import org.openqa.selenium.By;

public class Elementos {
	
	private By username = By.xpath("//input[@id='user-name']");
    private By password = By.xpath("//input[@id='password']");
    private By login = By.xpath("//input[@id='login-button']");
	
	
	

	



	public By getLogin() {
		return login;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}
	
	

		

}
