package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		//id locator
		
		driver.findElement(By.id("email")).sendKeys("Ram@gmail.com");
		
		//name locator
		
		driver.findElement(By.name("pass")).sendKeys("ram@123");

		//class name
		
		String s1=driver.findElement(By.className("_8eso")).getText();
		
		System.out.println(s1);
		
		
		//linktext
		
		String s2=driver.findElement(By.linkText("Forgotten password?")).getText();
		
		System.out.println(s2);
		
		//partial link text
		
		String s3=driver.findElement(By.partialLinkText("gott")).getText();
		
		System.out.println("Partial link text = "+ s3);
	}
}
