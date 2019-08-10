package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;
import resources.Base;

public class Newcustomerdemo {

	public Newcustomerdemo(WebDriver rdriver) {
		WebDriver ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
		//Log.info("Customer Page Objects created");
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'New Customer')]")
	WebElement txtAddnewcustomer;

	@FindBy(name="name")
	WebElement txtCustomername;
	
	@FindBy(how=How.NAME, using="rad1")
	WebElement optGender;
	
	@FindBy(how=How.NAME, using="dob")
	WebElement dateOfbirth;
	
	@FindBy(how=How.NAME, using="addr")
	WebElement txtAddress;
	
	@FindBy(how=How.NAME, using="city")
	WebElement txtCity;
	
	@FindBy(how=How.NAME, using="state")
	WebElement txtState;
	
	@FindBy(how=How.NAME, using="pinno")
	WebElement numPinnum;
	
	@FindBy(how=How.NAME, using="telephoneno")
	WebElement numMobilenum;
	
	@FindBy(how=How.NAME, using="emailid")
	WebElement txtEmailid;
	
	@FindBy(how=How.NAME, using="password")
	WebElement txtPassword;
	
	@FindBy(how=How.NAME,using="sub")
	WebElement clickSubmit;
	
	public void clickNewcustomer() {
		txtAddnewcustomer.click();
	}
	
	public void setCustomername (String cname) {
		txtCustomername.sendKeys(cname);
	}
	
	public void setGender(String gend) {
		optGender.click();
	}
	
	public void setDatefields(String mm, String dd, String yyyy) {
		dateOfbirth.sendKeys(mm);
		dateOfbirth.sendKeys(dd);
		dateOfbirth.sendKeys(yyyy);
	}
	
	public void setCustaddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}
	
	public void setCity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	
	public void setState(String cstate) {
		txtState.sendKeys(cstate);
	}
	
	public void setPinno(String cpinno) {
		numPinnum.sendKeys(cpinno);
	}
	
	public void setTele(String ctele) {
		numMobilenum.sendKeys(ctele);
	}
	
	public void setEmail(String cemail) {
		txtEmailid.sendKeys(cemail);
	}
	
	public void setPwd(String cpwd) {
		txtPassword.sendKeys(cpwd);
	}
	public void clickSubmit () {
		clickSubmit.click();
	}
}
