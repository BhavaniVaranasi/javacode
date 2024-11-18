package paralle_testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class paralle_Testcase3 extends paralle_Testcase2
{
	@Test
	public void Add_to_Cart() throws InterruptedException
	{
		 WebElement e2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
			e2.click();
			
			
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();
			
			String pid=i1.next();
			String cid=i1.next();
			
			System.out.println(pid);
			System.out.println(cid);
			
			driver.switchTo().window(cid);
			
			Thread.sleep(2000);
			WebElement e3=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			e3.click();
	}
}
