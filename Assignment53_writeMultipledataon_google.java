package day11_14thoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment53_writeMultipledataon_google 
{
	@DataProvider(name="Set")
	public Object[][] method()
	{
		return new Object[][]{{"modi"},{"india"}};
	}
@Test(dataProvider="Set")
public void Testcase1(String Input)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys(Input +Keys.ENTER);
	
}
}
