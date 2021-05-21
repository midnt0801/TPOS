package TPOS.LOGIN;

import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;
	


public class ForgetPwd1 {
	//public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
	}

	@Test(priority = 1)
	public void getemailsucessful() throws Exception {

		base.driver.get(base.prop.getProperty("url"));
		Login1 a = new Login1(base.driver);
		a.getEmail().sendKeys("admin");
		a.getPassword().sendKeys("12312");
		a.getLogin().click();
		
		Thread.sleep(3000);
	
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl= "https://tmt30.tpos.vn/#/account/forgotpassword";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
	
		Assert.assertEquals(actualUrl,expectedUrl); 
	}
	@Test(priority=2)
	public void Navigation()throws Exception{
		Login1 l = new Login1(base.driver);
		l.getForgetPwd1().click();
		Thread.sleep(3000);
		l.getgetEml().sendKeys("diemmint0801@gmail.com");
		l.getBtnfgt().click();
		Thread.sleep(5000);
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl= "https://tmt30.tpos.vn/#/account/forgotpassword";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);

		Assert.assertEquals(actualUrl,expectedUrl); 
	}
}


