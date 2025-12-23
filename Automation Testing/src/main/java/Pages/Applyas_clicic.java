package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Applyas_clicic extends PageBase {

    public Applyas_clicic(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[1]/div/input")
    WebElement clinicname;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[2]/div/input")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[3]/div/input")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[4]/div/input")
    WebElement governrate;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[5]/div/input")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[6]/div/input")
    WebElement address;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[7]/div/input")
    WebElement phone;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/div[8]/div/select")
    WebElement specialization;

    @FindBy(xpath = "//*[@id=\"root\"]/main/div/div/div[2]/form/button")
    WebElement submit;


    public void setClinicName(String name) {
        clinicname.clear();
        clinicname.sendKeys(name);
    }

    public void setEmail(String mail) {
        email.clear();
        email.sendKeys(mail);
    }

    public void setCountry(String countryName) {
        country.clear();
        country.sendKeys(countryName);
    }

    public void setGovernrate(String governrateName) {
        governrate.clear();
        governrate.sendKeys(governrateName);
    }

    public void setCity(String cityName) {
        city.clear();
        city.sendKeys(cityName);
    }

    public void setAddress(String addressText) {
        address.clear();
        address.sendKeys(addressText);
    }

    public void setPhone(String phoneNumber) {
        phone.clear();
        phone.sendKeys(phoneNumber);
    }

    public void selectSpecializationByText(String text) {
        Select dropdown = new Select(specialization);
        dropdown.selectByVisibleText(text);
    }

    public void selectSpecializationByValue(String value) {
        Select dropdown = new Select(specialization);
        dropdown.selectByValue(value);
    }

    public void selectSpecializationByIndex(int index) {
        Select dropdown = new Select(specialization);
        dropdown.selectByIndex(index);
    }

    public void clickSubmit() {
        submit.click();
    }

    public void applyClinic(
            String clinicName,
            String mail,
            String countryName,
            String governrateName,
            String cityName,
            String addressText,
            String phoneNumber,
            String specializationText) {

        setClinicName(clinicName);
        setEmail(mail);
        setCountry(countryName);
        setGovernrate(governrateName);
        setCity(cityName);
        setAddress(addressText);
        setPhone(phoneNumber);
        selectSpecializationByText(specializationText);
        clickSubmit();
    }
}
