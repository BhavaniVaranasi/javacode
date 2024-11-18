package testng50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment50_Testng_annotations
{
	@BeforeMethod
	public void TS1()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void TS2() throws InterruptedException
	{ 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		WebElement e1= driver.findElement(By.xpath("(//span[@class=\"nav-line-2\"])[1]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		//e1.click();
		WebElement e2=driver.findElement(By.xpath("(//a[@class=\"nav-link                                    nav-item\"])[4]"));
		e2.click();
		System.out.println("Testcase1");
	}
	@Test
	public void TS3() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
		WebElement e1=driver.findElement(By.xpath("(//div[@class=\"toolrip4\"])[1]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);
		//e1.click();
		WebElement e2=driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		e2.click();
		System.out.println("Testcase2");
	}
	@AfterMethod
	public void TS4()
	{
		System.out.println("AfetrMethod");
	}
	@Test
	public void TS5()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1 =driver.findElement(By.id("container-10"));
		WebElement e2 =driver.findElement(By.id("div2"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		System.out.println("Testcase3");
	}
}
