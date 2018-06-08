package testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static final Logger log= Logger.getLogger(TestBase.class.getName());
	// Logger object has to be created in each test class, passing the classname.class as parameter.
	
	// BASE class to house all common functions
	
	public WebDriver drv;
	String url="http://automationpractice.com/index.php";
	String browser="firefox";
	
	public void init(){
		
		String log4jConfPath="log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		selectBrowser(browser);
		getUrl(url);
		
		
		
	}
	/*
	 * Method to select the driver based on type of Browser.
	 * 
	 */
	public void selectBrowser(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			log.info("Creating object of : "+browser);
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			drv=new FirefoxDriver();

			
		}else if(browser.equalsIgnoreCase("chrome")){
			log.info("Creating object of : "+browser);
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			drv=new ChromeDriver();
			
		}
	}
	
	public void getUrl(String url){
		log.info("Navigating to : "+url);
		drv.get(url);
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
