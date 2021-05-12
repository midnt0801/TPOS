package TPOS.SALES;

import java.io.IOException;
//import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.AddMyCustomer;

//import dataDriven.DataCustomer;

import resources.base;

import TPOS.LOGIN.Login1;
//import TPOS.LOGIN.Login1;
//import TPOS.Sales.AddCustomer;
import TPOS.Sales.Returns;


public class AddNewCustomer extends AddMyCustomer {

	protected WebDriver driver;
 		
	protected base base;
		
	protected Logger log =LogManager.getLogger(base.class.getName());
	
	public AddNewCustomer() throws IOException
	{
		base = new base();
		this.driver = base.initializeDriver();
	}
//		 
//		 	@BeforeTest
//		 	public void initialize() throws IOException
//			{
//			 
//			 driver =initializeDriver();
//				 
//			}
//	
		 
	 	@BeforeTest()
		public void setDriver() throws IOException {
			this.driver = base.initializeDriver();
		}
	 
	 	@Test(priority = 1)
		public void login() throws Exception {
	 	
			driver.get(base.prop.getProperty("url"));
			Login1 l=new Login1(driver);
			l.getEmail().sendKeys("admin");
			l.getPassword().sendKeys("123123@");
			l.getLogin().click();
			Thread.sleep(5000);
			//l.getQuitAds().click();
			//driver.getTitle();
			//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
		
			String expectedUrl = driver.getCurrentUrl();
			String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
			System.out.println(expectedUrl);
			System.out.println(actualUrl);
			Assert.assertEquals(expectedUrl, actualUrl); 
			
		 }
		 
			//navigate to Returnpage
		 @Test(priority = 2)
		 public void AddReturns() throws Exception {
			 Returns l = new Returns(driver);
			 Returns k=new Returns(driver);
			 Thread.sleep(3000);
			 l.getBanhangTQ().click();
			 l.getReturns1().click();
			 Thread.sleep(3000);
			 l.getBtnThem().click();
			 Thread.sleep(3000);
			 k.getBtnThemKHM().click();
		 
		 }
 
	   @Test(dataProvider="2",priority = 3)
		public void AddNewCustomer(String Customer, /*String date,*/String ContactNumber, String Email, String Street, String City,String District,String Commune)  throws Exception, IOException {
		// TODO Auto-generated method stub
			super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
		}
	   
	 	@AfterTest
	 	public void tearDown() throws Exception {
			Thread.sleep(5000);

	          driver.quit();
	      }

		@DataProvider(name = "2")
		public Object[][] getData() {
			return super.getData();
		}
		
	 	@BeforeTest
		void test() throws IOException {
			this.setDriver();
		}
}
//	/*,String ContactNumber,String Email,String Street, String City,String District,String Comnmune,String PriceList, String defautdiscount*/

