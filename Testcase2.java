package day18_24th_oct;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends Testcase1 
{
	@Test
	public void Add_product_to_Wishlist()
	{
		
			WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
			e2.sendKeys("Shoes"+Keys.ENTER);
			WebElement shoe1st = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
			shoe1st.click();
			
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> is1 = s1.iterator();
			String parentID = is1.next();
			String childID = is1.next();
			driver.switchTo().window(childID);
			WebElement btn_wishList = driver.findElement(By.id("wishListMainButton"));
			btn_wishList.click();
		
	}
}
