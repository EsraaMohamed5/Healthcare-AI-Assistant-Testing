package Test_Page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CONTACT_US {
	String URL = "https://teamdepi.github.io/mega/";
    WebDriver driver;
@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
  }
	@Test
  public void f() throws InterruptedException {
		
		WebElement contactus = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/section[1]/div/div[1]/a"));
		contactus.click();
		  Thread.sleep(3000);
		WebElement fristname = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div[1]/div[1]/input"));
         WebElement lastname = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div[1]/div[2]/input"));
         WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div[2]/input"));
         WebElement phonenumber = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div[3]/div/input"));
         WebElement magss = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/div[4]/textarea"));
         
         WebElement submit = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div[2]/form/button"));
        
         
         
         fristname.sendKeys("mario");
         lastname.sendKeys("wageh");
         email.sendKeys("mariowageh@gmail.com");
         phonenumber.sendKeys("+201153145920");
         magss.sendKeys("test mario wageh flem");
         Thread.sleep(3000);
         submit.click();
         Thread.sleep(3000);
         Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();
         Assert.assertEquals(alertText, "Form Submitted Successfully!");
         alert.accept();   

         
 
    
	
	}

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
