package testNG_tutorial;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Failed_TC_Screenshot 
{
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(priority = 1)
	public void verifyTitle()
	{
		String actual_title=driver.getTitle();
		Assert.assertEquals(actual_title, "Orangehrm");
	}
	
	@Test(priority = 2)
	public void verifyUrl()
	{
		String actual_url=driver.getCurrentUrl();
		Assert.assertEquals(actual_url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 4)
	public void verifyLogin()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@Test(priority = 3)
	public void verifyLoginTitle()
	{
		String actual_login_text=driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		Assert.assertEquals(actual_login_text, "Login");
	}
	
	@AfterMethod
	public void TC_Screenshot(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(src, new File(".\\Failed_Screenshot\\Screenshot"+System.currentTimeMillis()+".png"));
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
