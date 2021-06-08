package TPOS.CATEGORY;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TPOS.Sales.AddCustomer;
import TPOS.category.Products1;
import resources.AddMyGroupofProducts;
import resources.base;


public class GroupofProducts extends AddMyGroupofProducts {

		
		//public base base = new base();
		public Logger log =LogManager.getLogger(base.class.getName());
		
		public GroupofProducts() throws IOException {
			super();
			// TODO Auto-generated constructor stub
			base.initializeDriver();
		}
		@Test(priority=1)
		public void login() throws Exception {
			super.login();
		}
		@Test(priority=2)
	 	 public void Openthemnhomsanpham() throws Exception{
		 	 Products1 l= new Products1(base.driver);
		 	 AddCustomer k= new AddCustomer(base.driver);
		 	 Thread.sleep(3000);
		 	 k.getclickdanhmuc().click();
		 	 Thread.sleep(3000);
		 	 l.getclicknhomsanpham().click();
		 	 Thread.sleep(3000);
		 	 l.getclickthemnsp().click();
		 	 Thread.sleep(3000);	
	 	}
	 	 
		@Test(dataProvider="3",priority = 3)
		public  void AddNewGroupofProducts(String Ten,/*String Nhomcha*/String Thutu)  throws Exception, IOException {
			// TODO Auto-generated method stub
			super.AddNewGroupofProducts(Ten,Thutu);
		}
	
		@DataProvider(name = "3")
		public Object[][] getData() {
			// TODO Auto-generated method stub
			return super.getData();
		}
		
		@AfterTest
		public void tearDown() throws Exception {
			Thread.sleep(3000);
			//base.driver.quit();
			base.driver.get("https://tmt30.tpos.vn/#/app/dashboard");
		
		}
}
