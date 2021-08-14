package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions extends IntializeBrowser{
	
public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}

public static void selectValueFromDropDown (By locator,String val) {
	
	Select select=new Select(getElement(locator));
	select.selectByVisibleText(val);

     }
public static void readData(By locator,String val) {
	getElement(locator).sendKeys(val);
	
}

public static void clickButton(By locator) {
	getElement(locator).click();
}
}
