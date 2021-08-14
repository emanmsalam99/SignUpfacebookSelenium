package pages;

import java.io.File;
import java.io.FileInputStream;

import test.Base;


public class PropertiesFiles extends Base {
	public static void readPro() throws Exception {
		File f = new File("./src/main/resources/readData.properties");
		FileInputStream fs = new FileInputStream(f);
		pro.load(fs);
	}
}