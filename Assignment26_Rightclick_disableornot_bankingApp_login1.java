package day8_7th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26_Rightclick_disableornot_bankingApp_login1 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.manage().window().maximize();

	WebElement e1= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	e1.click();
	
	driver.switchTo().alert().accept();
	
	
}
}
