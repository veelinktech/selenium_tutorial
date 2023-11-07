package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// entire table
		/*List<WebElement> ele1=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(WebElement aa : ele1)
		{
			System.out.println(aa.getText());
		}*/
		
		
		//Entire row
		/*String single_row=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]")).getText();
		
		System.out.println(single_row);*/
		
		
		//single column
		String single_col=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]")).getText();
		
		System.out.println(single_col);

	}

}
