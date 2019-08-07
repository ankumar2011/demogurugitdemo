package Academy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class validatePagetitleTest extends Base{
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
	public void validateTitle () throws IOException {
		Landingpage l=new Landingpage (driver);
		Assert.assertEquals(l.getPagetitle().getText(), "FEATURED COURSES");
//		Log.info("Successfully validated the page title");
	}


	@AfterTest
	public void teardown () {
		driver.close();
		driver=null;
	}
}
