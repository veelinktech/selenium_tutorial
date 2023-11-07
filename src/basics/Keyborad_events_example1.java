package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyborad_events_example1 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.partialLinkText("Create new ")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ragul");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys("B")
		
		.sendKeys(Keys.TAB).sendKeys("ragulb@gmail.com")
		
		.sendKeys(Keys.TAB).sendKeys("ragulb@gmail.com").build().perform();
		
		
		
	}

}
