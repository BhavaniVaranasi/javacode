package day9_9th_oct;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment32_luanch_naukari_move_control_childwindow 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Google.com");
	WebElement e1=driver.findElement(By.id("APjFqb"));
	e1.sendKeys("nakuri");
	e1.sendKeys(Keys.ENTER);
	WebElement e2=driver.findElement(By.xpath("(//span[@class='OSrXXb VN4UC chcHdb'])[1]"));
	e2.click();
	WebElement e3=driver.findElement(By.name("google-register"));
	e3.click();
	Set <String> s1=driver.getWindowHandles();
System.out.println(s1); 
Iterator <String>  s2=           s1.iterator();
          String pid=s2.next();
          String cid=s2.next();
          driver.switchTo().window(cid);
          driver.close();//child window closed becase control moved to parent to child window so its closed


	
	
}
}
