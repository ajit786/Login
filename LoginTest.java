package DonationPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import PO.Login;
import util.Driver;
import util.commUtil;
import org.openqa.selenium.support.PageFactory;


public class LoginTest {
	
	Login lgnpge;
	
 	
  @BeforeClass 
  public void beforeClass() throws InterruptedException {
      
	           Driver.driver = Driver.browser("firefox");
	           lgnpge = PageFactory.initElements(Driver.driver, Login.class);
	  
 	           commUtil.launchBrowser("http://rockerstech.com/donation_development/home/login");
 	           
 	           Thread.sleep(1000);
 	           
	           Driver.driver = Driver.browser("chrome");
               lgnpge = PageFactory.initElements(Driver.driver, Login.class);
	  
	           commUtil.launchBrowser("http://rockerstech.com/donation_development/home/login");
	  
	           Driver.driver = Driver.browser("IE");    
               lgnpge = PageFactory.initElements(Driver.driver, Login.class);
	  

               commUtil.launchBrowser("http://rockerstech.com/donation_development/home/login");		  
	  }
  
	
  @Test
  public void testlogin1() {
		  	 
		  lgnpge.validateLoginPage();
		  lgnpge.LoginToTitle("", "");
		  
	    System.out.println("Username and password are required.");
			  
	  }
  
   @Test
   public void testlogin2(){
	   	  
	   lgnpge.validateLoginPage();
	   lgnpge.LoginToTitle("ajit.rockersinfo", "12345678");
	   
	  System.out.println("Invalid username.");
	   
	   
	   
   }
  
  
   @Test
   public void testlogin3(){
	   	   
	   lgnpge.validateLoginPage();
	   lgnpge.LoginToTitle("ajit.rockersinfo@gmail.com", "12345678");
	   
     System.out.println("Login successfully.");
	   
	   
   }
 
  @AfterClass
  public void afterClass() {
	  
//	  Driver.driver.close();
//	  Driver.driver.quit();
	  
  }

}

	
