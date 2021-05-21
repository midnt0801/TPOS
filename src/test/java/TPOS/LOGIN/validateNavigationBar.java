package TPOS.LOGIN;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.base;
//Adding logs 
//Generating html reports
//Screenshots on failure
//JEnkins integration
public class validateNavigationBar{
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
		base.driver.get(base.prop.getProperty("url"));
	}
	
	@Test
	public void validateAppNavBar() throws IOException
	{
		//one is inheritance
		// creating object to that class and invoke methods of it
		Login1 l = new Login1(base.driver);
	
		//compare the text from the browser with actual text.- Error..
	    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	    log.info("Navigation Bar is displayed");
		System.out.println("Test completed");
	 //   Assert.assertFalse(false);
		// ;
	}
	
	@AfterTest
	public void teardown()
	{
		if (base.driver != null)
			base.driver.close();
	}
}
