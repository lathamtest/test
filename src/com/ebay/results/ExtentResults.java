package com.ebay.results;

import java.io.File;

import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentResults {
	
	public static ExtentReports extreports = new ExtentReports(System.getProperty("user.dir")+File.separator+"ExtentReports.html", true);
	public static ExtentTest log;
	
	
	public void createtestcase(String testcasename, String testname) throws Exception {
	
		log = extreports.startTest(testcasename);
		log.assignCategory(testname);
		extreports.endTest(log);
		
	}
	
	//Method to write data in extent report
	public void assertEquals(Object actual, Object expected, String message) {
		
		try
		{
			Assert.assertEquals(actual, expected, message);
			log.log(LogStatus.PASS, message);
		}
		catch(AssertionError e)
		{
			log.log(LogStatus.FAIL, message, e);
			Assert.assertEquals(actual, expected, message);
		}
		finally
		{
			extreports.endTest(log);
			extreports.flush();
		}
		
	}
	
		
	
}
