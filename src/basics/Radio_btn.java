package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_btn {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		WebElement male_radio=driver.findElement(By.xpath("//input[starts-with(@id,'u_')][@value='2']"));
		
		
		boolean f1=male_radio.isSelected();
		
		System.out.println("by default it is selected = "+ f1);
		
		male_radio.click();

		
		boolean f2=male_radio.isSelected();
		
		System.out.println("After clicking = "+ f2);
		
		boolean f3=male_radio.isEnabled();
		
		System.out.println("Radio button enable = "+ f3);
		
		
		boolean f4=male_radio.isDisplayed();
		
		System.out.println("Radio button display = "+ f4);
		
	}

}
