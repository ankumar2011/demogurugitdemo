package Academy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class validateNavigationBarTest extends Base {
	public static Logger Log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void Initialize () throws IOException, InterruptedException {
//		driver=InitializeDriver();
		Log.info("Driver is initialized");
		Thread.sleep(3000);
	    driver.get(prop.getProperty("url"));
	    Log.info("Navigated to home page");
	    Thread.sleep(5000);
	}
	
	@Test
	public void validateBar () throws IOException {
		Landingpage l=new Landingpage (driver);
		Assert.assertTrue(l.getNavbar().isDisplayed());
		Log.info("Successfully validated the navigation bar");
	}

	@AfterTest
	public void teardown () {
		driver.close();
		driver=null;
	}
}
