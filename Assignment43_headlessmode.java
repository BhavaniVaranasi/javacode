package day9_9th_oct;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment43_headlessmode 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions var1 = new ChromeOptions();
		var1.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(var1);
		driver.manage().window().maximize();
		
		driver.get("https://www.amezon.in");
		System.out.println("Browser opened in headless mode");
		
		driver.quit();

		
		

	}
}
