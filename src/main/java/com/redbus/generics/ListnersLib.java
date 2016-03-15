package com.redbus.generics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.redbus.scripts.SuperTestNG;

public class ListnersLib implements ITestListener{
	
	String value;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
//		String value = UtilLib.dateAppend();
		
		//value = getDate();		
		System.setProperty("DateTime", value);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	File f = ((TakesScreenshot)SuperTestNG.driver).getScreenshotAs(OutputType.FILE);
	
	
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		
	//	String value = UtilLib.dateAppend();
	//	System.setProperty("DateTime", value);
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
