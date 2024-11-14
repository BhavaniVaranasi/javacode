package day8_7th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment27_Google_and_Doubl_click_on_Gmail 
{
public static void main(String[] args)
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	WebElement e1=driver.findElement(By.xpath("(//a[@class='gb_W'])[1]"));
	
	Actions a1=new Actions(driver);
	a1.doubleClick(e1).perform();
	
}
}
