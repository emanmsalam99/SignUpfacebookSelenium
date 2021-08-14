package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.IntializeBrowser;
import pages.PropertiesFiles;



public class Base {
	public static  Properties pro=new Properties();
    public static WebDriver driver;

	 @BeforeMethod
		public  void  setUpBrowser() throws Exception {
		 PropertiesFiles.readPro();
		 IntializeBrowser.initDriver();
		    
	 }
	 @Test 
	 public void facebookSignup() {
		 facebookSignup.SignUpTofacebook();
	 }
	    
	 @AfterMethod
		public void closeBrowser() throws Exception{
			driver.close();	
	}
}
