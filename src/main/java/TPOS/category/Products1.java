package TPOS.category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products1 {
	public WebDriver driver;
	//NHÓM SẢN PHẨM
	By nhapten=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div/div/div[1]/table/tbody/tr[1]/td[2]/input");
	By nhomcha=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div/div/div[1]/table/tbody/tr[2]/td[2]/span/span/input");
	By thutu=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[2]/div/div/div[1]/table/tbody/tr[3]/td[2]/span[1]/span/input[1]");
	By clicknhomsanpham=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[11]/ul/li[10]/a");
	By clickthemnsp=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div/div[1]/div/button");
	By clickluu=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div/div[2]/button[1]");
	By clickthemlai=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div/div[1]/button[2]");
	//SẢN PHẨM
	By clicksanpham=By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[11]/ul[1]/li[11]/a[1]");
	By clickthemsanpham=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div/div[2]/div[1]/div/button[1]");
	By nhaptensp=By.xpath("//*[@id=\"form_Product\"]/div/div/div[2]/h1/input");
	By mavach=By.xpath("//*[@id=\"form_Product\"]/div/div/div[3]/div/div[1]/div/table[1]/tbody/tr[3]/td[2]/input");
	By clknsp=By.xpath("//*[@id=\"form_Product\"]/div/div/div[3]/div/div[1]/div/table[1]/tbody/tr[4]/td[2]/div[1]/div/span[1]/span/input");
	By soluongthucte=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/span[1]/span[1]/input[1]");
	By giaban=By.xpath("//*[@id=\"form_Product\"]/div/div/div[3]/div/div[1]/div/table[2]/tbody/tr[1]/td[2]/span[1]/span/input[1]");
	By chietkhauban=By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[2]/td[2]/span[1]/span[1]/input[2]");
	By giamuamacdinh=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[3]/td[2]/span[1]/span[1]/input[1]");
	By chietkhaumua=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[4]/td[2]/span[1]/span[1]/input[2]");
	By giavon=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[5]/td[2]/span[1]/span[1]/input[2]");
	By clickluusanpham=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]");
	By clickthemlaisp=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
	By thongbao=By.xpath("");
	public Products1(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebElement getclickluusanpham() 
	 {
	
		 return driver.findElement(clickluusanpham);
	}
	public WebElement getclickthemlaisp() 
	 {
	
		 return driver.findElement(clickthemlaisp);
	}
	public WebElement getthongbao() 
	 {
	
		 return driver.findElement(thongbao);
	}
	public WebElement getclicksanpham() 
	 {
	
		 return driver.findElement(clicksanpham);
	}
	public WebElement getclickthemsanpham() 
	 {
	
		 return driver.findElement(clickthemsanpham);
	}
	public WebElement getnhaptensp() 
	 {
	
		 return driver.findElement(nhaptensp);
	}
	public WebElement getmavach() 
	 {
	
		 return driver.findElement(mavach);
	}
	public WebElement getclknsp() 
	 {
	
		 return driver.findElement(clknsp);
	}
	public WebElement getsoluongthucte() 
	 {
	
		 return driver.findElement(soluongthucte);
	}
	public WebElement getgiaban() 
	 {
	
		 return driver.findElement(giaban);
	}
	public WebElement getchietkhauban() 
	 {
	
		 return driver.findElement(chietkhauban);
	}
	public WebElement getgiamuamacdinh() 
	 {
	
		 return driver.findElement(giamuamacdinh);
	}
	public WebElement getchietkhaumua() 
	 {
	
		 return driver.findElement(chietkhaumua);
	}
	public WebElement getgiavon() 
	 {
	
		 return driver.findElement(giavon);
	}
	
	public WebElement getnhapten() 
	 {
	
		 return driver.findElement(nhapten);
	}
	public WebElement getnhomcha() 
	 {
	
		 return driver.findElement(nhomcha);
	}
	public WebElement getthutu() 
	 {
	
		 return driver.findElement(thutu);
	}
	public WebElement getclicknhomsanpham() 
	 {
		
		 return driver.findElement(clicknhomsanpham);
	}
	public WebElement getclickthemnsp() 
	 {
	
		 return driver.findElement(clickthemnsp);
	}
	public WebElement getclickluu() 
	 {
	
		 return driver.findElement(clickluu);
	}
	public WebElement getclickthemlai() 
	 {
	
		 return driver.findElement(clickthemlai);
	}

}
