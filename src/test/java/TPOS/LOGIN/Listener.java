package TPOS.LOGIN;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import java.util.Arrays;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.markuputils.Markup;
import resources.ExtentReporterNG;
import resources.base;
import com.aventstack.extentreports.markuputils.ExtentColor;

public class Listener implements ITestListener {
	private static  ExtentReports extent =ExtentReporterNG.createInstance();
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		ExtentTest test= extent.createTest(result.getTestClass().getName()+"::"
												+result.getMethod().getMethodName());
		extentTest.set(test);

	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:- "+ methodName.toUpperCase()+ " PASSED"+"</b>";
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		extentTest.get().pass(m);
		
	}
	

	public void onTestFailure(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
//		String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
		extentTest.get().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		extentTest.get().log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//		extentTest.get().fail("<details><summary><b><font color=red>" + "Exception Occured, click to see details:"
//			+ "</font></b></summary>"+ "</details>"+" \n");
		
		WebDriver driver=base.driver;
		String path = null;
		try {
			path = base.takeScreenshot(driver,result.getMethod().getMethodName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try 
		{
			extentTest.get().fail("<b><font color=red>"+"Screenshot of failure"+"</font></b>",
					MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		} 
		catch (IOException e) { 
			extentTest.get().fail("Test Failed, cannot attach screenshot");
		}
		String logText="<b>Test Method"+ methodName +"Failed</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		extentTest.get().log(Status.FAIL, m);
	}
	

	
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"Test Case:- "+ methodName+ " Skipped"+"</b>";		
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		extentTest.get().log(Status.SKIP,m);
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	public void onStart(ITestContext result) {

		
	}

	public void onFinish(ITestContext context) {

		if (extent != null) {
		extent.flush();
	}
	}
//	public String takeScreenshot(WebDriver driver,String methodName) {
//		String fileName=getScreenshotName(methodName);
//		String directory= System.getProperty("user.dir")+"/screenshots/";
//		new File(directory).mkdirs();
//		String path=directory+fileName;
//		try 
//		{
//			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(screenshot, new File(path));
//			System.out.println("**********************************");
//			System.out.println("Screenshot stored at"+ path);
//			System.out.println("**********************************");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//		
//		return path;
//	}
//
//	public static String getScreenshotName(String methodName) {
//		Date d =new Date();
//		String fileName=methodName+""+d.toString().replace(":", "_").replace("","_")+".html";
//		return fileName;
//	}
}

