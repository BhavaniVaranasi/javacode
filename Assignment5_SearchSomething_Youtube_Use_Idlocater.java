package day3_24th_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_SearchSomething_Youtube_Use_Idlocater 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:\\www.youtube.com");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Gro techminds");
	WebElement e1 =driver.findElement(By.id("search-icon-legacy"));
	e1.click();
}
}
