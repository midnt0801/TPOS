package TPOS.SALES;

import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.TestNG;
//import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TPOS.LOGIN.Listener;
import TPOS.LOGIN.Login1;
//import TPOS.Sales.AddCustomer;

import TPOS.Sales.Returns;
import resources.base;
//import org.openqa.selenium.Keys;

public class ReturnsPage<Khachhang> {
	static TestNG testNg;
	public static void main(String args[]) {
		Listener ext=new Listener();
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {SalesPage_ThemHD.class});
		testNg.addListener(ext);
		testNg.run();
		}
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
	}

	//Login
	@Test(priority = 1)
	public void login() throws Exception {
		base.driver.get(base.prop.getProperty("url"));
		Login1 l=new Login1(base.driver);
		l.getEmail().sendKeys("admin");
		l.getPassword().sendKeys("123123@");
		l.getLogin().click();
		Thread.sleep(5000);
		//l.getQuitAds().click();
		//driver.getTitle();
		//driver.get("https://tmt30.tpos.vn/#/app/dashboard");

		String expectedUrl = base.driver.getCurrentUrl();
		String actualUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}

	//navigate to Returnpage
	@Test(priority = 2)
	public void AddReturns() throws Exception {
		Returns l = new Returns(base.driver);
		Thread.sleep(3000);
		l.getclickbanhang().click();
		l.getclickmuctrahang().click();
		Thread.sleep(3000);
		l.getBtnThem().click();
		Thread.sleep(3000);
		//l.getBtnThemKHM().click();
	}

//	//Customer
//	@Test(priority = 3)
//	public void LetEmpty() throws Exception {
//		Returns l = new Returns(base.driver);
//		Thread.sleep(3000);
//		l.getSanpham1().click();
//		Thread.sleep(5000);
//		String actual=l.getTitle().getText();
//	
//		String expect="Ch???n kh??ch h??ng";
//		Assert.assertEquals(actual, expect);
//		
//	}
/*
	@Test(priority = 4)
	public void ChoosenclearKHC() throws Exception {
		Returns l = new Returns(base.driver);
		l.getKhachhangbtn().click();
		l.getKhachhangt3().click();
		Thread.sleep(3000);
		l.getXoaKH().click();
		Thread.sleep(5000);
		String actual=l.getTitle().getText();
		String expect="Ch???n kh??ch h??ng";
		Assert.assertEquals(actual,expect);
	}

	@Test(priority = 5)
	public void AddKHCC() throws Exception {
		Returns l = new Returns(base.driver);
		l.getBtnThemKH().click();
		AddCustomer k = new AddCustomer(base.driver);
		Thread.sleep(2000);
		k.getNhapten().sendKeys("Nghia Pham");
		k.getDienThoai().sendKeys("0976121870");
		k.getBtnLuuKH().click();
		Thread.sleep(5000);
	} 
	@Test(priority = 6)
		public void AddAgain() throws Exception {
		Returns l = new Returns(base.driver);
		l.getKhachhangbtn().click();
		l.getKhachhangt1().click();
		Thread.sleep(3000);
		l.getSuaKH().click();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void FixKH() throws Exception {
		Returns l = new Returns(base.driver);
		l.getSuaTen().clear();
		Thread.sleep(3000);
		l.getSuaTen().sendKeys("Nguy???n Th??? Di???m Qu???nh");
		l.getBtnLuuSuaKH().click();
		Thread.sleep(7000);
		String actual=l.getOkhachhang().getText();
		String expect="Nguy???n Th??? Di???m Qu???nh";
		Assert.assertEquals(actual,expect);
	} 
	@Test(priority = 9)
	public void SearchKH() throws Exception {
		Returns l = new Returns(base.driver);
		l.getBtnSearch().click();
		Thread.sleep(3000);
		l.getChuyenTab().click();
		Thread.sleep(3000);
		l.getChonKH().click();
	}

	//PriceList
	@Test(priority= 10)
	public void SendKeystoPriceList() throws Exception{
		Returns l= new Returns(base.driver);
		Thread.sleep(5000);
		l.getOBanggia().clear();
		l.getOBanggia().sendKeys("B");
		Thread.sleep(3000);
		l.getOBanggia1().click();
	}
	@Test(priority=11)
	public void DelPriceList() throws Exception{
		Returns l= new Returns(base.driver);
		Thread.sleep(3000);
		l.getXoaBG().click();
	}

	@Test(priority= 12)
	public void ChoosePriceList() throws Exception{
		Returns l= new Returns(base.driver);
		l.getBanggia().click();
		Thread.sleep(3000);
		l.getBanggia1().click();
	}
	//Warehouse
	@Test(priority= 13)
	public void SendKeystoWH() throws Exception{
		Returns l= new Returns(base.driver);
		l.getOKhohang().clear();
		Thread.sleep(3000);
		l.getOKhohang().sendKeys("a");
		Thread.sleep(3000);
		l.getKhohang1a().click();
	}
	@Test(priority=14)
	public void DelWH() throws Exception{
		Returns l= new Returns(base.driver);
		Thread.sleep(3000);
		l.getXoaKhohang().click();
		Thread.sleep(3000);
	}

	@Test(priority= 15)
	public void ChooseWH() throws Exception{
		Returns l= new Returns(base.driver);
		l.getKhohangbtn().click();
		Thread.sleep(3000);
		l.getKhohang1().click();
	}
	//PPTT
	@Test(priority= 16)
	public void SendKeystoPPTT() throws Exception{
		Returns l= new Returns(base.driver);
		Thread.sleep(5000);
		l.getOPTTT().clear();
		Thread.sleep(3000);
		l.getOPTTT().sendKeys("t");
		Thread.sleep(3000);
		l.getPTTT1().click();
	}
	@Test(priority=17)
		public void DelPPTT() throws Exception{
		Returns l= new Returns(base.driver);
		Thread.sleep(3000);
		l.getXoaPTTT().click();
		Thread.sleep(3000);
	}

	@Test(priority= 18)
		public void ChoosePPTT() throws Exception{
		Returns l= new Returns(base.driver);
		l.getPTTTbtn().click();
		Thread.sleep(3000);
		l.getPTTT1().click();
	}*/
	//Save
	@Test(priority=3)
	public void LuuTraHang() throws Exception{
		Returns l= new Returns(base.driver);
		l.getKhachhangbtn().click();
		Thread.sleep(3000);
		l.getKhachhangt1().click();
		Thread.sleep(3000);
		l.getBanggia().click();
		Thread.sleep(3000);
		l.getBanggia1().click();
		Thread.sleep(3000);
		
		l.getNgGH().sendKeys("L?? T??m");
		Thread.sleep(3000);
		l.getSanpham1().click();
		l.getSLSP1().sendKeys("2");
		Thread.sleep(3000);
		l.getBtnLuu().click();

		String  actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/fastsaleorder/refundform1";
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
					 
