package day2_23rd_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_to_Facebook 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https:\\www.facebook.com");
	driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.name("email"));
	e1.sendKeys("bhavanivaranasi321@gmail.com");
	
	WebElement e2=driver.findElement(By.id("pass"));
	e2.sendKeys("Vb@Jan@2021");
	
	WebElement e3=driver.findElement(By.name("login"));
	e3.click();
	
}
}
