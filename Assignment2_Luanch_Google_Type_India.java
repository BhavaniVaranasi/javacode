package day2_23rd_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_Luanch_Google_Type_India 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:\\www.Google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("India");
	
	
}
}
