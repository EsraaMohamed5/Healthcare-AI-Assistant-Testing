package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	protected  WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name= "email")
	WebElement emailTxt;
	
	@FindBy(name ="password")
	WebElement passwordTxt;
	
	 @FindBy(xpath  ="//*[@id=\"root\"]/main/div/div/div[2]/form/button")
	 WebElement submitBtn;
	 @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/h2")
	 WebElement errorMessage;

	 @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/button")
	 WebElement logout;

	
	 public void userCanLogin(String email, String password) {
		    emailTxt.clear();
		    emailTxt.sendKeys(email);

		    passwordTxt.clear();
		    passwordTxt.sendKeys(password);

		    submitBtn.click();
		}
	 
		    
		public String getErrorMessage() {
		    return errorMessage.getText();
		}
		

		
		public void userCanLogout() {
			logout.click();
		}
	
}
