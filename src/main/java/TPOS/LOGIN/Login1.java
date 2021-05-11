package TPOS.LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	
	public WebDriver driver;
	
	
	By email=By.xpath("//div[@id='app']/div/div/div/form/div[2]/div/input");
	By password=By.xpath("//div[@id='app']/div/div/div/form/div[2]/div[2]/input");
	By login=By.xpath("//button[contains(text(),'Đăng nhập')]");
	By forgotPassword = By.xpath("//*[@id=\"app\"]/div/div/div[1]/form/div[3]/a");
	By signin=By.xpath("//*[@id=\"app\"]/div/div/a");
	By title=By.xpath("//*[@id=\"app\"]/div/div/a");
	By title1=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]");
	By NavBar=By.xpath("//*[@id=\"app\"]/div/div/a");
	By Loginfail = By.xpath("//*[@id=\"app\"]/div/div/div[1]/form/div[1]");
	By ForgetPwd1=By.xpath("//*[@id=\"app\"]/div/div/div[1]/form/div[3]/a");
	//By QuitAds= By.xpath("/html/body/div[1]/div/div/div[1]/button");
	By getEml= By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]");
	By Btnfgt=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
	
	
	public Login1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	//public WebElement getQuitAds() {
		//return driver.findElement(QuitAds);
	//}
	public WebElement getgetEml()
	{
		return driver.findElement(getEml);
	}
	public WebElement getBtnfgt()
	{
		return driver.findElement(Btnfgt);
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);	 
		 
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getTitle1()
	{
		return driver.findElement(title1);
	}
	public WebElement getLoginfail()
	{
		return driver.findElement(Loginfail);
	
	
	
	}


	public WebElement getForgetPwd1() {
		// TODO Auto-generated method stub
		return driver.findElement(ForgetPwd1);
	}
}
