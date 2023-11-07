package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Methods2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement un=driver.findElement(By.id("email"));
		
		String f1=un.getAttribute("placeholder");
		
		System.out.println(f1);
		
		int un_height=un.getSize().getHeight();
		
		System.out.println(un_height);
		
		int un_width=un.getSize().getWidth();
		
		System.out.println(un_width);
		
		un.sendKeys("Uma");
		
		String f2=un.getAttribute("value");
		
		System.out.println(f2);
		
		String css1=un.getCssValue("background");
		
		System.out.println(css1);
		
		String css2=un.getCssValue("color");
		
		System.out.println(css2);
		
		String css3=un.getCssValue("font-size");
		
		System.out.println(css3);
		
		String s1=un.getTagName();
		
		System.out.println(s1);
		
		
	}

}
