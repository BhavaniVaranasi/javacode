package day17_23rd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testcase_SearchingProductAmazon 
{
      WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void LaunchAmazon(String nameOfBrowser)
	{
		if(nameOfBrowser.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameOfBrowser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		if(nameOfBrowser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement txtBox_search = driver.findElement(By.id("twotabsearchtextbox"));
		txtBox_search.sendKeys("Shoes"+Keys.ENTER);
	}}
