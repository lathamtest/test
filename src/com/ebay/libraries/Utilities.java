package com.ebay.libraries;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	WebDriver driver;
	WebDriverWait wait;
	
	// To launch Firefox browser as per latest selenium version 3.5.0 using wrapper Gecko browser
	public WebDriver launchBrowser(){
		
		if(System.getProperty("os.name").contains("Windows")){
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"geckodriver.exe");
		}
		else{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+File.separator+"geckodriver.app");	
		}
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	
	
}
