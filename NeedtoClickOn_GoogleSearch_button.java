package day2_23rd_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedtoClickOn_GoogleSearch_button {
public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	WebElement e1= driver.findElement(By.name("btnI"));
         e1.sendKeys(Keys.ENTER);
	
	
}
	
	
}
