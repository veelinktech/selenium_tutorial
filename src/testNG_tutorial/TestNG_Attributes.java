package testNG_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Attributes 
{
	
WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(priority = 6, enabled = false)
	public void verifyTitle()
	{
		String actual_Title=driver.getTitle();
		
		Assert.assertEquals(actual_Title, "Facebook – log in or sign up");
	}
	
	@Test(priority = 1, invocationCount = 4)
	public void verifyUrl()
	{
		String actual_url=driver.getCurrentUrl();
		
		Assert.assertEquals(actual_url, "https://www.facebook.com/");
	}
	
	@Test(priority = 5, description = "it is used to verify the password spell check")
	public void verifyForgottenpassword()
	{
		String forgot_pass_spell=driver.findElement(By.partialLinkText("gotten")).getText();
		
		Assert.assertEquals(forgot_pass_spell,"Forgotten password?");
	}
	
	@Test(priority = 4)
	public void verifyUsernametextboxPlaceholder() 
	{
		String actual_un_placeholder=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		
		Assert.assertEquals(actual_un_placeholder, "Email address or phone number");
	}
	
	@Test(priority = 7)
	public void verifyUsernametextboxHeight()
	{
		int actual_height=driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight();
		
		Assert.assertEquals(actual_height, 52);
	}
	
	@Test(priority = 3)
	public void verifyUsernametextboxWidth()
	{
		int actual_width=driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth();
		
		Assert.assertEquals(actual_width, 364);
	}
	
	@Test(priority = 2)
	public void verifyLoginbuttonisenable()
	{
		boolean f1=driver.findElement(By.name("login")).isEnabled();
		
		//Assert.assertEquals(f1, false);
		
		Assert.assertTrue(f1);
	}

	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
