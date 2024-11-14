package day8_7th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment29_Launch_google_printallautosuggitions 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");

List <WebElement> l1=driver.findElements(By.tagName("a"));

      int count =l1.size();
      System.out.println(count);
   for(int i=0;i<count;i++) 
   {
   WebElement e1=   l1.get(i);
   
   System.out.println(e1);
   String s1=e1.getText();
   System.out.println(s1);
   
      String s2=      e1.getAttribute("href");
      System.out.println(s2);
   }
   
	
}
}
