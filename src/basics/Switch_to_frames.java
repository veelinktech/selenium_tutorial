package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_frames {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String web_text1=driver.findElement(By.xpath("//a[@class='moneyicon relative']")).getText();
		
		System.out.println(web_text1);
		
		//driver.switchTo().frame("moneyiframe"); //id or name
		
		//driver.switchTo().frame(0); //index
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@title='Rediff Money Widget']"));
		
		driver.switchTo().frame(f1);
		
		String text2=driver.findElement(By.xpath("//span[text()='BSE']")).getText();
		
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		
		String web_text2=driver.findElement(By.xpath("//a[@title='Enterprise Email']")).getText();
		
		System.out.println(web_text2);
		
	}

}
