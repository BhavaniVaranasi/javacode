package day8_7th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment25_flipkart_print_Allautosuggistions_typemobile 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("Mobiles");
	Thread.sleep(2000);
	List <WebElement> li=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	int count =li.size();
	System.out.println(count);
	 Thread.sleep(3000);
	 
	 for(int i=0;i<count;i++) 
	   {
	   WebElement w1=   li.get(i);
	   
	   System.out.println(w1);
	   String s1=w1.getText();
	   System.out.println(s1);
	   }
	
}
}
