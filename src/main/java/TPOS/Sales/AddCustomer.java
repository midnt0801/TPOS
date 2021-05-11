package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomer {
	public WebDriver driver;
	By Nhapten=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[2]/h1/input");
	By ngaysinh=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/input");
	By DienThoai=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[2]/tbody/tr[1]/td[2]/div/input");
	By Email=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[2]/tbody/tr[2]/td[2]/input");
	By nhomkhachhang=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[1]/tbody/tr[3]/td[2]/div[1]/div");
	By street=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[1]/input");
	By city=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[2]/span/span/input");
	By district=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/span/span/input");
	By commune=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[4]/span/span/input");
	By pricelist=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[3]/td[2]/span[1]/span/input");
	By defaultdiscount=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[4]/td[2]/span/span/input[1]");
	By BtnLuuKH=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/footer[1]/button[1]/span[1]");
	
	
	//DANH MUC KHACH HANG
	By clickdanhmuc=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[11]/a");
	By clickKhachhang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[11]/ul/li[5]/a");
	By clickBtnThemKhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[1]/div/div/button[1]");
	By clickLuuThemkhachhang1=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
	By clickThemlaikhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[1]/div[1]/div/div[1]/button[2]");
	By ngaysinh1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/input");
	By email1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[2]/tbody/tr[2]/td[2]/input");
	By nhomkh1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[3]/td[2]/div[1]/div");
	By street1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/input");
	By city1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[2]/span/span/input");
	By district1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[3]/span/span/input");
	By Commune1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[4]/span/span/input");
	By prictlist1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[3]/td[2]/span[1]/span/input");
	By defaultdiscount1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[4]/div/div[1]/div/table[1]/tbody/tr[4]/td[2]/span/span/input[1]");
	By calender1=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[3]/table[1]/tbody/tr[2]/td[2]/span[1]/span/span[2]");
	public AddCustomer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	public WebElement getngaysinh1() 
	{
	
		 return driver.findElement(ngaysinh1);
	}
	public WebElement getemail1() 
	{
	
		 return driver.findElement(email1);
	}
	public WebElement getnhomkh1() 
	{
	
		 return driver.findElement(nhomkh1);
	}
	public WebElement getstreet1() 
	{
	
		 return driver.findElement(street1);
	}
	public WebElement getcity1() 
	{
	
		 return driver.findElement(city1);
	}
	public WebElement getdistrict1() 
	{
	
		 return driver.findElement(district1);
	}
	public WebElement getCommune1() 
	{
	
		 return driver.findElement(Commune1);
	}	
	public WebElement getpricelist1() 
	{
		
		 return driver.findElement(prictlist1);
	}
	public WebElement getdefaultdiscount1() 
	{
	
		 return driver.findElement(defaultdiscount1);
	}	
	public WebElement getclickThemlaikhachhang() 
	{
	
		 return driver.findElement(clickThemlaikhachhang);
	}
	public WebElement getclickLuuThemkhachhang1() 
	{
	
		 return driver.findElement(clickLuuThemkhachhang1);
	}
	public WebElement getclickdanhmuc() 
	{
	
		 return driver.findElement(clickdanhmuc);
	}	
	public WebElement getclickKhachhang() 
	{
		
		 return driver.findElement(clickKhachhang);
	}	
	public WebElement getclickBtnThemKhachhang() 
	{
		
		 return driver.findElement(clickBtnThemKhachhang);
	}
	public WebElement getngaysinh() 
	{
	
		 return driver.findElement(ngaysinh);
	}
	public WebElement getEmail()   
	{
		
		 return driver.findElement(Email);
	} 
	public WebElement getnhomkhachhang() 
	{
		
		 return driver.findElement(nhomkhachhang);
	} 
	public WebElement getstreet() 
	{
		
		 return driver.findElement(street);
	}
	public WebElement getcity() 
	{
		
		 return driver.findElement(city);
	}
	public WebElement getdistrict() 
	{
		
		 return driver.findElement(district);
	}
	public WebElement getcommune() 
	{
		
		 return driver.findElement(commune);
	}
	public WebElement getpricelist() 
	{
		
		 return driver.findElement(pricelist);
	}
	public WebElement getdefaultdiscount() 
	{
		
		 return driver.findElement(defaultdiscount);
	}	
	public WebElement getNhapten() 
	{
	
		 return driver.findElement(Nhapten);
	}
	public WebElement getDienThoai() 
	{
	
		 return driver.findElement(DienThoai);
	}
	 public WebElement getBtnLuuKH() 
	{
	
		 return driver.findElement(BtnLuuKH);
	}
}
