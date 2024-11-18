package paralle_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class paralle_Testcase1 extends Launch_allBrowsers
{
	@Test
	public void Login_to_Amazon() throws InterruptedException
	{
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		e2.click();
		WebElement e3=driver.findElement(By.id("ap_email"));
		e3.sendKeys("9160787104");
		WebElement e4=driver.findElement(By.id("continue"));
		e4.click();
		WebElement e5=driver.findElement(By.id("ap_password"));
		e5.sendKeys("Vb@Jan@2023");
		WebElement e6=driver.findElement(By.id("auth-signin-button"));
		e6.click();
	}
}
