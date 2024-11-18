package day11_14thoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment56_Search_SomethingAmazon_withmultipleIinputs {

	@DataProvider(name="Set")
	public Object[][] method()
	{
		return new Object[][]{{"Shoe"},{"books"},{"kids dress"},{"pen"},{"laptop"},{"toys"},{"ball"},{"cycle"},{"bags"},{"bottles"}};
	}
@Test(dataProvider="Set")
public void Testcase1(String Input)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=717602284796&hvpos=&hvnetw=g&hvrand=17610221637691341969&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9197740&hvtargid=kwd-64107830&hydadcr=14452_2405310&gad_source=1");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("field-keywords"));
	e1.sendKeys(Input +Keys.ENTER);
	
}
}


