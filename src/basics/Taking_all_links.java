package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_all_links {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> all_link=driver.findElements(By.tagName("a"));
		
		System.out.println(all_link.size());
		
		
		//only text
		
		/*for(WebElement links : all_link)
		{
			System.out.println(links.getText());
		}*/
		
		//only href
		
		/*for(WebElement links : all_link)
		{
			System.out.println(links.getAttribute("href"));
		}*/
		
		for(WebElement links : all_link)
		{
			System.out.println(links.getAttribute("href")+"--->"+links.getText());
		}

	}

}
