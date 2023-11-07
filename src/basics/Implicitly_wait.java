package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_wait {
	
	//driver can wait for a particular time to load all the web elements into the web page

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user1");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password1");
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
	}

}
