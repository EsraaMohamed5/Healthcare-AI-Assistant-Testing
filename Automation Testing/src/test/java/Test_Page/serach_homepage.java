package Test_Page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class serach_homepage {
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
		
WebElement clinc = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div/div[1]/div[1]/a[2]"));
  clinc.click();
  Thread.sleep(3000);
  WebElement input = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/input"));
  input.sendKeys("مركز الحكمة الطبي");
  Thread.sleep(3000);
  input.sendKeys(Keys.ENTER);
  Thread.sleep(3000);
  WebElement success = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/h2"));
  Assert.assertTrue(success.getText().contains("مركز الحكمة الطبي"), "");
  Thread.sleep(3000);
	}

  @AfterTest
  public void afterTest() {
	  
	  
	  driver.close();
  }

}
