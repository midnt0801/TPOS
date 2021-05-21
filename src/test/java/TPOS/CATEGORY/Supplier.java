package TPOS.CATEGORY;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TPOS.Sales.AddCustomer;
import TPOS.Sales.AddSupplier;
import resources.AddMySupplier;
import resources.base;

	public class Supplier extends AddMySupplier {

		
		//public base base = new base();
		public Logger log =LogManager.getLogger(base.class.getName());
		
		public Supplier() throws IOException {
			super();
			// TODO Auto-generated constructor stub
			base.initializeDriver();
		}
	//MUAHANG
		@Test(priority=1)
		public void login() throws Exception {
			super.login();
		}
		@Test(priority=2)
	 	 public void supplier_url1() throws Exception{
		 	 AddSupplier l= new AddSupplier(base.driver);
		 	 AddCustomer k= new AddCustomer(base.driver);
		 	 Thread.sleep(3000);
		 	 l.getclickmuahang().click();
		 	 Thread.sleep(3000);
		 	 l.getclickmucmuahang().click();
		 	 Thread.sleep(3000);
		 	 l.getclickthemMHTH().click();
		 	 Thread.sleep(3000);	
		 	 k.getBtnThemKHM().click();
		 
	 	}
	 	 
		@Test(dataProvider="1",priority = 3)
		public  void AddNewSupplier(String Supplier,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
			// TODO Auto-generated method stub
			super.AddNewCustomer(Supplier, /*data,*/ContactNumber,Email,Street,City,District,Commune);
		}
	
		@DataProvider(name = "1")
		public Object[][] getData1() {
			// TODO Auto-generated method stub
			return super.getData();
		}
		
		@AfterTest
		public void tearDown1() throws Exception {
			Thread.sleep(3000);
			//base.driver.quit();
			base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
		
		}
	//TRAHANG
//		@Test(priority=2)
//	 	 public void supplier_url2() throws Exception{
//		 	 AddSupplier l= new AddSupplier(base.driver);
//		 	 AddCustomer k= new AddCustomer(base.driver);
//		 	 Thread.sleep(3000);
//		 	 l.getclickmuahang().click();
//		 	 Thread.sleep(3000);
//		 	 l.getclickmuctrahang().click();
//		 	 Thread.sleep(3000);
//		 	 l.getclickthemMHTH().click();
//		 	 Thread.sleep(3000);	
//		 	 k.getBtnThemKHM().click();
//		 
//	 	}
//	 	 
//		@Test(dataProvider="1",priority = 3)
//		public  void AddNewSupplier1(String Supplier,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
//			// TODO Auto-generated method stub
//			super.AddNewCustomer(Supplier, /*data,*/ContactNumber,Email,Street,City,District,Commune);
//		}
//	
//		@DataProvider(name = "1")
//		public Object[][] getData2() {
//			// TODO Auto-generated method stub
//			return super.getData();
//		}
//		
//		@AfterTest
//		public void tearDown2() throws Exception {
//			Thread.sleep(3000);
//			//base.driver.quit();
//			base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
//		
//		}
		
}
