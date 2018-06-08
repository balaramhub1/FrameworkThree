package uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// This class will have all the elements of HomePage of 
	// http://automationpractice.com/index.php
	
	public static final Logger log= Logger.getLogger(HomePage.class.getName());
	
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement loginEmailAddress;
	
	@FindBy(id="passwd")
	WebElement loginPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement submitButton;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")
	WebElement authenticationFailed;
		
	@FindBy(id="email_create")
	WebElement regEmail;
	
	@FindBy(id="SubmitCreate")
	WebElement creatAccBtn;
	
	
	
	public HomePage(WebDriver dr){
		PageFactory.initElements(dr, this);
	}
	
	public void loginToApplication(String emailAddress,String password){
		
		signIn.click();
		log.info("Clicked on signIn and Object is :"+signIn.toString());
		
		loginEmailAddress.sendKeys(emailAddress);
		log.info("Entered email adderss :"+emailAddress+" and Object is :"+loginEmailAddress.toString());
		
		loginPassword.sendKeys(password);
		log.info("Entered Password : "+password +" and Object is : "+loginPassword.toString());
		
		submitButton.click();
		log.info("Clicked Submit button and Object is :"+submitButton.toString());
		
	}
	
	public String getInvalidLoginText(){
		log.info("Error Message is : "+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
	public void goToRegistration(String regmail){
		signIn.click();
		regEmail.sendKeys(regmail);
		creatAccBtn.click();
		
	}
	
}
