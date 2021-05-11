package TPOS.LOGIN;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
	}
	@Test
	
	public void validateAppTitle() throws IOException
	{
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
		//one is inheritance
		// creating object to that class and invoke methods of it
		Login1 l=new Login1(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getTitle().getText(), "FEATURED CO123URSES");
		 log.info("Successfully validated Text message");
		 System.out.println("Test completed");
		 
		
	
		
		}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	

	
}

