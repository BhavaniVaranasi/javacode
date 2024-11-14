package day4_25th_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment11_OpenAmazon_SearchSomething_useXpath 
{
public static void main(String[] args) 
{
	ChromeOptions c1=new ChromeOptions();
	c1.addArguments("--headless");
	ChromeDriver driver =new ChromeDriver(c1);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	WebElement e1=driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"));
	e1.sendKeys("kids drass");
	WebElement e2 = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	e2.click();

	
}
}
