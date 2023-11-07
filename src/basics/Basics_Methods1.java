package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics_Methods1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
		
		String actual_url=driver.getCurrentUrl();
		
		System.out.println(actual_url);
		
		String src=driver.getPageSource();
		
		System.out.println(src);

	}

}
