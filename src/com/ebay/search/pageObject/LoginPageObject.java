package com.ebay.search.pageObject;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.libraries.GenericFunction;
import com.ebay.results.ExtentResults;

public class LoginPageObject {
	WebDriver driver;
	WebDriverWait wait;
	GenericFunction genericFunction;
	
	public LoginPageObject(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.wait = wait;
		this.genericFunction=new GenericFunction(driver, wait);
	}
	
	
	 //Method to click signin button
	public void clickSigninButton() throws Exception
	{
		genericFunction.check_for_element_by_xpath("//a[@class='login']", "Failed to click signin button");

	}
	
	//Method to enter username
	public void enterUsername(String username) throws Exception
	{
		genericFunction.enter_Text_By_Xpath("input[@id='email']", username, "Failed to enter username");
	}
	
	//Method to enter password
	public void enterPassword(String password) throws Exception
	{
		genericFunction.enter_Text_By_Xpath("//input[@id='passwd']", password, "Failed to enter password");
	}
	
	//Method to click signin button
	public void clicksigninbutton() throws Exception
	{
		genericFunction.click_By_Xpath("//button[@id='SubmitLogin']", "Failed to Signin button");
	}
	
	
	
	
	
	
	
	
}
