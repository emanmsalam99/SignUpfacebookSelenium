package test;
import pages.Actions;
import pages.PropertiesFiles;
import pages.SignUpLocaters;

public class facebookSignup  {

		 public static void SignUpTofacebook() {
		       Actions.readData(SignUpLocaters.FirstName,PropertiesFiles.pro.getProperty("FirstName"));
			   Actions.readData(SignUpLocaters.LastName,PropertiesFiles.pro.getProperty("LastName"));
			   Actions.readData(SignUpLocaters.regEmail,PropertiesFiles.pro.getProperty("regEmail"));
			   Actions.readData(SignUpLocaters.conEmail,PropertiesFiles.pro.getProperty("conEmail"));
			   Actions.readData(SignUpLocaters.pass,PropertiesFiles.pro.getProperty("pass"));
			   
			   Actions.selectValueFromDropDown(SignUpLocaters.day, PropertiesFiles.pro.getProperty("day"));
			   Actions.selectValueFromDropDown(SignUpLocaters.month, PropertiesFiles.pro.getProperty("month"));
			   Actions.selectValueFromDropDown(SignUpLocaters.year, PropertiesFiles.pro.getProperty("year"));

			   Actions.clickButton(SignUpLocaters.gender);
			   Actions.clickButton(SignUpLocaters.signup);
	 }
}