package day17_23rd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment66_parallelTesting_multiplebrowsers 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		WebElement e1 = driver.findElement(By.id("nav-search-submit-button"));
		e1.click();
		
		
		
	}
	@Test
	@Parameters("browser")
	public void testcase2()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		WebElement e1 = driver.findElement(By.id("nav-search-submit-button"));
		e1.click();
		
		
		
	}
}
