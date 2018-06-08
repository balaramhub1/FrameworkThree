package homePage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testBase.TestBase;
import uiActions.HomePage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{
	
	public static final Logger log= Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	
	// Driver inherited from TestBase class
	HomePage homepage;
	
	@BeforeTest
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials(){
		// create object of homepage class
		
		log.info("*************Starting verifyLoginWithInvalidCredentials Test*************");
		homepage=new HomePage(drv);
		homepage.loginToApplication("test@gmail.com", "passwordq23e");
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		
		log.info("*************Finished verifyLoginWithInvalidCredentials Test*************");
	}

	@AfterClass
	public void endTest() throws InterruptedException{
		Thread.sleep(4000);
		drv.close();
		
	}
}
