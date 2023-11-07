package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
		
		/*for(WebElement aa : ele)
		{
			System.out.println(aa.getText());
		}*/
		
		for(WebElement bb : ele)
		{
			if(bb.getText().equals("selenium rich foods"))
			{
					bb.click();
					break;
			}
		}
	}

}
