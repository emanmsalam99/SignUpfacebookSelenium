package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import test.Base;

public class IntializeBrowser extends Base{
	
	public static void  initDriver(){
		System.setProperty("webdriver.chrome.driver",PropertiesFiles.pro.getProperty("relPath"));
		driver=new ChromeDriver();
		driver.get(PropertiesFiles.pro.getProperty("url"));
		driver.manage().window().maximize();
		System.out.println("The title of the page is"+driver.getTitle());	
   }
}
