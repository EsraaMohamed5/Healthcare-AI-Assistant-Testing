package Pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestPagebase {
	  String URL = "https://teamdepi.github.io/mega/";
	    WebDriver driver;

	    @BeforeTest
	    public void OpenBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to(URL);
	    }

  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
