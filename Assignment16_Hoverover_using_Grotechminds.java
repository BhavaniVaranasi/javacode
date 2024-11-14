package day6_3rd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment16_Hoverover_using_Grotechminds 
{
public static void main(String[] args) throws InterruptedException
{
	//1. Write a code to hoverover demo 1 and click on practice 3
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/hoverover/");
	WebElement e1=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[1]"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(2000);
	//e1.click();
	WebElement e2=driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
	e2.click();
	
	
	
	
	
	
	/*WebElement e3 =driver.findElement(By.xpath("(//div[@class=\"toolrip6\"])[1]"));
	Actions a2=new Actions(driver);
	a1.moveToElement(e3).perform();
	Thread.sleep(2000);
	WebElement e4=driver.findElement(By.xpath("(//div[@class=\"popup6\"])[10]"));
	Thread.sleep(2000);
	e4.click();*/
	
	
}
}
