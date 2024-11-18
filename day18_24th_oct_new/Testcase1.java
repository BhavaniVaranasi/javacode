package day18_24th_oct_new;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends Assignment67_launchingAllbrowsers_paralle_Testng
{
@Test
public void Search_product() 
{
	WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Shoes"+Keys.ENTER);
}
}
