package day10_Ass1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment39_JavaScreipt_Grotechminds 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/automate-me/");
	WebElement e1=driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__inner'])[8]"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(1000);
	WebElement e2=driver.findElement(By.xpath("(//a[@class='elementor-flip-box__button elementor-button elementor-size-sm'])[4]"));
	e2.click();
	Thread.sleep(3000);
	Set<String> s1 = driver.getWindowHandles();
	System.out.println(s1);
	Iterator<String> s1i = s1.iterator();
	String parentID = s1i.next();
	String childID = s1i.next();
	
	
	driver.switchTo().window(childID);
	
	Thread.sleep(1000);
	
	WebElement e3 = driver.findElement(By.xpath("//button[.='Click ']"));
	e3.click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
}
}
