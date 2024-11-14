package day9_9th_oct;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment39_GrotechMinds_javascript_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/automate-me/");
		WebElement e1 = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer__overlay'])[7]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(1000);
		WebElement btn_readMore = driver.findElement(By.xpath("(//div[@class='elementor-flip-box__layer elementor-flip-box__back'])[4]/div/div/a"));
		btn_readMore.click();
		Thread.sleep(3000);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> s1i = s1.iterator();
		String pID = s1i.next();
		String cID = s1i.next();
		
		
		driver.switchTo().window(cID);
		
		Thread.sleep(1000);
		
		WebElement e2 = driver.findElement(By.xpath("//button[.='Click ']"));
		e2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}

}
