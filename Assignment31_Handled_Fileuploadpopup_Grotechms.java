package day9_9th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment31_Handled_Fileuploadpopup_Grotechms 
{
public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement e1=driver.findElement(By.id("fname"));
	e1.sendKeys("bhavani");
	WebElement e2=driver.findElement(By.id("lname"));
	e2.sendKeys("varanasi");
	WebElement e3=driver.findElement(By.id("email"));
	e3.sendKeys("bhavanivaranasi91@gmail.com");
	WebElement e4=driver.findElement(By.id("password"));
	e4.sendKeys("12345");
	WebElement e5=driver.findElement(By.xpath("(//input[@name='gender'])[2]"));
	e5.click();
	WebElement e6=driver.findElement(By.id("Present-Address"));
	e6.sendKeys("hyd");
	WebElement e7=driver.findElement(By.id("Permanent-Address"));
	e7.sendKeys("Srk");
	WebElement e8=driver.findElement(By.id("Pincode"));
	e8.sendKeys("563212");
	WebElement e9=driver.findElement(By.xpath(" //select[@name='Skills']"));
	e9.click();
	Select s1=new Select(e9);
	s1.selectByIndex(2);
	WebElement e10=driver.findElement(By.xpath("//select[@id='Country']"));
	e10.click();
	Select s2=new Select(e10);
	s2.selectByVisibleText("India");
	
	WebElement e11=driver.findElement(By.xpath("//select[@id='Relegion']"));
	e11.click();
	Select s3=new Select(e11);
	s3.selectByIndex(2);
	WebElement e12=driver.findElement(By.id("relocate"));
	e12.click();
	
	WebElement e14=driver.findElement(By.id("file"));
	e14.sendKeys("C:\\Users\\Admin\\Downloads\\Bhavani-Varanasi-FlowCV-Resume-20240619.pdf");
	WebElement e13=driver.findElement(By.name("Submit"));
	e13.click();
	
	
	
	
	
	
	
	
}
}
