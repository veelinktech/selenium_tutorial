package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//single attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Java");
		
		Thread.sleep(3000);
		
		//single attribute
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		Thread.sleep(3000);
		
		//single attribute
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Python");

		//text()
		String title=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
		
		System.out.println("Text() = "+ title);
		
		
		//contains(text())
		
		String title1=driver.findElement(By.xpath("//h2[contains(text(),'connect')]")).getText();
		
		System.out.println("Contains() = "+ title1);
		
		//starts-with(text())
		String title2=driver.findElement(By.xpath("//h2[starts-with(text(),'Fa')]")).getText();
		
		System.out.println("Starts-with() = "+ title2);
		
		//contains(attribute)
		
		String cna1=driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).getText();
		
		System.out.println("Contains attribute = "+ cna1);
		
		
		//starts-with(attribute)
		
		String cna2=driver.findElement(By.xpath("//a[starts-with(@id,'u_0')]")).getText();
		
		System.out.println("Starts-with attribute " +cna2);
		
		//link text
		driver.findElement(By.linkText("Create new account")).click();
		
		//Multiple attribute
		driver.findElement(By.xpath("//input[@class='_8esa'][@value='2']")).click();
		
		//Multiple attribute
		driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).click();
		
		//text()
		
		//String t1=driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();
		
		//System.out.println(t1);
		
	
	}

}
