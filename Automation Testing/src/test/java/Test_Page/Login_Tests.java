package Test_Page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login_Tests {
    String URL = "https://teamdepi.github.io/mega/";
    WebDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
    }
    @Test
    public void Logintest_CorrectEmailandPassord() throws InterruptedException {
    
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[1]"));
        button.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[2]/input"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/button"));

        email.sendKeys("islam7lmy@gmail.com");
        password.sendKeys("Admin@123");
        Thread.sleep(3000);
        login.click();

        Thread.sleep(3000);

        WebElement success = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/h1"));
        Assert.assertTrue(success.getText().contains("Dashboard Overview"), "Login failed!");
       
        Thread.sleep(3000);
     
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/button/span[2]"));
        logout.click();
        Thread.sleep(3000);
 
    }

    @Test
    public void Logintest_IncorrectEmail() throws InterruptedException {
    
        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div[1]/div[1]/a[2]"));
        button.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[2]/input"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/button"));

        email.sendKeys("islam7lmy@gmail.com");
        password.sendKeys("Admin@123");
        Thread.sleep(3000);
        login.click();

        Thread.sleep(3000);

        email.sendKeys("mariowageh@gmail.com"); 
        password.sendKeys("Admin@123");
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);

        
        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/h2"));
        Assert.assertTrue(errorMsg.getText().contains("Welcome Back"), "Invalid Login not detected!");
       
    }

    
    @AfterTest
    public void afterTest() {
        driver.close(); 
    }
}
