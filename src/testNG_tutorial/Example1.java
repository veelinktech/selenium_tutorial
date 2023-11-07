package testNG_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	
	@Test
	public void verifyTitle()
	{
		String actual_title=driver.getTitle();
		
		System.out.println(actual_title);
	}
	
	@Test
	public void verifyUrl()
	{
		String actual_url=driver.getCurrentUrl();
		
		System.out.println(actual_url);
	}
	
	@Test
	public void verifyfbHomepagetext()
	{
		String actual_hometext=driver.findElement(By.className("_8eso")).getText();
		
		System.out.println(actual_hometext);
	}
	
	@Test
	public void verifyForgottenpassword()
	{
		String text1=driver.findElement(By.linkText("Forgotten password?")).getText();
		
		System.out.println(text1);
	}
	
	
}
