package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Loginpagedemo;
import resources.Base;

public class TC1_LoginpageTest_01 extends Base {

	@Test
	public void Logintest () throws IOException, InterruptedException {
		System.out.println("This is the First Testcase");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Loginpagedemo lpd=new Loginpagedemo (driver);
		lpd.setUsername(prop.getProperty("username"));
		lpd.setPassword(prop.getProperty("password"));
		lpd.clickSubmit();
		Thread.sleep(3000);
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			Assert.assertTrue(true);
			Log.info("Login Test passed");
		}
		else 
		{
			Assert.assertTrue(false);
			Log.info("Login Test failed");
		}			
	}
	
}
