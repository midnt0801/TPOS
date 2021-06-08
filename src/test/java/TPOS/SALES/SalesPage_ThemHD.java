package TPOS.SALES;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TPOS.LOGIN.Listener;
import TPOS.LOGIN.Login1;
import TPOS.LOGIN.LoginHome;
import TPOS.Sales.AddCustomer;
import TPOS.Sales.Sale1;
import resources.AddMyCustomer;
import resources.base;

public class SalesPage_ThemHD extends AddMyCustomer{
		static TestNG testNg;
		public static void main(String args[]) {
			Listener ext=new Listener();
			testNg = new TestNG();
			testNg.setTestClasses(new Class[] {SalesPage_ThemHD.class});
			testNg.addListener(ext);
			testNg.run();
			  }
		protected Logger log =LogManager.getLogger(base.class.getName());
		public SalesPage_ThemHD() throws IOException
		{
			super();
		}

		@BeforeTest()
		public void setDriver() throws IOException {
			if (base.driver == null)
				base.initializeDriver();
		}
		@Test(priority = 1)
		public void login() throws Exception {
			base.driver.get(base.prop.getProperty("url"));
			Login1 l = new Login1(base.driver);
			l.getEmail().sendKeys("midnt0801");
			l.getPassword().sendKeys("123123@");
			l.getLogin().click();
			Thread.sleep(2000);
			//l.getQuitAds().click();
			//driver.getTitle();
			//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
		
			String expectedUrl = base.driver.getCurrentUrl();
			String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
			System.out.println(expectedUrl);
			System.out.println(actualUrl);
			Assert.assertEquals(expectedUrl, actualUrl); 
		}
	
		@Test(priority=2)
		 public void MoTrangThemKH() throws Exception{
		 	 AddCustomer k = new AddCustomer(base.driver);
		 	 
		 	 Thread.sleep(7000);
		 	 k.getclickbanhang().click();
		 	 Thread.sleep(2000);
		 	 k.getclickmucbanhang().click();
		 	 Thread.sleep(5000);
		 	 k.getclickThemKHtrongbanhang().click();
		 	 Thread.sleep(3000);
		}
		//KIỂM TRA CLICK CÁC TRANG
		@Test(priority=3)
		 public void Kiemtraclick() throws Exception{
		 	 AddCustomer l = new AddCustomer(base.driver);
		 	 Thread.sleep(3000);
		 	 l.getclickthongtingiaohang().click();
		 	 Thread.sleep(3000);
		 	 l.getclickthongtinnguoinhan().click();
		 	 Thread.sleep(3000);
		 	 l.getclickthongtinkhac().click();
		 	 Thread.sleep(3000);
		 	 l.getclickthongtin().click();
		}
		//KHÁCH HÀNG
		//ĐỂ TRỐNG KHÁCH HÀNG
		@Test(priority=4)
		 public void Detrongkhachhang() throws Exception{
		 	 Sale1 m= new Sale1(base.driver);
		 	 Thread.sleep(3000);
		 	 m.getsanpham1().click();
		 	 Thread.sleep(3000);
		 	 String actual=m.gettitle().getText();
		 	 String expect="Chọn khách hàng";
		 	 Assert.assertEquals(actual, expect);
		}
		
		// THÊM KHÁCH HÀNG
		@Test(priority=5)
		public void ThemKhachhang() throws Exception{
			Sale1 m= new Sale1(base.driver); 
			AddCustomer l = new AddCustomer(base.driver);
			Thread.sleep(3000);
			m.getclickbtnchonkhachhang().click();
			m.getchon1khachhang().click();
			Thread.sleep(3000);
			l.getBtnThemKHM().click();
			
		}
	
		
		@Test(dataProvider="3",priority = 6)
		public  void Themkhachhangmoi(String Customer,/* String date,*/String ContactNumber, String Email,String Street, String City,String District,String Commune) throws Exception, IOException {
			// TODO Auto-generated method stub
			super.AddNewCustomer(Customer, /*data,*/ContactNumber,Email,Street,City,District,Commune);
			Sale1 m=new Sale1(base.driver);
			String actual=m.gettextKH().getText();
			String expect="";
			Assert.assertEquals(actual,expect);	
			
		}
	
