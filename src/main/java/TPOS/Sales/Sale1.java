package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sale1 {
public WebDriver driver;
	//Khách hàng
	By clickbtnchonkhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/span[2]");
	By chon1khachhang=By.xpath("/html/body/div[5]/div/div[2]/ul/li[3]");
	By suaten=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/h1/input");
	By btnLuusua=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[1]");
	By textKH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/input");
	By searchKH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[3]");
	By KHsearch=By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[10]/td[1]/span");
	By title=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/span[1]");
	//bảng giá
	By clickbtnchonbanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/span[2]");
	By chon1banggia=By.xpath("/html/body/div[6]/div/div[2]/ul/li[4]");
	By textbanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/input");
	By btnxoabanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/span[1]");
	By textbanggia1=By.xpath("/html/body/div[6]/div/div[2]/ul/li[2]");
	By textbanggia2=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]");
	//
	By clickbtnchonPTTT=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/span/span/span[2]");
	By chon1PTTT=By.xpath("/html/body/div[7]/div/div[2]/ul/li[1]");
	By sotientra=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/span/span/input[1]");
	By nguoigiaohang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[5]/div/input");
	By sanpham1=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr[6]/td[2]/div");
	By sanpham2=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr[17]/td[2]/div");
	By sanpham3=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr[11]/td[2]");
	By giamtien=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/button");
	By giamtheophantram=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/span/span/input[2]");
	By giamtheosotien=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[2]/td[2]/div/div[2]/div/table/tbody/tr[2]/td[2]/span/span/input[1]");
	By thue=By.xpath("//*[@id=\"detailScroller\"]/div[1]/div/div/div/table[2]/tbody/tr[3]/td[2]/button");
	By thue5phantram=By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]");
	By slsp1=By.xpath("//*[@id=\"table_details\"]/tbody/tr/td[3]/span[1]/span/input[1]");
	By luu=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[4]");
	
	
	public Sale1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
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
