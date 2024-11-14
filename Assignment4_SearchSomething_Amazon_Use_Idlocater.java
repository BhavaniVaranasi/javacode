package day3_24th_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_SearchSomething_Amazon_Use_Idlocater 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kids dress for 3 year old");
	WebElement e1 = driver.findElement(By.id("nav-search-submit-button"));
	e1.click();
	
	
}
}
