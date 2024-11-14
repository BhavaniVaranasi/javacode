package day8_7th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26_Rightclick_disableornot_bankingapp_login 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
      driver.get("https://www.icicibank.com/personal-banking/insta-banking/internet-banking");
     WebElement e1= driver.findElement(By.id("modal-close"));
     e1.click();
      
	
}
}
