package day8_7th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23_Type_Bangalore_print_Allautosuggistions 
{
public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
	e1.sendKeys("Bangalore");
	Thread.sleep(2000);
	List <WebElement>l1=driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
	
	int count =l1.size();
	System.out.println(count);
	Thread.sleep(3000);
	 for(int i=0;i<count;i++)
	 {
	WebElement w1=l1.get(i);
	System.out.println(w1);
	String s1=w1.getText();
	System.out.println(s1);
	 }
}
}
