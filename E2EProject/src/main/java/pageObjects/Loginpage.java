package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	public WebDriver driver;
	
	By emailId=By.cssSelector("input[id='user_email']");
	By userPwd=By.cssSelector("input[id='user_password']");
	By loginButton=By.cssSelector("input[value='Log In']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getEmail () {
		return driver.findElement(emailId);
	}
	public WebElement getPwd () {
		return driver.findElement(userPwd);
	}
	public WebElement clickLogin () {
		return driver.findElement(loginButton);
	}


}
