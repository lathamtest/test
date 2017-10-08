package com.ebay.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericFunction {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public GenericFunction(WebDriver driver, WebDriverWait wait) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = wait;
	}


	//Method to check visibility of an element using xpath
	public boolean check_for_element_by_xpath(String xpath,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			driver.findElement(By.xpath(xpath)).isDisplayed();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	//Method to Click element using xpath		
	public void click_By_Xpath(String xpath,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			driver.findElement(By.xpath(xpath)).click();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to Click element using id
	public void click_By_Id(String id,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
			driver.findElement(By.id(id)).click();
		}catch(Exception e){
			throw new Exception(errormessage);
		}	}
	
	//Method to Click element using class name
	public void click_By_ClassName(String classname,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(classname))));
			driver.findElement(By.className(classname)).click();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to enter text using xpath 
	public void enter_Text_By_Xpath(String xpath,String text,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			driver.findElement(By.xpath(xpath)).sendKeys(text);
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
		
	//Method to enter text using id
	public void enter_Text_By_ID(String id,String text,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(text);
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to enter text using class name
	public void enter_Text_By_ClassName(String classname,String text,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(classname))));
			driver.findElement(By.id(classname)).clear();
			driver.findElement(By.id(classname)).sendKeys(text);
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
		
	
	//Method to get the text/content of the web element using xpath
	public String get_Text_By_xpath(String xpath, String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			return driver.findElement(By.xpath(xpath)).getText();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to get the text/content of the web element using class name
	public String get_Text_By_ClassName(String classname, String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(classname))));
			return driver.findElement(By.id(classname)).getText();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to get the text/content of the web element using id
	public String get_Text_By_ID(String id, String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
			return driver.findElement(By.id(id)).getText();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to get count of web elements
	public int getCount(String xpath,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			return driver.findElements(By.xpath(xpath)).size();
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
	//Method to find web element
	public WebElement getElement(String xpath,String errormessage) throws Exception{
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
			return driver.findElement(By.xpath(xpath));
		}catch(Exception e){
			throw new Exception(errormessage);
		}
	}
	
}
