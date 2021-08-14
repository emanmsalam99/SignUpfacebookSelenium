package pages;

	import org.openqa.selenium.By;

	public class SignUpLocaters {
		
	public static  By FirstName =By.name("firstname");
	public static By LastName =By.name("lastname");
	public static By regEmail=By.name("reg_email__");
	public static By conEmail=By.name("reg_email_confirmation__");
	public static By pass=By.name("reg_passwd__");
	
	public static By day=By.id("day");
	public static By month=By.id("month");
	public static By year=By.id("year");
	
	public static By gender=By.xpath("//input[@type='radio' and @value='2']");
	public static By signup=By.name("websubmit");
	

	}


