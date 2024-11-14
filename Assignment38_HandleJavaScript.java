package day9_9th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment38_HandleJavaScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/registration/");
		
		WebElement fName = driver.findElement(By.id("fname"));
		fName.sendKeys("Bhavani");
		
		WebElement lName = driver.findElement(By.name("lname"));
		lName.sendKeys("varanasi");
		
		WebElement email = driver.findElement(By.xpath("//input[@class='email form-control ']"));
		email.sendKeys("bhavanivaranasi98@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("sanas");
		
		WebElement RadioBtn_female = driver.findElement(By.id("Female"));
		RadioBtn_female.click();
		
		WebElement drpDwn_Skills = driver.findElement(By.id("Skills"));
		Select skills = new Select(drpDwn_Skills);
		skills.selectByValue("select1");
		
		WebElement drpDwn_Country = driver.findElement(By.id("Country"));
		Select country = new Select(drpDwn_Country);
		country.selectByVisibleText("India ");
		
		WebElement present_Addr = driver.findElement(By.id("Present-Address"));
		present_Addr.sendKeys("Pune, Maharashtra, India");
		
		WebElement permnt_Addr = driver.findElement(By.id("Permanent-Address"));
		permnt_Addr.sendKeys("Pune, Maharashtra, India");
		
		WebElement pinCode = driver.findElement(By.id("Pincode"));
		pinCode.sendKeys("516009");
		
		WebElement drpDwn_Relegion = driver.findElement(By.id("Relegion"));
		Select Relegion = new Select(drpDwn_Relegion);
		Relegion.selectByVisibleText("Hindu");
		
		WebElement fileUpload = driver.findElement(By.id("file"));
		fileUpload.sendKeys("C:\\Users\\Admin\\Desktop\\Selenuim\\Bhavani123.pdf");
			
		WebElement ChkBox_relocate = driver.findElement(By.id("relocate"));
		ChkBox_relocate.click();
		WebElement btn_Submit = driver.findElement(By.name("Submit"));
		btn_Submit.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
