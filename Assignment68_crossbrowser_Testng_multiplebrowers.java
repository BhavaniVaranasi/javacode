package day18_24th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Assignment68_crossbrowser_Testng_multiplebrowers 
{
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchingbrowsers(String nameofbrowser)
	{
		if(nameofbrowser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("Safari"))
		{
			driver=new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes"+Keys.ENTER);
	}
	@AfterMethod
	public void Quit()
	{
		driver.quit();
}
}
