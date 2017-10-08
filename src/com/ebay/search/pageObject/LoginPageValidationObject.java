package com.ebay.search.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.libraries.GenericFunction;

public class LoginPageValidationObject {
	WebDriver driver;
	WebDriverWait wait;
	GenericFunction genericFunction;
	
	public LoginPageValidationObject(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.wait = wait;
		this.genericFunction=new GenericFunction(driver, wait);
	}
	
	//Method to get validation message for wrong password
	public void getvalidationforwrongpwd () throws Exception{
		genericFunction.get_Text_By_xpath("//div[@class='alert alert-danger']//li", "Authentication is Required");
	}

	//Method to get validation message for empty username
	public void getvalidationforemptyusername () throws Exception{
		genericFunction.get_Text_By_xpath("//div[@class='alert alert-danger']//li", "An email address is Required");
	}
	//Method to get validation message for empty password
	public void getvalidationforemptypassword () throws Exception{
		genericFunction.get_Text_By_xpath("//div[@class='alert alert-danger']//li", "Password is Required");
	}
}
