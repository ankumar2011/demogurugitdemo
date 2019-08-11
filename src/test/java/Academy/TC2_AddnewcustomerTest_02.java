package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Loginpagedemo;
import pageObjects.Newcustomerdemo;
import resources.Base;

public class TC2_AddnewcustomerTest_02 extends Base{
	
	@Test
	public void Addcustomer () throws Exception {
		System.out.println("This is the Second Testcase");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Loginpagedemo lp=new Loginpagedemo (driver);
		lp.setUsername(prop.getProperty("username"));
		lp.setPassword(prop.getProperty("password"));
		lp.clickSubmit();
		Newcustomerdemo nc=new Newcustomerdemo (driver);
		nc.clickNewcustomer();
		nc.setCustomername("ndaagendraaa");
		nc.setGender("f");
		nc.setDatefields("15", "12", "2012");
		nc.setCustaddress("SNasgarrr");
		nc.setCity("Bloreers");
		nc.setState("Karnatakaa");
		nc.setPinno("343673");
		nc.setTele("5474844395");
		nc.setEmail("nag24444@gmail.com");
		nc.setPwd("nagnagnagnag3");
		Thread.sleep (5000);
		nc.clickSubmit();
		
		Thread.sleep (3000);
		boolean res=driver.getPageSource().contains("Customer Registered Successfully");
		if (res==true) {
			Assert.assertTrue(true);
		}
		else {
			getScreenshot ("addNewCusomer");
			Assert.assertTrue(false);
			
		}
				
	}	
	}
