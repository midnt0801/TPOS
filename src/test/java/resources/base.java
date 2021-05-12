package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import TPOS.Sales.AddCustomer;
//
//import dataDriven.DataCustomer;
//import dataDriven.dataLogin;
//import org.testng.Assert;
//
//import TPOS.LOGIN.Login1;
//import TPOS.LOGIN.LoginHome;

	public class base {
		public WebDriver driver;
		public Properties prop;
		/*
		 * public static WebDriver getDriver1(){ if(driver==null){
		 * 
		 * driver = new ChromeDriver(); } return driver; }
		 */
		public base() 
		{
			try {
				this.initializeDriver();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public WebDriver initializeDriver() throws IOException
		{
	
			prop= new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\TMT\\eclipse-workspace\\LOGIN\\src\\test\\java\\resources\\data.properties");
	
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			System.out.println(browserName);

			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\lib selenium\\chromedriver.exe");
			 
				 driver= new ChromeDriver();
				 driver.manage().window().maximize();

		//execute in chrome driver
	
			}
			else if (browserName.equals("firefox"))
			{
				driver= new FirefoxDriver();
				//firefox code
			}
			else if (browserName.equals("IE"))
			{
				//	IE code
			}
	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;

		}
		
		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File source =scrShot.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\Report_picture\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;


		}


	}
