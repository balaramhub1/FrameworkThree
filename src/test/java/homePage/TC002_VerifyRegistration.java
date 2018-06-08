package homePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testBase.TestBase;
import uiActions.HomePage;

public class TC002_VerifyRegistration extends TestBase{
	
	// for website http://magento.softwaretestingboard.com
	
	HomePage homepage;
	@BeforeClass
	public void setUp(){
		init();
		drv.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		drv.findElement(By.id("email_create")).sendKeys("fname32@add.com");
		findAccCreateBtn().click();
		drv.findElement(By.id("email_create")).sendKeys("fname32@add.com");
		findAccCreateBtn().click();
	}
	
	@Test
	public void verifyRegistration() throws InterruptedException{
		
		drv.findElement(By.id("id_gender1")).click();
		drv.findElement(By.id("customer_firstname")).sendKeys("fnamea");
		drv.findElement(By.id("customer_lastname")).sendKeys("lnamea");
		//drv.findElement(By.id("email_address")).sendKeys("");
		drv.findElement(By.id("passwd")).sendKeys("Test_pass");
		drv.findElement(By.id("address1")).sendKeys("india");
		drv.findElement(By.id("city")).sendKeys("india");
		Select cityState=new Select(drv.findElement(By.id("id_state")));
		cityState.selectByVisibleText("California");
		drv.findElement(By.id("postcode")).sendKeys("00000");
		drv.findElement(By.id("phone_mobile")).sendKeys("9898989898");
		drv.findElement(By.id("alias")).sendKeys("indiaalias");
		drv.findElement(By.id("submitAccount")).click();
		Thread.sleep(3000);
		
	}
	
	public WebElement findAccCreateBtn(){
		List<WebElement> wl=drv.findElements(By.tagName("button"));
		return wl.get(2);
	}
	
	@AfterClass
	public void endTest(){
		drv.quit();
	}

}
