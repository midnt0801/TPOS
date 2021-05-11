package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Returns {
	public WebDriver driver;
	
	By BanhangTQ=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
	By Returns1=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]");
	By BtnThem=By.xpath("//button[@type='button'][contains(.,'Thêm')]");
	By Khachhangbtn=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/span[2]/span[1]");
	By Khachhangt3=By.xpath("/html/body/div[5]/div/div[2]/ul/li[2]");
	By Khachhangt1=By.xpath("/html/body/div[5]/div/div[2]/ul/li[10]");
	By Banggia=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[2]/span[1]");
	By Banggia1=By.xpath("/html/body/div[6]/div/div[2]/ul/li[3]");
	By PthucTT=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/span[1]/span[2]");
	By NgGH=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/input[1]");
	By Sanpham1=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[6]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]");
	By Sanpham2=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[6]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[20]/td[2]");
	By SLSP1=By.xpath("//*[@id=\"table_details\"]/tbody/tr/td[3]/span[1]/span/input[2]");
	By BtnLuu=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[3]");
	By BtnReturn=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[4]");
	By BtnXnxem=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[2]");
	By BtnXnin=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/header/div[1]/div[2]/button[1]");
	By BtnThemKH=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]");
	By Okhachhang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/input");
	By OBanggia=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/input");
	By OBanggia1=By.xpath("/html/body/div[6]/div/div[2]/ul/li[2]");
	By OBanggia1a=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/input");
	By Title=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/span[1]");
	By ErrBG=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]");
	By BtnThemKHM=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[1]");
	By BtnLuuThemKHM=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[1]");
//Del
	By XoaKH= By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/span/span/span[1]");
	By XoaBG=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/span[1]/span/span[1]");
//Fix
	By SuaKH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[2]");
	By SuaSDT=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/table[2]/tbody/tr[1]/td[2]/div/input");
	By BtnLuuSuaKH=By.xpath("/html/body/div[1]/div/div/div[3]/div/footer/button[1]");
	By SuaTP=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[3]/div[2]/div/div/div[2]/span/span/span[2]/span");
	By TP1=By.xpath("/html[1]/body[1]/div[20]/div[1]/div[2]/ul[1]/li[43]");
	By SuaTen=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[2]/h1/input");
//Search
	By BtnSearch=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/button[3]");
	By ChuyenTab=By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[3]/a[3]/span");
	By ChonKH=By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[9]/td[1]");
//WareHouse
	By OKhohang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[1]/span/input");
	By XoaKhohang=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[1]/span/span[1]");
	By Khohangbtn=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[3]/div/span[1]/span/span[2]");
	By Khohang1=By.xpath("/html[1]/body[1]/div[7]/div[1]/div[2]/ul[1]/li[12]");
	By Khohang1a=By.xpath("/html/body/div[7]/div/div[2]/ul");
//Paymentmethod
	By OPTTT=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/span/span/input");
	By XoaPTTT=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/span/span/span[1]");
	By PTTTbtn=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div/div[4]/div/span/span/span[2]");
	By PTTT1=By.xpath("//*[@id=\"caecfe6e-8ea2-4f78-9248-7918c3618960\"]");
