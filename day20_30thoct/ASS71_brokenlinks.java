package day20_30thoct;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASS71_brokenlinks 
{
public static void main(String[] args) throws InterruptedException,IOException 
{
	
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	List <WebElement> l1=  driver.findElements(By.tagName("a"));
	System.out.println(l1);
	int count =l1.size();
	System.out.println(count);
	Thread.sleep(2000);
	for (int i=0;i<count;i++)
	{
		WebElement l= l1.get(i);
		String url=l.getAttribute("href");
		//System.out.println(url);
		verifylinks(url);
	}
	
}
	static void verifylinks(String url) throws IOException 
	{
		URL u1= new URL(url);
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
		if(u2.getResponseCode()==200)
		{
			System.out.println("link is valid" + url+"   "+u2.getResponseMessage());
		}
		else
		{
			System.out.println("link is not valid" + url+"   "+u2.getResponseMessage());
		}
	}
	
	
	
}




