package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_wait {
	
	//driver can wait for a particular time to load particular web element into the web page

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user1");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password1");
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']")));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
	}

}
