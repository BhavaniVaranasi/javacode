package testng46;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment46_Testng_annotations 
{
    @BeforeTest
    public void TS1()
    {
    	ChromeDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kids dress for 3 year old");
    	WebElement e1 = driver.findElement(By.id("nav-search-submit-button"));
    	e1.click();
    	System.out.println("BeforeTest");
    }
    @BeforeClass
    public void TS2()
    {
    	ChromeDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https:\\www.youtube.com");
    	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Gro techminds");
    	WebElement e1 =driver.findElement(By.id("search-icon-legacy"));
    	e1.click();
    	System.out.println("Beforeclass");
    }
    @BeforeMethod
    public void TS3() 
    {
    	ChromeDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
    	WebElement e1=driver.findElement(By.linkText("Mobiles"));
          e1.click();
          System.out.println("Beforemethod");
    }
    @AfterMethod
    public void TS4()
    {
    	ChromeDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
    	WebElement e1=driver.findElement(By.linkText("Mobiles"));
          e1.click();
          System.out.println("AfterMethod");
    }
    @Test
    public void TS5()
    {
    	ChromeDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=5322318495336965421&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302242&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
    	WebElement e1=driver.findElement(By.partialLinkText("Service"));
          e1.click();
          System.out.println("Test");
    }
    
}
