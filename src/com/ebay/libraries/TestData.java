package com.ebay.libraries;
import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider
	public static Object[][] getSignInData() {
		return new Object[][] { 
			{"marlabs6250@yahoo,com", "Test@123", "Latha Mahadevaiah"}};
	}
	
	
	@DataProvider
	public static Object[][] getSignInValidationData() {
		 return new Object[][] {
	        	{"marlabs6250@yahoo.com", "latha1@123" ,"Authentication Failed"}, 
	        	{"marlabs6250@yahoo.com", "", "Password is Required"},
	        	{"", "marlabs6250@yahoo.com", "An email address is required"}};
		}
	}
        

