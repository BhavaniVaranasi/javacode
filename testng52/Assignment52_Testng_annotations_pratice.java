package testng52;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment52_Testng_annotations_pratice 
{
	static ChromeDriver driver;
@BeforeMethod
public void Testcase1()
{
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println("BeforeMethod");
	
}
@AfterMethod
public  static void Testcase2()
{
	
	
	WebElement e1=driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]"));
	e1.sendKeys("Shoe");
	e1.sendKeys(Keys.ENTER);
	WebElement e2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[5]"));
	e2.click();
	

	System.out.println("Testcase1");
	
}
     @Test
      public void TS3()
    {
    	 
    		
    	 Testcase2();
    		WebElement e2 =driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[5]"));
    		e2.click();
    		
    		Set<String> s1=driver.getWindowHandles();
    		Iterator<String> i1=s1.iterator();
    		
    		String pid=i1.next();
    		String cid=i1.next();
    		
    		System.out.println(pid);
    		System.out.println(cid);
    		
    		driver.switchTo().window(cid);
    		WebElement e3=driver.findElement(By.xpath("(//span[@class='a-button-inner'])[18]"));
    		e3.click();
    		System.out.println("Testcase2");
    		
     }
     @AfterMethod
     public void TS4()
     {
    	
 		driver.quit();
 		System.out.println("AfterMethod");
     }
}
