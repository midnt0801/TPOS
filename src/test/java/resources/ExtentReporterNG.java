package resources;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	private static ExtentReports extent;
	
	public static ExtentReports createInstance()
	{	
		String fileName = getReportName();
		String directory =System.getProperty("user.dir")+"/ReportsTPOS/";
		new File(directory).mkdirs();
		String path=directory+ fileName;
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setEncoding("utf-8");
		reporter.config().setDocumentTitle("Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Tester", "Diem Mi");
		extent.setSystemInfo("Company", "TMT");
		
		return extent;
		
	}

	private static String getReportName() {
		Date d=new Date();
		String fileName="AutomationReport_"+d.toString().replace(":","")+".html";
		return fileName;
	}
} 