package TPOS.LOGIN;


import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dataDriven.dataLogin;

import org.openqa.selenium.WebDriver;

import resources.base;




public class LoginHome {
	
	public static WebDriver driver;
	public static Properties prop;
	static TestNG testNg;
	public static void main(String args[]) {
		Listener ext=new Listener();
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {LoginHome.class});
		testNg.addListener(ext);
		testNg.run();
		  }
		
	
	

	 @Test(dataProvider="1", priority = 1)
	public void Loginunsuccessful(String Username,String Password) throws IOException, Exception
	{
		driver.get(prop.getProperty("url"));
		
		Login1 l=new Login1(driver);
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		boolean checkUsername= false;
		if (Username.length() <=100)
		{
			checkUsername = true;
		}
		Assert.assertTrue(checkUsername);
		 System.out.println("Test completed");
		l.getLogin().click();
		Thread.sleep(3000);
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/account/login";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Assert.assertEquals(actualUrl,expectedUrl); }  



	@BeforeTest
	public void initialize() throws IOException
	{
		if (base.driver == null)
			base.initializeDriver();
	}
	@Test(priority = 2)
	public void loginsuccessful() throws Exception {
	
		base.driver.get(base.prop.getProperty("url"));
		Login1 l = new Login1(base.driver);
		l.getEmail().sendKeys("admin");
		l.getPassword().sendKeys("123123@");
		l.getLogin().click();	
		Thread.sleep(3000);
		//driver.get("https://test5.tpos.dev/#/account/login");
		String actualUrl = base.driver.getCurrentUrl();
		String expectedUrl = "https://tmt30.tpos.vn/#/app/dashboard";
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Assert.assertEquals(actualUrl,expectedUrl);
	}

		
	 @AfterTest
	  public void tearDown() throws Exception {
			Thread.sleep(5000);
		
	         driver.quit();
	      }
	

	@DataProvider(name = "1")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\TMT\\eclipse-workspace\\LOGIN\\data\\Login.XML.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;

	}

	@SuppressWarnings("static-access")
	public static Object[][] testData(String excelPath, String sheetName) {

		dataLogin excel = new dataLogin(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
		
			for (int j = 0; j < colCount; j++) {

				String cellDataString = excel.getCellDataString(i, j);
				System.out.print(cellDataString + " | ");
				data[i - 1][j] = cellDataString;

			}
			System.out.println();
		}
		return data;
	}
}

