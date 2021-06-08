package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sale1 {
public WebDriver driver;
	//Khách hàng
	By otimkiem=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By clickbtnsuaten=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[2]/i[1]");
	By clickbtnchonkhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/span[2]");
	By chon1khachhang=By.xpath("/html/body/div[5]/div/div[2]/ul/li[3]");
	By suaten=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/h1/input");
	By btnLuusua=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[1]");
	By textKH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/input");
	By searchKH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[3]");
	By KHsearch=By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[10]/td[1]/span");
	By title=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/span[1]");
	By khachhangsearch=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[1]");
	//bảng giá
	By clickbtnchonbanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/span[2]");
	By chon1banggia=By.xpath("/html/body/div[6]/div/div[2]/ul/li[4]");
	By textbanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/input");
	By btnxoabanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/span[1]");
	By textbanggia1=By.xpath("/html/body/div[6]/div/div[2]/ul/li[2]");
	By textbanggia2=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]");
	//Lưu
	By textPTTT=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]/input[1]");
	By xtextPTTT=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]/span[1]");
	By clickbtnchonPTTT=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/span/span/span[2]");
	By chon1PTTT=By.xpath("/html[1]/body[1]/div[7]/div[1]/div[2]/ul[1]/li[2]");
	By sotientra=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/span/span/input[1]");
	By nguoigiaohang=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]");
	By sanpham1=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[6]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]");
	By sanpham2=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr[17]/td[2]/div");
	By sanpham3=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr[11]/td[2]");
	By giamtien=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/button");
	By giamtheophantram=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/span/span/input[2]");
	By giamtheosotien=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/span/span/input[1]");
	By thue=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[3]/td[2]/button");
	By thue5phantram=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]");
	By slsp1=By.xpath("//*[@id=\"table_details\"]/tbody/tr/td[3]/span[1]/span/input[1]");
	By luu=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[4]");
	//Kho hàng 
	By xkhohang=By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]");
	By textkhohang=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/input[1]");
	By btnchonkhohang=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/span[2]");
	By khohang1=By.xpath("/html[1]/body[1]/div[8]/div[1]/div[2]/ul[1]/li[6]");
	By sendkey1=By.xpath("/html[1]/body[1]/div[9]/div[1]/div[2]/ul[1]");
	By texthongbaokh=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/span[2]");
	
	//Hóa đơn
	By hoadongiaohang=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[3]/a[1]");
	By donhangthanhtoan1=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[5]");
	By btnthanhtoannho=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
	By clickbtnphuongthuc=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/span[2]/span[1]");
	By chon1PT=By.xpath("/html[1]/body[1]/div[15]/div[1]/div[2]/ul[1]/li[3]");
	By clickbtnthanhtoanlon=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/footer[1]/button[1]");
	
	public Sale1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	public WebElement gethoadongiaohang() 
	 {
	
		 return driver.findElement(hoadongiaohang);
	}
	public WebElement getdonhangthanhtoan1() 
	 {
	
		 return driver.findElement(donhangthanhtoan1);
	}
	public WebElement getbtnthanhtoannho() 
	 {
	
		 return driver.findElement(btnthanhtoannho);
	}
	public WebElement getclickbtnphuongthuc() 
	 {
	
		 return driver.findElement(clickbtnphuongthuc);
	}
	public WebElement getchon1PT() 
	 {
	
		 return driver.findElement(chon1PT);
	}
	public WebElement getclickbtnthanhtoanlon() 
	 {
	
		 return driver.findElement(clickbtnthanhtoanlon);
	}
	public WebElement gettextPTTT() 
	 {
	
		 return driver.findElement(textPTTT);
	}
	public WebElement getxtextPTTT() 
	 {
	
		 return driver.findElement(xtextPTTT);
	}
	public WebElement gettexthongbaokh() 
	 {
	
		 return driver.findElement(texthongbaokh);
	}
	public WebElement getxkhohang() 
	 {
	
		 return driver.findElement(xkhohang);
	}
	public WebElement gettextkhohang() 
	 {
	
		 return driver.findElement(textkhohang);
	}
	public WebElement getbtnchonkhohang() 
	 {
	
		 return driver.findElement(btnchonkhohang);
	}
	public WebElement getkhohang1()
	 {
	
		 return driver.findElement(khohang1);
	}
	public WebElement getsendkey1() 
	 {
	
		 return driver.findElement(sendkey1);
	}
	public WebElement getkhachhangsearch() 
	 {
	
		 return driver.findElement(khachhangsearch);
	}
	public WebElement getotimkiem() 
	 {
	
		 return driver.findElement(otimkiem);
	}
	public WebElement getclickbtnsuaten() 
	 {
	
		 return driver.findElement(clickbtnsuaten);
	}
	public WebElement gettextbanggia2() 
	 {
	
		 return driver.findElement(textbanggia2);
	}
	public WebElement getluu() 
	 {
	
		 return driver.findElement(luu);
	}
	public WebElement getslsp1() 
	 {
	
		 return driver.findElement(slsp1);
	}
	public WebElement gettextbanggia1() 
	 {
	
		 return driver.findElement(textbanggia1);
	}
	public WebElement gettextbanggia() 
	 {
	
		 return driver.findElement(textbanggia);
	}
	public WebElement getbtnxoabanggia() 
	 {
	
		 return driver.findElement(btnxoabanggia);
	}
	public WebElement gettitle() 
	 {
	
		 return driver.findElement(title);
	}
	public WebElement getKHsearch() 
	 {
	
		 return driver.findElement(KHsearch);
	}
	public WebElement getsearchKH() 
	 {
	
		 return driver.findElement(searchKH);
	}
	public WebElement gettextKH() 
	 {
	
		 return driver.findElement(textKH);
	}
	public WebElement getbtnLuusua() 
	 {
	
		 return driver.findElement(btnLuusua);
	}
	public WebElement getsuaten() 
	 {
	
		 return driver.findElement(suaten);
	}
	public WebElement getclickbtnchonkhachhang() 
	 {
	
		 return driver.findElement(clickbtnchonkhachhang);
	}
	public WebElement getchon1khachhang() 
	 {
	
		 return driver.findElement(chon1khachhang);
	}
	public WebElement getclickbtnchonbanggia() 
	 {
	
		 return driver.findElement(clickbtnchonbanggia);
	}
	public WebElement getchon1banggia() 
	 {
	
		 return driver.findElement(chon1banggia);
	}
	public WebElement getclickbtnchonPTTT() 
	 {
	
		 return driver.findElement(clickbtnchonPTTT);
	}
	public WebElement getchon1PTTT() 
	 {
	
		 return driver.findElement(chon1PTTT);
	}
	public WebElement getsotientra() 
	 {
	
		 return driver.findElement(sotientra);
	}
	public WebElement getnguoigiaohang() 
	 {
	
		 return driver.findElement(nguoigiaohang);
	}
	public WebElement getsanpham1() 
	 {
	
		 return driver.findElement(sanpham1);
	}
	public WebElement getsanpham2() 
	 {
	
		 return driver.findElement(sanpham2);
	}
	public WebElement getsanpham3() 
	 {
	
		 return driver.findElement(sanpham3);
	}
	public WebElement getgiamtien() 
	 {
	
		 return driver.findElement(giamtien);
	}
	public WebElement getgiamtheophantram() 
	 {
	
		 return driver.findElement(giamtheophantram);
	}
	public WebElement getgiamtheosotien() 
	 {
	
		 return driver.findElement(giamtheosotien);
	}
	public WebElement getthue() 
	 {
	
		 return driver.findElement(thue);
	}
	public WebElement getthue5phantram() 
	 {
	
		 return driver.findElement(thue5phantram);
	}
}
