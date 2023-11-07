package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handling {
	
	//Select  --->  SelectByVisibleText, SelectByValue, SelectByIndex

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_')]")).click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Rajesh");
		
		WebElement month_dd=driver.findElement(By.id("month"));
		
		Select sel=new Select(month_dd);
		
		sel.selectByVisibleText("Jan");
		
		Thread.sleep(5000);
		
		sel.selectByValue("5");
		
		Thread.sleep(5000);
		
		sel.selectByIndex(10);
	}

}
