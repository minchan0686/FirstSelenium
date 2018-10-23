package org.testingworld.automation.assertions;

import org.openqa.selenium.WebDriver;

public class Compare {
	
	public class compare {
		
		public boolean valiedatePageURL(WebDriver driver, String expectedURL)
		{
			boolean result=false;
			if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
			{
				result=true;
			} return result;
			
		}
		
		
	}

}
