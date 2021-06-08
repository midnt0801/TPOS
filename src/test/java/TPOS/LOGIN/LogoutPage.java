package TPOS.LOGIN;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TPOS.SALES.SalesPage_ThemHD;
//import TPOS.LOGIN.Login1;
//import TPOS.LOGIN.Logout;
import resources.base;

public class LogoutPage {
	static TestNG testNg;
	public static void main(String args[]) {
		Listener ext=new Listener();
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {LogoutPage.class});
		testNg.addListener(ext);
		testNg.run();
		}
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
	}
	
	@Test(priority = 1)
	public void LoginTPOS() throws Exception {
		base.driver.get(base.prop.getProperty("url"));
		Login1 l = new Login1(base.driver);
		l.getEmail().sendKeys("admin");
		l.getPassword().sendKeys("123123@");
		l.getLogin().click();
		Thread.sleep(5000);
		//l.getQuitAds().click();
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		
		Assert.assertEquals(actualUrl, expectedUrl); 
	}
		
	@Test(priority = 2)
	public void LogOutTPOS() throws Exception {
		Thread.sleep(5000);
		Logout l = new Logout(base.driver);
		l.geticonlog().click();
		Thread.sleep(5000);
		l.getlogout().click();
		String actualUrl =base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/login";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
			
		Assert.assertEquals(actualUrl, expectedUrl); 
	}
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		if (base.driver != null)
			base.driver.quit();
	}
}   




