package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events_Mouse_Hover 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Jobs_link=driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Jobs_link).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='IT jobs']")).click();
	}

}
