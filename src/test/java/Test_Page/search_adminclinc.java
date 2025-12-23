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

public class search_adminclinc {
    String URL = "https://teamdepi.github.io/mega/";
    WebDriver driver;  
	@BeforeTest
	  public void OpenBrowser() {
		   driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to(URL);
	  }
	
	
	  
	  @Test
  public void login() throws InterruptedException {
		  
		  WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/header/div[1]/div/div[1]/div[2]/a[1]"));
	        button.click();
	        
	        
	        WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[1]/input"));
	        WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/div[2]/input"));
	        WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/form/button"));
	     
	        email.sendKeys("lara.samir.6@mail.com");
	        password.sendKeys("12345678");
	        Thread.sleep(3000);
	        login.click();
	        
	        WebElement clinic_user_button =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/nav/ul/li[2]/a"));
	        clinic_user_button.submit();
	        Thread.sleep(3000);
  }

	  @Test
  public void clinicuser() throws InterruptedException {
		  
		
		
	       /* WebElement clinic_ =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/button/svg"));
	        clinic_.click();*/
	        WebElement clinic_user_button =driver.findElement(By.cssSelector("#root > div > div.translate-x-0.md\\:translate-x-0.fixed.md\\:fixed.inset-y-0.left-0.z-40.w-64.bg-white.shadow-xl.border-r.border-gray-200.transition-transform.duration-300.ease-in-out.h-screen > div > nav > ul > li:nth-child(3)"));
	        clinic_user_button.submit();
	        Thread.sleep(3000);
	     /*   WebElement btu_search = driver.findElement(By.xpath("//input[@placeholder='Search by name...']"));
	        btu_search.sendKeys("3bkreno 3mk");
	        btu_search.sendKeys(Keys.ENTER);


	        WebElement success = driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/main/div/div/div[2]/div[1]/div[2]"));
	        Assert.assertTrue(success.getText().contains("3bkreno 3mk"), "No Users found.");*/

	     
  }

	  

  @AfterTest
  public void afterTest() {
  }

}
