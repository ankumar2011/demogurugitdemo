package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	
	public static WebDriver driver;
	public static Logger Log=LogManager.getLogger(Base.class.getName());
	public Properties prop;
	FileInputStream fis;
	
	@BeforeClass
	public void Setup() throws IOException  {

		prop=new Properties ();
		fis=new FileInputStream ("C:\\Users\\Nagendra\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");		
		if (browser.equals ("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver ();
		}
		else
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver ();
		}
		else
		if (browser.contentEquals("IE")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgeserver.exe");
			driver=new InternetExplorerDriver ();
		}
		Log.info("Driver Initialized");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@AfterClass
	public void tearDown () {
		driver.quit ();
	}

	public void getScreenshot (String result) throws Exception{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\selenium\\screenshots"+result+"screenshot.png"));
	}
}
