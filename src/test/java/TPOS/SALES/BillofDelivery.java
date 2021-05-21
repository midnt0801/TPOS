package TPOS.SALES;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TPOS.LOGIN.Login1;
import TPOS.Sales.AddCustomer;
import resources.base;

public class BillofDelivery {
	protected Logger log =LogManager.getLogger(base.class.getName());
	public BillofDelivery() throws IOException
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
		Thread.sleep(3000);
		//l.getQuitAds().click();
		//driver.getTitle();
		//driver.get("https://tmt30.tpos.vn/#/app/dashboard");
	
		String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		String actualUrl = base.driver.getCurrentUrl();
		System.out.println(expectedUrl);
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl); 
	}
	//THÊM TỪ FILE
	@Test(priority=2)
	public void Openthemtufile() throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 Thread.sleep(5000);
		 l.getclickbanhang().click();
		 Thread.sleep(3000);
		 l.getclickmuchoadongiaohang().click();
		 Thread.sleep(3000);
		 l.getclickthemtufile().click();
		 
	}
	@Test(priority=3)
	public void KiemtrabtnTrolainTaifilemau()throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 Thread.sleep(4000);
		 l.getclicktrolai().click();
		 Thread.sleep(3000);
		 String expectedUrl = "https://tmt30.tpos.vn/#/app/fastsaleorder/deliveryinvoice";
		 String actualUrl = base.driver.getCurrentUrl();
		 System.out.println(expectedUrl);
		 System.out.println(actualUrl);
		 Assert.assertEquals(expectedUrl, actualUrl); 
		 
	}
	@Test(priority=4)
	public void Kiemtrataifilemau()throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 l.getclickmuchoadongiaohang().click();
		 Thread.sleep(3000);
		 l.getclickthemtufile().click();
		 Thread.sleep(5000);
		 l.getclicktaimauexcel().click();
		 Thread.sleep(3000);
		
	}
	
//	@Test(priority=5)
//	public void NhapExcel() throws Exception{
//		 AddCustomer l = new AddCustomer(base.driver);
//		 Thread.sleep(3000);
//		 l.getclickchonbtndoitac().click();
//		 Thread.sleep(3000);
//		 l.getclickchondoitac().click();
//		 Thread.sleep(3000);
//		 l.getclickchoosefile().sendKeys("C:\\Users\\TMT\\eclipse-workspace\\TPOSVN\\data\\Databill.xlsx");
//		 Thread.sleep(3000);
//		 l.getclicknhap().click();
//		 Thread.sleep(7000);
//		 l.getclickLuuNhapexcel().click();
//			String actual=l.getthongbaoluuthanhcong().getText();
//			String expect="Thao tác thành công!";
//			Assert.assertEquals(actual, expect);
//	}

	
	
	
	//Chưa viết kiểm tra được trạng thái GH all vì còn lỗi 
	@Test(priority=5)
	public void Kiemtraguilaivandongchuachoncheckbox()throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 l.getclickmuchoadongiaohang().click();
		 l.getguilaivandon().click();
		 Thread.sleep(5000);
			String actual=l.getthongbaoloi().getText();
			String expect="Vui lòng chọn tối thiểu 1 dòng";
			Assert.assertEquals(actual, expect);
		
	}
	@Test(priority=6)
	public void Kiemtraguilaivandongchoncheckbox()throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 Thread.sleep(3000);
		 l.getcheckboxguilaivandon().click();
		 Thread.sleep(4000);
		 l.getguilaivandon().click();
		 Thread.sleep(3000);
		 l.getluuguilaivandon().click();
			String actual=l.getthongbaotrue().getText();
			String expect="Thao tác thành công!";
			Assert.assertEquals(actual, expect);
		
	}

	//HOADONGIAOHANG
	@Test(priority=7)
	public void Openthemhoadongiaohang() throws Exception{
		 AddCustomer l = new AddCustomer(base.driver);
		 Thread.sleep(3000);
		 l.getclickmuchoadongiaohang().click();
		 Thread.sleep(3000);
		 l.getclickthemhoadongiaohang().click();
	}
	//HOADONGIAOHANG->THÊM->THÊM BÁN HÀNG 
	
}
