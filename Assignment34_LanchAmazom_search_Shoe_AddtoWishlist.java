package day9_9th_oct;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment34_LanchAmazom_search_Shoe_AddtoWishlist 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
	e1.sendKeys("Shoe");
	e1.sendKeys(Keys.ENTER);
	WebElement e2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[5]"));
	e2.click();
	
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	
	String pid=i1.next();
	String cid=i1.next();
	
	System.out.println(pid);
	System.out.println(cid);
	
	driver.switchTo().window(cid);
	WebElement e3=driver.findElement(By.xpath("(//span[@class='a-button-inner'])[18]"));
	e3.click();
	WebElement e4=driver.findElement(By.tagName(" Add to Wish List "));
	e4.click();
}
}
