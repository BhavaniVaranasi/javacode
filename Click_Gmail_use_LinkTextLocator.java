package day3_24th_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Gmail_use_LinkTextLocator 
{
public static void main(String[] args) 
{

	ChromeDriver driver =new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.linkText("Gmail"));
	e1.click();
}
}