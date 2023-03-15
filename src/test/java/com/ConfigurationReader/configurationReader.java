package com.ConfigurationReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
	public static Properties p;

	public configurationReader() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\manasseh j\\\\eclipse-workspace\\\\cucumber\\\\PropertiesFile\\\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}
	public String geturl() {
String url = p.getProperty("url");
return url;
	}
public String gethair() {
	String hair = p.getProperty("gethair");
	return hair;

}
}
