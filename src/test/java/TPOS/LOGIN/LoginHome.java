package TPOS.LOGIN;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dataDriven.dataLogin;

import resources.base;




public class LoginHome {

	
	

//	 @Test(dataProvider="1", priority = 1)
//	public void Loginunsuccessful(String Username,String Password) throws IOException, Exception
//	{
//		driver.get(prop.getProperty("url"));
//		//		
//		Login1 l=new Login1(driver);
//		l.getEmail().sendKeys(Username);
//		l.getPassword().sendKeys(Password);
//		boolean checkUsername= false;
//		if (Username.length() <=100)
//		{
//			checkUsername = true;
//		}
//		Assert.assertTrue(checkUsername);
//		 System.out.println("Test completed");
//		l.getLogin().click();
//		Thread.sleep(3000);
//		String actualUrl = driver.getCurrentUrl();
//		String expectedUrl = "https://tmt30.tpos.vn/#/account/login";
//		System.out.println(actualUrl);
//		System.out.println(expectedUrl);
//		Assert.assertEquals(actualUrl,expectedUrl); }  



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
 }
//			File file = new File("Cookies.data");							
//	        try		
//	        {	  
//	            // Delete old file if exists
//				file.delete();		
//	            file.createNewFile();			
//	            FileWriter fileWrite = new FileWriter(file);							
//	            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
//	       	
//	            	
//	            // loop for getting the cookie information 		
//	            for(Cookie ck : driver.manage().getCookies())							
//	            {			
//	                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
//	                Bwrite.newLine();             
//	            }			
//	            Bwrite.close();			
//	            fileWrite.close();	
//	            
//	        }
//	        catch(Exception ex)					
//	        {		
//	            ex.printStackTrace();			
//	        }	
//		}
		
//	 @AfterTest
//	  public void tearDown() throws Exception {
//			Thread.sleep(5000);
//		
//	         driver.quit();
//	      }
//	
//
//	@DataProvider(name = "1")
//	public Object[][] getData() {
//		String excelPath = "C:\\Users\\TMT\\eclipse-workspace\\LOGIN\\data\\Login.XML.xlsx";
//		Object data[][] = testData(excelPath, "Sheet1");
//		return data;
//
//	}
//
//	@SuppressWarnings("static-access")
//	public static Object[][] testData(String excelPath, String sheetName) {
//
//		dataLogin excel = new dataLogin(excelPath, sheetName);
//
//		int rowCount = excel.getRowCount();
//		int colCount = excel.getColCount();
//
//		Object data[][] = new Object[rowCount - 1][colCount];
//
//		for (int i = 1; i < rowCount; i++) {
//		
//			for (int j = 0; j < colCount; j++) {
//
//				String cellDataString = excel.getCellDataString(i, j);
//				System.out.print(cellDataString + " | ");
//				data[i - 1][j] = cellDataString;
//
//			}
//			System.out.println();
//		}
//		return data;
//	}
//	

