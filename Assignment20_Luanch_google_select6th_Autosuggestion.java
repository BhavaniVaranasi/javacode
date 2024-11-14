package day7_4th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20_Luanch_google_select6th_Autosuggestion 
{
public static void main(String[] args) throws InterruptedException 
{
	//Launch google, Type "Bangalore" and from auto-suggestions select 6th Auto-suggestion option
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
	e1.sendKeys("Bangalore");
	Thread.sleep(2000);
	List <WebElement> l1=driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
	
	int count =l1.size();
	System.out.println(count);
	Thread.sleep(3000);
	
	l1.get(6).click();
	
	
	
	
	
}
}
