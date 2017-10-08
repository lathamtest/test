package com.ebay.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.ebay.libraries.TestData;
import com.ebay.libraries.Utilities;
import com.ebay.results.ExtentResults;
import com.ebay.search.pageObject.LoginPageObject;
import com.ebay.search.pageObject.LoginPageValidationObject;

public class LoginUseCases {

	ExtentResults results = new ExtentResults();
	WebDriver driver;
	WebDriverWait wait;
	Utilities utilities = new Utilities();
	
	@BeforeTest
	public void lauchBrowser(){
		
		driver = utilities.launchBrowser();
		wait = new WebDriverWait(driver, 20);
	}
	
	@Test(dataProviderClass=TestData.class, dataProvider = "getSignInData")
	public void successfulLogin(String username, String password, String firstName) throws Exception{
		
		LoginPageObject login = new LoginPageObject(driver, wait);
		
		results.createtestcase(Thread.currentThread().getStackTrace()[1].getMethodName(), this.getClass().getSimpleName());
	
		login.enterUsername(username);
		String username1="latha1";
		
		results.assertEquals(username1, firstName, "Firstname is not matching as expected");
		login.clickSigninButton();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clicksigninbutton();
		
	}
	
	@Test(dataProviderClass=TestData.class, dataProvider = "getSignInValidationData")
	public void LoginPage(String username, String password, String firstName) throws Exception{
		
		LoginPageValidationObject validation = new LoginPageValidationObject(driver, wait);
		validation.getvalidationforwrongpwd();
		validation.getvalidationforemptyusername();
		validation.getvalidationforemptypassword();
		
	
	}
	@AfterTest
	public void quitBrowser(){
		driver.quit();
	}
	
	


	
}