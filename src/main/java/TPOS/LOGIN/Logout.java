package TPOS.LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	
	public WebDriver driver;
	
	By iconlog=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[2]/li[5]/a[1]/span[1]/img[1]");
	By logout=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[2]/li[5]/ul[1]/li[3]/a[1]\r\n");

	public Logout(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
		

	public WebElement geticonlog()
	{
		return driver.findElement(iconlog);
	}
	



	public WebElement getlogout()
	{
		return driver.findElement(logout);
	}

	

}

