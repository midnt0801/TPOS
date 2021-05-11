package TPOS.LOGIN;
	import java.io.IOException;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	//import TPOS.LOGIN.Login1;
	//import TPOS.LOGIN.Logout;
	import resources.base;

	public class LogoutPage extends base {
		public WebDriver driver;


		
		 public static Logger log =LogManager.getLogger(base.class.getName());
		 @BeforeTest
			public void initialize() throws IOException
			{
			 
				 driver =initializeDriver();
				 
			}
		
		 @Test(priority = 1)
			public void loginsuccessful() throws Exception {
			driver.get(prop.getProperty("url"));
			Login1 l=new Login1(driver);
			l.getEmail().sendKeys("admin");
			l.getPassword().sendKeys("123123@");
			l.getLogin().click();
			Thread.sleep(5000);
			//l.getQuitAds().click();
			String actualUrl =driver.getCurrentUrl();
			String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
			System.out.println(actualUrl);
			System.out.println(expectedUrl);
			
			Assert.assertEquals(actualUrl, expectedUrl); 
		 }
		 
		 @Test(priority = 2)
		 public void LogOutHomepage() throws Exception {
			 Thread.sleep(5000);
			 Logout l=new Logout(driver);
			 l.geticonlog().click();
			 Thread.sleep(5000);
			 l.getlogout().click();
			String actualUrl =driver.getCurrentUrl();
			String expectedUrl = "https://tmt30.tpos.vn/#/app/login";
			System.out.println(actualUrl);
			System.out.println(expectedUrl);
				
			Assert.assertEquals(actualUrl, expectedUrl); 
		 }
		 @AfterTest
		  public void tearDown() throws Exception {
				Thread.sleep(5000);

		          driver.quit();
		      }


	}   




