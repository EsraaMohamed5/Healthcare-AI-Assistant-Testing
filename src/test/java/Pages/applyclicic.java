package Pages;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class applyclicic extends TestPagebase {
	
	HomePage home;
Applyas_clicic appc;
	
  @Test
  public void f() throws InterruptedException {
	  
	  home =new HomePage(driver);
	  appc= new Applyas_clicic(driver);
	
	  
		Thread.sleep(3000);
		home.openapply();
		Thread.sleep(3000);
		
		appc.applyClinic("mae", "mamarere2002@gmail.com", "ma", "maaa", "maa", "maaaaa", "011111", "جراحة التجميل والحروق");
		Thread.sleep(3000);

		

		 Alert alert = driver.switchTo().alert();
	     String alertText = alert.getText();
	     Assert.assertEquals(alertText, "A clinic with this email already exists.");
	     alert.accept();   
  }
}
