package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_down_and_Scroll_up {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.justdial.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(3000);
		
		WebElement gas=driver.findElement(By.xpath("//div[text()='Gas']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", gas);
		
		//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

	}

}
