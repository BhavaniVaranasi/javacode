package implicit_explicit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass73_explicitwait 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(1));
		w1.until(ExpectedConditions.titleContains("Google"));
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
