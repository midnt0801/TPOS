package TPOS.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddSupplier {
	public WebDriver driver;
	//MUAHANG(MUAHANG-TRAHANG)
	By clickmuahang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[8]/a");
	By clickthemMHTH=By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[1]/div[1]/div[1]/div/button");	//click thêm mua hàng trả hàng
	//MUAHANG
	By clickmucmuahang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[8]/ul/li[1]/a");
	//TRAHANG
	By clickmuctrahang=By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/ul/li[8]/ul/li[2]/a");
	
	

	public AddSupplier(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		}
		public WebElement getclickmuahang() 
		 {
		
			 return driver.findElement(clickmuahang);
		}
		public WebElement getclickthemMHTH() 
		 {
		
			 return driver.findElement(clickthemMHTH);
		}
		public WebElement getclickmucmuahang() 
		 {
		
			 return driver.findElement(clickmucmuahang);
		}
		public WebElement getclickmuctrahang() 
		 {
		
			 return driver.findElement(clickmuctrahang);
		}
}
