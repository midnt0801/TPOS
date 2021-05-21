package TPOS.LOGIN;

import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;


public class ChangePwd{
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
	}
	@Test(priority = 1)
	public void login() throws Exception {
		base.driver.get(base.prop.getProperty("url"));
		Login1 l = new Login1(base.driver);
		l.getEmail().sendKeys("admin");
		l.getPassword().sendKeys("123123@");
		l.getLogin().click();
		Thread.sleep(5000);
		//l.getQuitAds().click();
		//driver.getTitle();
		//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}
	@Test(priority = 2)
	public void ChangePw() throws Exception {
		Change l = new Change(base.driver);
		Logout k=new Logout(base.driver);
		Thread.sleep(5000);
		k.geticonlog().click();
		Thread.sleep(5000);
		l.getchangePwd().click();
	}

	@Test(priority = 3)
	public void changePwdUnsuccess() throws Exception {
		Change l = new Change(base.driver);
		l.getmkc().sendKeys("12312");
		l.getmkm().sendKeys("12312");
		l.getxacnhanmk().sendKeys("12312");
		l.getbtnXacnhan().click();
		Thread.sleep(5000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl= "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}
	@Test(priority = 4)
	public void changePwdsuccess() throws Exception {
		Change l = new Change(base.driver);
		l.getmkc().clear();
		l.getmkc().sendKeys("123123");
		l.getmkm().clear();
		l.getmkm().sendKeys("123123@");
		l.getxacnhanmk().clear();
		l.getxacnhanmk().sendKeys("123123@");	
		l.getbtnXacnhan().click();
		Thread.sleep(5000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/account/login";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}

}




