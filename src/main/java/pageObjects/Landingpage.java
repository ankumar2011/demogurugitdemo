package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	//By signin=By.cssSelector("a[href*='sign_in']");
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By pagetitle=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navbar=By.xpath("//nav[@class='navbar-collapse collapse']");
	
	public Landingpage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getLogin () {
		return driver.findElement(signin);
	}
	
	public WebElement getPagetitle () {
		return driver.findElement(pagetitle);
	}
	
	public WebElement getNavbar () {
		return driver.findElement(navbar);
	}


}
