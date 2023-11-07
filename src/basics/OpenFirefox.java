package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) 
	{
	
		System.setProperty("Webdriver.gecko.driver", "D:\\SeleniumDrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		
	}

}
