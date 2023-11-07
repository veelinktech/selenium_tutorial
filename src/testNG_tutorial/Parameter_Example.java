package testNG_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Parameter_Example 
{
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void setUp(String browser)
	{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumDrivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "");
			
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "");
			
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Given browser is wrong");
		}
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		SoftAssert soft=new SoftAssert();
		
		String actual_Title=driver.getTitle();
		
		soft.assertEquals(actual_Title, "Facebook – log in or sign up");
		
		String actual_url=driver.getCurrentUrl();
		
		soft.assertEquals(actual_url, "https://www.facebook.com/");
		
		String actual_homepage_text=driver.findElement(By.className("_8eso")).getText();
		
		soft.assertEquals(actual_homepage_text, "Facebook helps you connect and share with the people in your life.");
		
		soft.assertAll();
		
		driver.close();
	}

}
