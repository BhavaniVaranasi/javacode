package day2_23rd_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_to_Flipkart 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:\\www.flipkart.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.className("_38VF5e"));
	e1.click();
	
	
}
}
