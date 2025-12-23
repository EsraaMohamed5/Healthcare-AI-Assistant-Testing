package Pages;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regster_Page extends TestPagebase {
  
	HomePage home;
	RegsterPage reg;
	
	
	@Test
  public void ftestregster() throws InterruptedException {
		
		
		  home =new HomePage(driver);
		  reg= new RegsterPage(driver);
			Thread.sleep(3000);
			home.openRegisterPage();
			Thread.sleep(3000);
			
			
			reg.NewUserSignup("mario","mariowagehh2002@gmail.com","01153945299","12345678","12345678");
			Thread.sleep(3000);
		  
			 Alert alert = driver.switchTo().alert();
		     String alertText = alert.getText();
		     Assert.assertEquals(alertText, "This email is already registered.");
		     alert.accept();   
		     
  }
}
