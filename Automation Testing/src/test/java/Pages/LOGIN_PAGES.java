package Pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LOGIN_PAGES extends TestPagebase{
	HomePage home;
	LoginPage login;
	
	  
	  
  @Test
  public void testlogin () throws InterruptedException {
	  home =new HomePage(driver);
	  login= new LoginPage(driver);
		Thread.sleep(3000);
		home.openLoginPage();
		Thread.sleep(3000);
		
		login.userCanLogin("mamarere2002@gmail.com","mario9112003");
		Thread.sleep(3000);
		
		WebElement success = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/h1"));
	        Assert.assertTrue(success.getText().contains("Dashboard Overview"), "Login failed!");
	     	Thread.sleep(3000);
	    login.userCanLogout();
	    	Thread.sleep(3000);
	    	
	    	home.openLoginPage();
	    	login.userCanLogin("mamarere2002@gmail.com", "mario9112003");
	    	Thread.sleep(3000);
	    	Alert alert = driver.switchTo().alert();
	    	String alertText = alert.getText();
	    	Assert.assertEquals(alertText, "Invalid credentials.");
	    	alert.accept();
	     	Thread.sleep(3000);
	     	
	      	
	   
	        
	        
		
  }


}
