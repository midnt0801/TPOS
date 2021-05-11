package TPOS.CATEGORY;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
//import java.util.Date;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TPOS.LOGIN.Login1;
//import TPOS.SALES.AddNewCustomer;
import TPOS.Sales.AddCustomer;
import resources.AddMyCustomer;
import resources.base;
import resources.base1;

public class Customer extends AddMyCustomer {

	public WebDriver driver;
		
	public base base = new base();
	

	 public Logger log =LogManager.getLogger(base.class.getName());
	 
//	 	@BeforeTest
//	 	public void initialize() throws IOException
//		{
//		 
//		 driver =initializeDriver();
//			 
//		}

	 	@BeforeTest
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
			Assert.assertEquals(expectedUrl, actualUrl); }
//			try{			
//			     
//		        File file = new File("Cookies.data");							
//		        FileReader fileReader = new FileReader(file);							
//		        BufferedReader Buffreader = new BufferedReader(fileReader);							
//		        String strline;			
//		        while((strline=Buffreader.readLine())!=null){									
//		        StringTokenizer token = new StringTokenizer(strline,";");									
//		        while(token.hasMoreTokens()){					
//		        String name = token.nextToken();					
//		        String value = token.nextToken();					
//		        String domain = token.nextToken();					
//		        String path = token.nextToken();					
//		        Date expiry = null;					
//		        		
//		        String val;			
//		        if(!(val=token.nextToken()).equals("null"))
//				{		
//		        	expiry = new Date(val);					
//		        }		
//		        Boolean isSecure = new Boolean(token.nextToken()).								
//		        booleanValue();		
//		        Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
//		        System.out.println(ck);
//		        driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
//		        }		
//		        }		
//		        }catch(Exception ex){					
//		        ex.printStackTrace();			
//		        }		
//		        driver.get("https://tmt30.tpos.vn/#/account/login");					
//	 	 	}	
//			
		 
	 	 @Test(priority=2)
	 	 public void customer() throws Exception{
		 	 AddCustomer l= new AddCustomer(driver);
		 	 Thread.sleep(3000);
		 	 l.getclickdanhmuc().click();
		 	 Thread.sleep(3000);
		 	 l.getclickKhachhang().click();
		 	 Thread.sleep(3000);
		 	 l.getclickBtnThemKhachhang().click();
		 	 Thread.sleep(3000);
		 	 driver.manage().getCookies();
	 	}
	 	 
		@Test(dataProvider="2",priority = 3)
		public  void AddNewCustomer(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
			// TODO Auto-generated method stub
			super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
		}

		@DataProvider(name = "2")
		public Object[][] getData() {
			// TODO Auto-generated method stub
			return super.getData();
		}

		@AfterTest
	 	public void tearDown() throws Exception {
			Thread.sleep(5000);

	          driver.quit();
	    }
}
