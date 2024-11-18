package day18_24th_oct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Assignment69_CrossBrowser_multipleBrowsers_addingtowishList_TestNG 
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
	
}
@AfterMethod
public void Quit()
{
	driver.quit();
	
}
}
