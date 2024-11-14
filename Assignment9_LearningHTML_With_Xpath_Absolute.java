package day4_25th_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9_LearningHTML_With_Xpath_Absolute 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Admin/Downloads/learningHTML1%20-%20Copy.html");
	WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
	e1.sendKeys("Bhavani");
	WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
	e2.sendKeys("Like name");
	WebElement e3=driver.findElement(By.xpath("(/html/body/input)[3]"));
	e3.sendKeys("Bhavani@1234");
	WebElement e4=driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
	e4.sendKeys("Bhavani varanasi");
	WebElement e5=driver.findElement(By.xpath("((/html/body/form)[2])/input[1]"));
	e5.click();
	WebElement e6=driver.findElement(By.xpath("((/html/body/form)[2])/input[2]"));
	e6.click();
	WebElement e7=driver.findElement(By.xpath("((/html/body/form)[2])/input[3]"));
	e7.click();
	WebElement e8=driver.findElement(By.xpath("(/html/body/input)[4]"));
	e8.click();
	WebElement e9=driver.findElement(By.xpath("(/html/body/input)[5]"));
	e9.click();
	Thread.sleep(2000);
	WebElement e10 =driver.findElement(By.linkText("Click to know about us"));
	e10.click();
}
}