//Products
	By OSearch=By.xpath("//*[@id=\"searchString\"]");
	By SPSearch=By.xpath("//*[@id=\"myScroller\"]/div[1]/div/div[1]/table/tbody/tr/td[2]/div");
	By OGiamgia=By.xpath("//*[@id=\"table_details\"]/tbody/tr[1]/td[6]/div/button");
	By NhapGiamgiapt=By.xpath("//*[@id=\"table_details\"]/tbody/tr[1]/td[6]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]/div/span[1]/span/input[1]");
	By VNDbtn=By.xpath("//*[@id=\"table_details\"]/tbody/tr[1]/td[6]/div/div/div[2]/div/div/table/tbody/tr[2]/td[2]/div/div/button[2]");
	By NhapGiamgiavnd=By.xpath("//*[@id=\"table_details\"]/tbody/tr[1]/td[6]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]/div/span[2]/span/input[2]");
	By XoaSPbtn=By.xpath("//*[@id=\"table_details\"]/tbody/tr[1]/td[8]/button[2]");
	By XoaAllSPbtn=By.xpath("//*[@id=\"table_details\"]/thead/tr/td/button");
	
	public Returns(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}
	public WebElement getBtnLuuThemKHN() 
	 {
	
		 return driver.findElement(BtnLuuThemKHM);
	}
	public WebElement getBtnThemKHM() 
	 {
	
		 return driver.findElement(BtnThemKHM);
	}
	public WebElement getOPTTT() 
	 {
	
		 return driver.findElement(OPTTT);
	}
	public WebElement getXoaPTTT() 
	 {
	
		 return driver.findElement(XoaPTTT);
	}
	public WebElement getPTTTbtn() 
	 {
	
		 return driver.findElement(PTTTbtn);
	}
	public WebElement getPTTT1() 
	 {
	
		 return driver.findElement(PTTT1);
	}
	
	public WebElement getKhohang1a() 
	 {
	
		 return driver.findElement(Khohang1a);
	}
	public WebElement getOKhohang() 
	 {
	
		 return driver.findElement(OKhohang);
	}
	public WebElement getXoaKhohang() 
	 {
	
		 return driver.findElement(XoaKhohang);
		 
	}
	public WebElement getOBanggia1a() 
	 {
	
		 return driver.findElement(OBanggia1a);
	}
	public WebElement getXoaBG() 
	 {
	
		 return driver.findElement(XoaBG);
	}
	public WebElement getOBanggia1() 
	 {
	
		 return driver.findElement(OBanggia1);
	}
	

	public WebElement getSuaTen() 
	 {
	
		 return driver.findElement(SuaTen);
	}

	public WebElement getErrBG() 
	 {
	
		 return driver.findElement(ErrBG);
	}
	public WebElement getTitle() 
	 {
	
		 return driver.findElement(Title);
	}
	public WebElement getOBanggia() 
	 {
	
		 return driver.findElement(OBanggia);
	}
	public WebElement getBtnSearch() 
	 {
	
		 return driver.findElement(BtnSearch);
	}
	public WebElement getOkhachhang() 
	 {
	
		 return driver.findElement(Okhachhang);
	}
	public WebElement getChuyenTab() 
	 {
	
		 return driver.findElement(ChuyenTab);
	}
	public WebElement getChonKH() 
	 {
	
		 return driver.findElement(ChonKH);
	}
	
	public WebElement getTP1() 
	 {
	
		 return driver.findElement(TP1);
	}
	
	public WebElement getSuaTP() 
	 {
	
		 return driver.findElement(SuaTP);
	}
	public WebElement getKhachhangt1() 
	 {
	
		 return driver.findElement(Khachhangt1);
	}
	public WebElement getSuaSDT() 
	 {
	
		 return driver.findElement(SuaSDT);
	}
	public WebElement getSuaKH() 
	 {
	
		 return driver.findElement(SuaKH);
	}
	 public WebElement getBtnThemKH() 
	 {
	
		 return driver.findElement(BtnThemKH);
	}
	 public WebElement getXoaKH() 
	 {
	
		 return driver.findElement(XoaKH);
	}
	 public WebElement getBanhangTQ() 
	 {
	
		 return driver.findElement(BanhangTQ);
	}
		
	 public WebElement getReturns1() 
	 {
	
		 return driver.findElement(Returns1);
	}
	
	
	 public WebElement getBtnThem() 
	 {
	
		 return driver.findElement(BtnThem);
	}
	 public WebElement getKhachhangbtn() 
	 {
	
		 return driver.findElement(Khachhangbtn);
	 } 
	 public WebElement getKhachhangt3() 
	 {
		
		 return driver.findElement(Khachhangt3);
	 }	
	
	
	 public WebElement getBanggia() 
	 {
	
		 return driver.findElement(Banggia);
	} 
	 public WebElement getBanggia1() 
	 {
	
		 return driver.findElement(Banggia1);
	}
	 public WebElement getKhohangbtn() 
	 {
		
		 return driver.findElement(Khohangbtn);
		 
	}
	 public WebElement getKhohang1()
	 {
		 return driver.findElement(Khohang1);
	 }
	 public WebElement getPthucTT() 
	 {
	
		 return driver.findElement(PthucTT);
	}
	 public WebElement getNgGH() 
	 {
	
		 return driver.findElement(NgGH);
	}
	 public WebElement getSanpham1() 
	 {
	
		 return driver.findElement(Sanpham1);
	}
	 public WebElement getSLSP1() 
	 {
	
		 return driver.findElement(SLSP1);
	}
	 public WebElement getSanpham2() 
	 {
	
		 return driver.findElement(Sanpham2);
	}
	 public WebElement getBtnLuu() 
	 {
		
		 return driver.findElement(BtnLuu);
	}
	public WebElement getBtnReturn() 
	 {
		
		 return driver.findElement(BtnReturn);
	}
	public WebElement getBtnXnxem() 
	 {
		
		 return driver.findElement(BtnXnxem);
	}
	public WebElement getBtnXnin() 
	 {
		
		 return driver.findElement(BtnXnin);
	}
	public WebElement getBtnLuuSuaKH() 
	 {
		
		 return driver.findElement(BtnLuuSuaKH);
	}
	
}
