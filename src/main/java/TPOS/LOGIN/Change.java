
package TPOS.LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Change {
		
		public WebDriver driver;
		
		By changePwd=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/ul[2]/li[5]/ul[1]/li[2]/a[1]");
		By mkc=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
		By mkctb=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
		By mkm=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");
		By mkmtb=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]");
		By xacnhanmk=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]");
		By btnXacnhan=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]");
		By btndong=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]");
		By formtb=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
		By Confirm=By.xpath("/html/body/div[1]/div/div/div/div[3]/button[1]");
		public Change(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			
		}
		public WebElement getConfirm()
		{
			return driver.findElement(Confirm);
		}
		 public WebElement getchangePwd() 
		 {
		
			 return driver.findElement(changePwd);
		}
		 
		public WebElement getmkc()
		{
			return driver.findElement(mkc);
		}
		public WebElement getmkctb()
		{
			return driver.findElement(mkctb);
		}
		public WebElement getmkm()
		{
			return driver.findElement(mkm);
		}
		public WebElement getmkmtb()
		{
			return driver.findElement(mkmtb);
		}
		public WebElement getxacnhanmk()
		{
			return driver.findElement(xacnhanmk);
		}
		public WebElement getbtnXacnhan()
		{
			return driver.findElement(btnXacnhan);
		}
		public WebElement getbtndong()
		{
			return driver.findElement(btndong);
		}
		public WebElement getformtb()
		{
			return driver.findElement(formtb);
		}		
	
	

}




