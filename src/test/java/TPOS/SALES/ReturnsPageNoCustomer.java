package TPOS.SALES;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TPOS.LOGIN.Login1;
import TPOS.Sales.AddCustomer;
import TPOS.Sales.Returns;
import resources.base;

public class ReturnsPageNoCustomer extends base{
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
		l.getPassword().sendKeys("123123");
		l.getLogin().click();
		Thread.sleep(3000);
		//l.getQuitAds().click();
		//driver.getTitle();
		//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
	
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
		
	 }
	 @Test(priority = 2)
	 public void Returnpage1() throws Exception {
		 Returns l = new Returns(driver);
		 l.getBanhangTQ().click();
		 l.getReturns1().click();
		 Thread.sleep(3000);
		 l.getBtnThem().click();
	 
	 }

	 @Test(priority = 3)
	 public void AddKHBG() throws Exception {
		 Returns l = new Returns(driver);
		 l.getBtnThemKH().click();
		 AddCustomer k = new AddCustomer(driver);
		 k.getNhapten().sendKeys("Đức Huy");
		 k.getDienThoai().sendKeys("0976121870");
		 k.getBtnLuuKH().click();
	 }
	
	 @Test(priority= 4)
	 public void SaveTH() throws Exception{
		 Returns l= new Returns(driver);
		 l.getBanggia().click();
		 l.getBanggia1().click();
		 Thread.sleep(3000);
		 l.getNgGH().sendKeys("Công Minh");
		 Thread.sleep(3000);
		 l.getSanpham1().click();
		 l.getSLSP1().sendKeys("2");
		 Thread.sleep(3000);
		 l.getBtnLuu().click();
			
		String expectedUrl = driver.getCurrentUrl();
		String actualUrl = "https://tmt30.tpos.vn/#/app/fastsaleorder/refundform1?id=223941";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	 }
	@AfterTest
	  public void tearDown() throws Exception {
			Thread.sleep(5000);

	          driver.quit();
	      }
}
				 


