package day8_7th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment30_Print_attribute_values_for_particular_attribute_name
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Google.com");
	List <WebElement>li =driver.findElements(By.tagName("a"));
	
	int count=li.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{	
	WebElement e1=li.get(i);
	System.out.println(e1);
	String s2=e1.getText();
	System.out.println(s2);
	String s1= e1.getAttribute("href");
	System.out.println(s1);
	}
}
}
