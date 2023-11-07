package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		String actual_url=driver.getCurrentUrl();
		
		System.out.println(actual_url);
		
		driver.close();
	}

}
