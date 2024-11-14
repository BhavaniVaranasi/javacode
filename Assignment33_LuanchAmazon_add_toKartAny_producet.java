package day9_9th_oct;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33_LuanchAmazon_add_toKartAny_producet 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Amazon.in");
	WebElement e1=driver.findElement(By.name("field-keywords"));
	e1.sendKeys("Treadmill");
	e1.sendKeys(Keys.ENTER);
	WebElement e2=driver.findElement(By.xpath("(//div/div/div[@class='puisg-col puisg-col-4-of-12 puisg-col-4-of-16 puisg-col-4-of-20 puisg-col-4-of-24 puis-list-col-left'])[2]"));
	e2.click();
	Set <String>s1=driver.getWindowHandles();
	System.out.println(s1);
	Iterator <String> i1=s1.iterator();
	String Pid=i1.next();
	String Cid=i1.next();
	driver.switchTo().window(Cid);
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.className("a-button-text"));
	
	
	e3.click();
	//driver.switchTo().alert().dismiss();
	//WebElement e4=driver.findElement(By.name("a-button-input"));
	//e4.click();
	
}
}
