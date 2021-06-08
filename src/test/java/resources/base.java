package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.SkipException;

import org.testng.annotations.Test;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;
	

	public base()
	{
		try {
			if (driver != null)
				initializeDriver();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initializeDriver() throws IOException
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
			System.setProperty("webdriver.gecko.driver", "C:\\lib selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			//	IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test 
	public void testSucessful() {
		System.out.println("Excuting Successful Test Method");
	}
	@Test
	public void testFailed() {
		System.out.println("Excuting Failed Test Method");
		Assert.fail("Executing Failed Test Method");
		
	}
	@Test
	public void testSkipped() {
		System.out.println("Executing| Test Method");
		throw new SkipException("Executing Skipped Test Method");
	}

	
	
	
//public static String takeScreenshot(WebDriver driver,String methodName) {
//	String fileName=getScreenshotName(methodName);
//	String directory= System.getProperty("user.dir")+"/screenshots/";
//	new File(directory).mkdirs();
//	String path=directory+fileName;
//	try 
//	{
//		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File(path));
//		System.out.println("**********************************");
//		System.out.println("Screenshot stored at"+ path);
//		System.out.println("**********************************");
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//		
//	}
//	
//	return path;
//}

public static String getScreenshotName(String methodName) {
	Date d =new Date();
	String fileName=methodName+""+d.toString().replace(":", "_").replace("_","_")+".html";
	return fileName;
	}
	

public static String takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);

	// after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName + dateName + ".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}
}
	
	
//	//After complete execution send pdf report by email
//		@AfterSuite
//		public void tearDown(){
//			sendPDFReportByGMail("midnt0801@gmail.com", "18520310@gm.uit.edu.vn", "PDF Report", "", "");
//		}
//		
//		/**
//		 * Send email using java
//		 * @param from
//		 * @param pass
//		 * @param to
//		 * @param subject
//		 * @param body
//		 */
//		private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
//	        Properties props = System.getProperties();
//	        String host = "smtp.gmail.com";
//	        props.put("mail.smtp.starttls.enable", "true");
//	        props.put("mail.smtp.host", host);
//	        props.put("mail.smtp.user", from);
//	        props.put("mail.smtp.password", pass);
//	        props.put("mail.smtp.port", "587");
//	        props.put("mail.smtp.auth", "true");
//
//	        Session session = Session.getDefaultInstance(props);
//	        MimeMessage message = new MimeMessage(session);
//
//	        try {
//	        	//Set from address
//	            message.setFrom(new InternetAddress(from));
//	             message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//	           //Set subject
//	            message.setSubject(subject);
//	            message.setText(body);
//	          
//	            BodyPart objMessageBodyPart = new MimeBodyPart();
//	            
//	            objMessageBodyPart.setText("Report result file!");
//	            
//	            Multipart multipart = new MimeMultipart();
//
//	            multipart.addBodyPart(objMessageBodyPart);
//
//	            objMessageBodyPart = new MimeBodyPart();
//
//	            //Set path to the pdf report file
//	            String filename = System.getProperty("user.dir")+"\\Default test.pdf"; 
//	            //Create data source to attach the file in mail
//	            DataSource source = new FileDataSource(filename);
//	            
//	            objMessageBodyPart.setDataHandler(new DataHandler(source));
//
//	            objMessageBodyPart.setFileName(filename);
//
//	            multipart.addBodyPart(objMessageBodyPart);
//
//	            message.setContent(multipart);
//	            Transport transport = session.getTransport("smtp");
//	            transport.connect(host, from, pass);
//	            transport.sendMessage(message, message.getAllRecipients());
//	            transport.close();
//	        }
//	        catch (AddressException ae) {
//	            ae.printStackTrace();
//	        }
//	        catch (MessagingException me) {
//	            me.printStackTrace();
//	        }
//	    }

	

	

