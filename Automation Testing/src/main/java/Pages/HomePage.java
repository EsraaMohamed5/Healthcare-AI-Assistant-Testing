package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

 
    @FindBy(xpath = "//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[1]")
    private WebElement loginBtn;


    @FindBy(xpath = "//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[2]")
    private WebElement registerBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[3]")
    private WebElement apply;

    public void openLoginPage() {
        loginBtn.click();
    }

    public void openRegisterPage() {
        registerBtn.click();
    }
    public void openapply() {
       apply.click();
    }
}
