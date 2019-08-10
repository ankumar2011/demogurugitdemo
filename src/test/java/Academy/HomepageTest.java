package Academy;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.Base;

public class HomepageTest extends Base{
	@BeforeTest
	public void Initialize () throws IOException, InterruptedException {
//		driver=InitializeDriver();
		Thread.sleep(3000);
	    driver.get(prop.getProperty("url"));
	    Thread.sleep(3000);
	 }

	@Test
	public void basePageNavigation () throws IOException, InterruptedException {

	Landingpage l=new Landingpage (driver);
	l.getLogin().click();
	Loginpage lp=new Loginpage(driver);
	lp.getEmail().sendKeys("nagendra@gmail.com");
	lp.getPwd().sendKeys("pwd123");
	lp.clickLogin().submit();
	
	}

	@AfterTest
	public void teardown () {
		driver.close();
		driver=null;
	}
	
}