		@DataProvider(name = "3")
		public Object[][] getData() {
			// TODO Auto-generated method stub
			return super.getData();
		}
	
		//SỬA KHÁCH HÀNG
		@Test(priority = 6)
		public void Suakhachhang() throws Exception {
			Sale1 m= new Sale1(base.driver);
			m.getsuaten().clear();
			Thread.sleep(3000);
			m.getsuaten().sendKeys("Phạm Tuấn Nghĩa");
			m.getbtnLuusua().click();
			Thread.sleep(3000);
	
		} 
		//TÌM KIẾM KHÁCH HÀNG
		@Test(priority = 7)
		public void SearchKH() throws Exception {
			Sale1 l = new Sale1(base.driver);
			l.getsearchKH().click();
			Thread.sleep(3000);
			l.getKHsearch().click();
		 	 String actual=l.gettextKH().getText();
		 	 String expect="Ngoc Mai Ly";
		 	 Assert.assertEquals(actual, expect);
		
		}
		//BẢNG GIÁ 
		@Test(priority=8)
		 public void Detrongbanggia() throws Exception{
		 	 Sale1 l= new Sale1(base.driver);
		 	 Thread.sleep(3000);
		 	 l.gettextbanggia().clear();
		 	 l.getluu().click();
		 	 Thread.sleep(3000);
		 	 String actual=l.gettextbanggia2().getText();
		 	 String expect="Chọn bảng giá ";
		 	 Assert.assertEquals(actual, expect);
		}
		@Test(priority= 9)
		
		public void Nhapkeysword() throws Exception{
			Sale1 l= new Sale1(base.driver);
			Thread.sleep(5000);
			l.gettextbanggia().clear();
			l.gettextbanggia().sendKeys("B");
			Thread.sleep(3000);
			l.gettextbanggia1().click();
		}
		@Test(priority=11)
		public void Xoabanggia() throws Exception{
			Sale1 l= new Sale1(base.driver);
			Thread.sleep(3000);
			l.getbtnxoabanggia().click();
		}

		@Test(priority= 12)
		public void ChoosePriceList() throws Exception{
			Sale1 l= new Sale1(base.driver);
			l.getclickbtnchonbanggia().click();
			Thread.sleep(3000);
			l.getchon1banggia().click();
		}
		//PHƯƠNG THỨC THANH TOÁN
		@Test(priority= 13)
		public void ChonPPTT() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getclickbtnchonPTTT().click();
		Thread.sleep(3000);
		l.getchon1PTTT().click();
	}
		//LƯU KHÁCH HÀNG
		@Test(priority=3)
		public void TaohoadonKH() throws Exception{
			Sale1 l= new Sale1(base.driver);
			l.getclickbtnchonkhachhang().click();
			Thread.sleep(2000);
			l.getchon1khachhang().click();
			Thread.sleep(3000);
			l.getclickbtnchonbanggia().click();
			Thread.sleep(3000);
			l.getchon1banggia().click();
			Thread.sleep(3000);
			l.getclickbtnchonPTTT().click();
			Thread.sleep(3000);
			l.getchon1PTTT().click();
			Thread.sleep(3000);
			l.getnguoigiaohang().sendKeys("Hồ Phước Quang");
			Thread.sleep(5000);
			l.getsanpham1().click();
			Thread.sleep(3000);
			
			l.getgiamtien().click();
			Thread.sleep(4000);
			//l.getgiamtheophantram().sendKeys("5");
			Thread.sleep(5000);
			l.getgiamtheosotien().sendKeys("20000");
			l.getthue().click();
			Thread.sleep(3000);
			l.getthue5phantram().click();
			Thread.sleep(5000);
			l.getluu().click();

			String  actualUrl = base.driver.getCurrentUrl();
			String expectedUrl = "https://tmt30.tpos.vn/#/app/fastsaleorder/invoiceform1?id=234178";
			System.out.println(expectedUrl);
			System.out.println(actualUrl);
			Assert.assertEquals(expectedUrl, actualUrl); 
		}
		
		@AfterTest
		public void tearDown() throws Exception {
			Thread.sleep(5000);
			if (base.driver != null)
				base.driver.quit();
		}
}
	
