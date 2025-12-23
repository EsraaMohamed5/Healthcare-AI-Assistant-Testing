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

public class Forgot_Password {
	 String URL = "https://teamdepi.github.io/mega/";
	    WebDriver driver;
	    @BeforeTest
	    public void OpenBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to(URL);
	    }
	
	@Test
  public void f() throws InterruptedException {
		
		
		  WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[1]"));
	        button.click();
	        Thread.sleep(3000);
	        WebElement forpassw=driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/a/p"));
	        forpassw.click();
	        Thread.sleep(3000);
	        WebElement email =driver.findElement(By.cssSelector("#root > main > div > div > div.col-12.col-lg-6.d-flex.flex-column.justify-content-center.align-items-center.p-2.p-md-5 > form > div > input"));
	        email.sendKeys("mamarere2002@gmail.com");
	       
	        Thread.sleep(3000);
	        
	    
	   
	        WebElement send =driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/button"));
             send.click();
             
             
             Thread.sleep(3000);
            Alert alert = driver.switchTo().alert();
             String alertText = alert.getText();
             Assert.assertEquals(alertText, "Please wait 55 seconds before requesting a new OTP.");
             alert.accept(); 
             
             WebElement success = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/div/h4"));
             Assert.assertTrue(success.getText().contains("Enter OTP"), "failed!");
             Thread.sleep(3000);

             
             
             
             
	
	}


  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
