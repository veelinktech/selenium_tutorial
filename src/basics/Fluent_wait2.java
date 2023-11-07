package basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait2 {
	
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
		
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajesh");
	
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
	}

}
