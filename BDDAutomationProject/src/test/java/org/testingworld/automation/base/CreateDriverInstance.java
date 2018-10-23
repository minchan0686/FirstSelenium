package org.testingworld.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateDriverInstance {
	
	public void generateDriverInstance()
	{
		WebDriver driver;
		ResourceBundle config=ResourceBundle.getBundle("config");
		if (config.getString("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			
		
		}
		
		else if (config.getString("browser").equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(config.getString("browser").equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
			
		}
		else
		{
			driver=new ChromeDriver();
			
		}
		
	}

}
