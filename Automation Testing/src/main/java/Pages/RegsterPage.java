package Pages;




import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class RegsterPage extends PageBase {

	public RegsterPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[1]/input")
	WebElement nameText;
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[2]/input")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[3]/input")
	WebElement phonenumber;
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[4]/input")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[5]/input")
	WebElement confrimpassword;
	@FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/button")
	WebElement submit;
	
	public void NewUserSignup(String name , String emaill,String phonnumberr,String pass ,String conpass) {
		nameText.sendKeys(name);
		email.sendKeys(emaill);
		phonenumber.sendKeys(phonnumberr);
		password.sendKeys(pass);
		confrimpassword.sendKeys(conpass);
		submit.click();
		
	}
	
	
	
}