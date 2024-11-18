package paralle_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class paralle_Testcase2 extends paralle_Testcase1
{
	@Test
	public void Searching_product() throws InterruptedException
	{
		WebElement e7=driver.findElement(By.id("twotabsearchtextbox"));
		e7.sendKeys("Shoe" +Keys.ENTER);
		Thread.sleep(2000);
	}
}
