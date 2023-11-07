package testNG_tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_Example1 
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
	
	@Test(enabled=false)
	public void verify_radiobtn()
	{
		driver.findElement(By.linkText("Create new account")).click();
		
		String male_text=driver.findElement(By.xpath("//label[text()='Male']")).getText();
		
		System.out.println("Assertion 1 start");
		
		Assert.assertEquals(male_text, "Male");
		
		System.out.println("Assertion 1 completed");
		
		WebElement male_radio=driver.findElement(By.xpath("//input[@class='_8esa'][@value='2']"));
		
		System.out.println("Assertion 2 start");
		
		Assert.assertEquals(male_radio.isDisplayed(), true);
		
		System.out.println("Assertion 2 completed");
		
		System.out.println("Assertion 3 start");
		
		Assert.assertEquals(male_radio.isSelected(), true);
		
		System.out.println("Assertion 3 completed");
		
		System.out.println("Assertion 4 start");
		
		Assert.assertEquals(male_radio.isEnabled(), true);
		
		System.out.println("Assertion 4 completed");
	}
	
	@Test
	public void verify_radio_btn_softassert()
	{
		SoftAssert soft=new SoftAssert();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		String male_text=driver.findElement(By.xpath("//label[text()='Male']")).getText();
		
		System.out.println("Assertion 1 start");
		
		soft.assertEquals(male_text, "Male");
		
		System.out.println("Assertion 1 completed");
		
		WebElement male_radio=driver.findElement(By.xpath("//input[@class='_8esa'][@value='2']"));
		
		System.out.println("Assertion 2 start");
		
		soft.assertEquals(male_radio.isDisplayed(), true);
		
		System.out.println("Assertion 2 completed");
		
		System.out.println("Assertion 3 start");
		
		soft.assertEquals(male_radio.isSelected(), true);
		
		System.out.println("Assertion 3 completed");
		
		System.out.println("Assertion 4 start");
		
		soft.assertEquals(male_radio.isEnabled(), true);
		
		System.out.println("Assertion 4 completed");
		
		soft.assertAll();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

	

}
