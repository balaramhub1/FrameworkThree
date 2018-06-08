package uiActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegPage {
	
	@FindBy(id="id_gender1")
	WebElement gender_M;
	
	@FindBy(id="firstname")
	WebElement fname1;
	
	@FindBy(id="lastname")
	WebElement lname1;
	
	@FindBy(id="password")
	WebElement regPass;
	
	@FindBy(id="password-confirmation")
	WebElement regPassConf;
	

}
