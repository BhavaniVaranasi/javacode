package day6_3rd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment15_Amazon_select_language_use_Hoverover 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	WebElement e1= driver.findElement(By.xpath("(//span[@class=\"nav-line-2\"])[1]"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(2000);
	//e1.click();
	WebElement e2=driver.findElement(By.xpath("(//a[@class=\"nav-link                                    nav-item\"])[4]"));
	e2.click();
	
	
	
	
	
	
}
}
