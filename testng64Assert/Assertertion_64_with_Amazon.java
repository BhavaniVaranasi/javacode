package testng64Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertertion_64_with_Amazon 
{
@Test
public void testcase1() throws InterruptedException
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
	WebElement e1 = driver.findElement(By.id("nav-search-submit-button"));
	e1.click();
	Thread.sleep(2000);
	List <WebElement> l1=driver.findElements(By.tagName("a"));
	int count= l1.size();
	System.out.println(count);
	Assert.assertEquals(l1.size()>1000, true,"Sorry the Test case is failed ");
	
	
}
}
