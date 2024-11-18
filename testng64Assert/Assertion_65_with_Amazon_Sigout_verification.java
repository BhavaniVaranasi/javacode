package testng64Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_65_with_Amazon_Sigout_verification 
{
@Test
public void testcase1() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
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
	WebElement e7=driver.findElement(By.id("twotabsearchtextbox"));
	e7.sendKeys("Shoe" +Keys.ENTER);
	Thread.sleep(2000);
	WebElement e8=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions a2=new Actions(driver);
	a2.moveToElement(e8).perform();
	Thread.sleep(1000);
	WebElement e9=driver.findElement(By.xpath("//a[@id='nav-item-signout']"));
	e9.click();
	Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	
	
}

}
