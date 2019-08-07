package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Base;

public class Loginpagedemo extends Base{
	
	public Loginpagedemo(WebDriver rdriver) {
		WebDriver ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		Log.info("LoginPage objects are defined here");
	}
	
	@FindBy(name="uid")
	WebElement txtUsername;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement clickLogin;
	
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);
		
	}
	
	public void setPassword(String pword) {
		txtPassword.sendKeys(pword);
	}

	public void clickSubmit() {
		clickLogin.submit();
	}
}
