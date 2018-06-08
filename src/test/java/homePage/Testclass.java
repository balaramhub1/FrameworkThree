package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass {
	
	WebDriver dr;
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
		dr=new FirefoxDriver();
		dr.get("https://www.shopclues.com/");
		
	}
	
	@Test
	public void Login() throws InterruptedException{
		dr.findElement(By.xpath("/html/body/div[4]/div/div/div[4]/ul/li[6]/a")).click();
		dr.findElement(By.xpath("//*[@id='login_button']")).click();
		
		
	}
	
	@AfterTest
	public void endTest() throws InterruptedException{
		Thread.sleep(4000);
		dr.close();
	}

}
