package day5_2nd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment13_Select_Catagory_Books_Search_Power_Of_minds 
{
//Assignment13_Select_Catagory_Books_Search_Power_Of_minds_press_enter_button_use_X-Path
	
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		e1.click();
		
		Select s1 = new Select(e1);//object creation for drop down
		//s1.selectByIndex(12); //syntax of dropdown
		s1.selectByVisibleText("Books"); //other way of dropdown
		WebElement e2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		e2.sendKeys("Power Of minds");
		WebElement e3 =driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		e3.click();
		
		
		
	
		
		
		
		
	}
}
