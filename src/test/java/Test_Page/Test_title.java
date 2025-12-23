package Test_Page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test_title {
  String URL ="https://teamdepi.github.io/mega/";
  WebDriver driver = new ChromeDriver();
  
  @BeforeTest
  public void OpenBrowser() {
		
		driver.navigate().to(URL);
		driver.manage().window().maximize();
  }
   	@Test
  public void beforeTest() throws InterruptedException {
	  String exectedResult = "Insove - Your Healthcare Partner";
	  String actualResult = driver.getTitle();
	  Assert.assertEquals(exectedResult, actualResult);
	  Thread.sleep(3000);
 
  }

  @AfterTest
  public void afterTest() {
  
	  driver.close();
  }

}
