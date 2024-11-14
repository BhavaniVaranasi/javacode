package day5_2nd_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12_htmlApplication_TagNameLocator 
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Downloads/learningHTML1%20-%20Copy.html");
	WebElement e1=driver.findElement(By.tagName("a"));
	e1.click();
}
}
