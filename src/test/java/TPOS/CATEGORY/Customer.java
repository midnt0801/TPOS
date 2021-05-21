package TPOS.CATEGORY;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import TPOS.SALES.AddNewCustomer;
import TPOS.Sales.AddCustomer;
import resources.AddMyCustomer;
import resources.base;


public class Customer extends AddMyCustomer {

//	//public base base = new base();
//	public Logger log =LogManager.getLogger(base.class.getName());
//	
	public Customer() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		base.initializeDriver();
	}
	//DANHMUC//
//	@Test(priority=1)
//	public void login() throws Exception {
//		super.login();
//	}
//	@Test(priority=2)
// 	 public void customer_url1() throws Exception{
//	 	 AddCustomer l= new AddCustomer(base.driver);
//	 	 Thread.sleep(3000);
//	 	 l.getclickdanhmuc().click();
//	 	 Thread.sleep(3000);
//	 	 l.getclickKhachhang().click();
//	 	 Thread.sleep(3000);
//	 	 l.getclickBtnThemKhachhang().click();
//	 	 Thread.sleep(3000);	 	
//	 
// 	}
// 	 
//	@Test(dataProvider="1",priority = 3)
//	public  void AddNewCustomer1(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//
//	@DataProvider(name = "1")
//	public Object[][] getData1() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
	
	
	//BANHANG//
	@Test(priority=3)
	 public void customer_url2() throws Exception{
	 	 AddCustomer l = new AddCustomer(base.driver);
	 	 Thread.sleep(3000);
	 	 l.getclickbanhang().click();
	 	 Thread.sleep(3000);
	 	 l.getclickmucbanhang().click();
	 	 Thread.sleep(3000);
	 	 l.getclickThemKHtrongbanhang().click();
	 	 Thread.sleep(3000);
	 	 l.getBtnThemKHM().click();
	}
	 
	@Test(dataProvider="3",priority = 4)
	public  void AddNewCustomer2(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
		// TODO Auto-generated method stub
		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
	}

	@DataProvider(name = "3")
	public Object[][] getData2() {
		// TODO Auto-generated method stub
		return super.getData();
	}

	@AfterTest
 	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//base.driver.quit();
		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
	
    }
	//TRAHANG
//	@Test(priority=2)
//	 public void customer_url3() throws Exception{
//	 	 AddCustomer l = new AddCustomer(base.driver);
//	 	 Thread.sleep(3000);
//	 	 l.getclickbanhang().click();
//	 	 Thread.sleep(3000);
//	 	 l.getclickmuctrahang().click();
//	 	 Thread.sleep(3000);
//	 	 l.getclickThemKHtrongtrahang().click();
//	 	 Thread.sleep(3000);
//	 	 l.getBtnThemKHM().click();
//	}
//	 
//	@Test(dataProvider="3",priority = 4)
//	public  void AddNewCustomer3(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//
//	@DataProvider(name = "3")
//	public Object[][] getData3() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
//
//	@AfterTest
//	public void tearDown3() throws Exception {
//		Thread.sleep(3000);
//		//base.driver.quit();
//		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//	
//   }
	

	//HOADONGIAOHANG
//	@Test(priority=2)
//	public void customer_url4() throws Exception{
//		 AddCustomer l = new AddCustomer(base.driver);
//		 Thread.sleep(3000);
//		 l.getclickbanhang().click();
//		 Thread.sleep(3000);
//		 l.getclickmuchoadongiaohang().click();
//		 Thread.sleep(3000);
//		 l.getclickthemhoadongiaohang().click();
//		 Thread.sleep(3000);
//		 l.getBtnThemKHM().click();
//	}
//	
//	@Test(dataProvider="3",priority = 4)
//	public  void AddNewCustomer4(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//	
//	@DataProvider(name = "3")
//	public Object[][] getData4() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
//	
//	@AfterTest
//	public void tearDown4() throws Exception {
//		Thread.sleep(3000);
//		//base.driver.quit();
//		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//	
//	}
//
//	//BAOGIA
//	@Test(priority=2)
//	public void customer_url5() throws Exception {
//		 AddCustomer l = new AddCustomer(base.driver);
//		 Thread.sleep(3000);
//		 l.getclickbaogia().click();
//		 Thread.sleep(3000);
//		 l.getclickthembaogia().click();
//		 Thread.sleep(3000);
//		 l.getclickthemkhtrongbaogia().click();
//	}
//	
//	@Test(dataProvider="3",priority = 4)
//	public  void AddNewCustomer5(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//	
//	@DataProvider(name = "3")
//	public Object[][] getData5() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
//	
//	@AfterTest
//	public void tearDown5() throws Exception {
//		Thread.sleep(3000);
//		//base.driver.quit();
//		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//	
//	}

	// DONDATHANG
