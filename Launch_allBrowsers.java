
package paralle_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_allBrowsers 
{
	WebDriver driver;
	 @BeforeMethod
	 public void launch()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.Amazon.in");
		 
		 driver=new FirefoxDriver();
		 driver.get("https://www.Amazon.in");
		 
	 }
	 @AfterMethod
	 public void quit() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.quit();
	 }
}
