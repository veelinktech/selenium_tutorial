package basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Handling {
	
	//getwindowhandle --> parent
	
	//getwindowhandles ---> child window

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver_win32_latest\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_0')]")).click();
		
		driver.findElement(By.id("terms-link")).click();
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println("Parent window title = " +driver.getTitle());
		
		Set<String> childwindow=driver.getWindowHandles();
		
		for(String child  : childwindow)
		{
			if(!parentwindow.equals(child))
			{
				driver.switchTo().window(child);
				
				System.out.println("Child window title = "+ driver.getTitle());
				
				String child_text=driver.findElement(By.xpath("//h2[text()='Terms of Service']")).getText();
				
				System.out.println("Child text heading = "+ child_text);
				
				//driver.close();
				
			}
		}
		
		driver.switchTo().window(parentwindow);
	
		String parent_window_text=driver.findElement(By.xpath("//div[text()='Sign Up']")).getText();

		System.out.println("Parent window text = "+ parent_window_text);
		
		driver.quit();
	}

}