//	@Test(priority=2)
//	public void customer_url6() throws Exception {
//		 AddCustomer l = new AddCustomer(base.driver);
//		 Thread.sleep(3000);
//		 l.getclickdondathang().click();
//		 Thread.sleep(3000);
//		 l.getclickthemdondathang().click();
//		 Thread.sleep(3000);
//		 l.getclickthemkhtrongddh().click();
//	}
//	
//	@Test(dataProvider="3",priority = 4)
//	public  void AddNewCustomer6(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//	
//	@DataProvider(name = "3")
//	public Object[][] getData6() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
//	
//	@AfterTest
//	public void tearDown6() throws Exception {
//		Thread.sleep(3000);
//		//base.driver.quit();
//		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//	
//	}
//	//SALEONLINE
//	@Test(priority=2)
//	public void customer_url7() throws Exception {
//		 AddCustomer l = new AddCustomer(base.driver);
//		 Thread.sleep(3000);
//		 l.getclicksaleonline().click();
//		 Thread.sleep(3000);
//		 l.getclickthemdondathang().click();
//		 Thread.sleep(3000);
//		 l.getclickmucdonhang().click();
//		 Thread.sleep(3000);
//		 l.getclickchondonhang().click();
//		 Thread.sleep(2000);
//		 l.getclicktaohdtrongso().click();
//		 Thread.sleep(3000);
//		 l.getBtnThemKHM().click();
//	}
//	
//	@Test(dataProvider="3",priority = 4)
//	public  void AddNewCustomer7(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//		// TODO Auto-generated method stub
//		super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//	}
//	
//	@DataProvider(name = "3")
//	public Object[][] getData7() {
//		// TODO Auto-generated method stub
//		return super.getData();
//	}
//	
//	@AfterTest
//	public void tearDown7() throws Exception {
//		Thread.sleep(3000);
//		//base.driver.quit();
//		base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//	
//	}
//
//}
}
/*
 * public class EntityCustomer{ String name; ////
 * 
 * //get, set }
 * 
 * public class EntityProducct{ String name; ////
 * 
 * //get, set }
 * 
 * public class Data{ List<EntityCustomer> listCus; ///
 * 
 * public void readFileExcel(String url) { //doc
 * 
 * // truyen data vao list }
 * 
 * }
 * 
 * public static class Resource{ static Data data; static String url_file1; void
 * inti() { data.readFileExcelToCus(url_file1); } }
 * 
 * Resource.inti();
 * 
 * 
 * Resource.data
 */

//class base{
//	int i = 0
//	
//	// initDriver
//	driver = null -->init
//	
//	// login
//	khi chua login --> login
//	
//	// close drive
//	if (i >= 6)
//			
//	// capture
//}
//
//////addform
//
//class cus{
//	// declare html
//	
//	// function html
//	
//	//funtion (EntityCus)
//}
//
//class order{
//	// 
//}
//
//////test
//// nhiu form
//class test_cus{
//	int arr[] = {1,2,3};
//	base.init()
//	base.login()
//	
//	
//	
//	cus.add1()
//		if (!arr.indexOf(1)) return
//		foreach(entityCus i in Resource.data.listCus)
//			cus.Adddd(i)
//			cus.submit. // submit
//			
//		
//	cus.add2()
//	
//	base.close()
//}
//
//class test_order{
//	base.init()
//	base,login()
//	
//	order.add()
//	
//	base.close()
//}
//
//
//
//
//
//
//
//
//	 	@BeforeTest
		/*
		 * public void setDriver() throws IOException { this.driver =
		 * base.initializeDriver(); }
		 */

//
//		@Test(priority = 1)
//		public void login() throws Exception {
//	 	
//			driver.get(base.prop.getProperty("url"));
//			Login1 l=new Login1(driver);
//			l.getEmail().sendKeys("admin");
//			l.getPassword().sendKeys("123123@");
//			l.getLogin().click();
//			Thread.sleep(5000);
//			//l.getQuitAds().click();
//			//driver.getTitle();
//			//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//		
//			String expectedUrl = driver.getCurrentUrl();
//			String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
//			System.out.println(expectedUrl);
//			System.out.println(actualUrl);
//			Assert.assertEquals(expectedUrl, actualUrl); 
//		}
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
		 
	 

