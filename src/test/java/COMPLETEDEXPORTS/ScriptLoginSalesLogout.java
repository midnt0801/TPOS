package COMPLETEDEXPORTS;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TPOS.LOGIN.Listener;
import TPOS.LOGIN.Login1;
import TPOS.LOGIN.Logout;

import TPOS.Sales.AddCustomer;
import TPOS.Sales.Sale1;
import resources.AddMyCustomer;
import resources.base;

public class ScriptLoginSalesLogout {
	static WebDriver driver;
	static TestNG testNg;
	public static void main(String args[]) {
		Listener ext=new Listener();
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {ScriptLoginSalesLogout.class});
		testNg.addListener(ext);
		testNg.run();
		  }
	protected Logger log =LogManager.getLogger(base.class.getName());
	public ScriptLoginSalesLogout() throws IOException
	{
		super();
	}
	

	@BeforeTest()
	public void setDriver() throws IOException {
		if (base.driver == null)
			base.initializeDriver();
	}
	@Test(priority = 1)
	public void loginTPOS() throws Exception {
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
	//KHÁCH HÀNG
	//ĐỂ TRỐNG KHÁCH HÀNG
	@Test(priority=3)
	public void Detrongkhachhang() throws Exception{
		Sale1 m= new Sale1(base.driver);
		Thread.sleep(3000);
		m.getsanpham1().click();
		Thread.sleep(3000);
		String actual=m.gettitle().getText();
		String expect="Chọn khách hàng";
		 Assert.assertEquals(actual, expect);
	}
	//THÊM KHÁCH HÀNG MỚI 
	@Test(priority=4)
	public void Themkhachhangmoi() throws Exception{
		Sale1 m= new Sale1(base.driver); 
		AddCustomer l = new AddCustomer(base.driver);
		Thread.sleep(3000);
		m.getclickbtnchonkhachhang().click();
		m.getchon1khachhang().click();
		Thread.sleep(3000);
		l.getBtnThemKHM().click();
		l.getNhapten().sendKeys("Minh Đức");
		l.getDienThoai().sendKeys("0357916852");
		l.getEmail().sendKeys("midnt0801@gmail.com");
		Thread.sleep(3000);
		l.getstreet().sendKeys("685/32 Xô Viết Nghệ Tĩnh");
		l.getcity().sendKeys("Thành phố HCM");
		l.getdistrict().sendKeys("Quận Bình Thạnh");
		l.getcommune().sendKeys("Phường 26");
		Thread.sleep(3000);
		l.getBtnLuuKH().click();
		Thread.sleep(3000);
	}
	
	// CHỌN KHÁCH HÀNG
	@Test(priority=5)
	public void Chonkhachhang() throws Exception{
		Sale1 m= new Sale1(base.driver);
		m.getclickbtnchonkhachhang().click();
		m.getchon1khachhang().click();
		Thread.sleep(3000);
	}
			
	//SỬA KHÁCH HÀNG
	@Test(priority = 6)
	public void Suakhachhang() throws Exception {
		Sale1 m= new Sale1(base.driver);
		m.getclickbtnsuaten().click();
		Thread.sleep(3000);
		m.getsuaten().clear();
		Thread.sleep(3000);
		m.getsuaten().sendKeys("Hồ Quang Hải");
		m.getbtnLuusua().click();
		Thread.sleep(3000);
		
	} 
	//TÌM KIẾM KHÁCH HÀNG
	@Test(priority = 7)
	public void SearchKH() throws Exception {
		Sale1 l = new Sale1(base.driver);
		l.getsearchKH().click();
		Thread.sleep(3000);
		l.getotimkiem().sendKeys("e");
		Thread.sleep(3000);
		l.getkhachhangsearch().click();
		Thread.sleep(3000);
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
			
	@Test(priority=10)
	public void Xoabanggia() throws Exception{
		Sale1 l= new Sale1(base.driver);
		Thread.sleep(3000);
		l.getbtnxoabanggia().click();
	}

	@Test(priority= 11)
	public void Chonbanggia() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getclickbtnchonbanggia().click();
		Thread.sleep(3000);
		l.getchon1banggia().click();
	}
	//KHO HÀNG
	@Test(priority=12)
	public void Detrongkhohang() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getxkhohang().clear();
		String actual=l.gettexthongbaokh().getText();
		String expect="Chọn kho hàng ";
		Assert.assertEquals(actual, expect);
		
	}
	@Test(priority=13)
	public void Nhapkeyswordkh() throws Exception{
		Sale1 l= new Sale1(base.driver);
		Thread.sleep(5000);
		l.gettextkhohang().clear();
		l.gettextkhohang().sendKeys("e");
		Thread.sleep(3000);
		l.getsendkey1().click();
	}
			
	@Test(priority=14)
	public void Xoakhohang() throws Exception{
		Sale1 l= new Sale1(base.driver);
		Thread.sleep(3000);
		l.getxkhohang().click();
		String actual=l.gettexthongbaokh().getText();
		String expect="Chọn kho hàng ";
		Assert.assertEquals(actual, expect);
	}

	@Test(priority= 15)
	public void Chonkhohang() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getbtnchonkhohang().click();
		Thread.sleep(3000);
		l.getkhohang1().click();
	}
	
	//PHƯƠNG THỨC THANH TOÁN
	@Test(priority= 16)
	public void TimPPTT() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getxtextPTTT().click();
		Thread.sleep(3000);
		l.gettextPTTT().sendKeys("t");
		Thread.sleep(3000);
		l.getchon1PTTT().click();
		}
	@Test(priority= 17)
	public void XoaPPTT() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getxtextPTTT().click();
		Thread.sleep(3000);
		}
	@Test(priority= 18)
	public void ChonPPTT() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getclickbtnchonPTTT().click();
		Thread.sleep(3000);
		l.getchon1PTTT().click();
		}
	//LƯU KHÁCH HÀNG
	@Test(priority=19)
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
	//	l.getgiamtien().click();
		//Thread.sleep(4000);
		//l.getgiamtheophantram().sendKeys("5");
		//Thread.sleep(5000);
		//l.getgiamtheosotien().sendKeys("20000");
//		l.getthue().click();
//		Thread.sleep(5000);
//		l.getthue5phantram().click();
		Thread.sleep(5000);
		l.getluu().click();

		String  actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/fastsaleorder/invoiceform1?id=234178";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
		}
	@Test(priority=20)
	public void Mothanhtoandonhang() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.gethoadongiaohang().click();
		Thread.sleep(3000);
		l.getdonhangthanhtoan1().click();
		Thread.sleep(3000);
		l.getbtnthanhtoannho().click();
		Thread.sleep(3000);
	}
	@Test(priority=21)
	public void thanhtoandonhang() throws Exception{
		Sale1 l= new Sale1(base.driver);
		l.getclickbtnphuongthuc().click();
		Thread.sleep(3000);
		l.getclickbtnthanhtoanlon().click();
		
	}
	@Test(priority=22)
	public void LogoutTPOS() throws Exception{
		Thread.sleep(5000);
		Logout l = new Logout(base.driver);
		l.geticonlog().click();
		Thread.sleep(5000);
		l.getlogout().click();
		String actualUrl =base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/login";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
			
		Assert.assertEquals(actualUrl, expectedUrl); 
	}
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		if (base.driver != null)
			base.driver.quit();
	}
	 
		
}
