package basics;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taking_all_values_from_dd {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_')]")).click();
		
		WebElement year_dd=driver.findElement(By.id("year"));
		
		Select se=new Select(year_dd);
		
		List<WebElement> li=se.getOptions();

		System.out.println(li.size());
		
		Iterator<WebElement> it=li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
	}

}
