package testTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class TestNg_Youtube 
{
   
  WebDriver driver;
 
  @Test()
   public void launchyoutube() 
   {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e1=driver.findElement(By.name("search_query"));
	   e1.sendKeys("javalearning");
	   WebElement e2=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e2.click();
	   
   }
  @Test()
  public void launchyoutube1() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e2=driver.findElement(By.name("search_query"));
              e2.sendKeys("java");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();	   
  }
  @Test()
  public void launchyoutube2() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e3=driver.findElement(By.name("search_query"));
	   e3.sendKeys("python");
	   WebElement e4=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e4.click();
  }
  @Test()
  public void launchyoutube3() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e4=driver.findElement(By.name("search_query"));
	   e4.sendKeys("testing qa");
	   WebElement e5=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e5.click();
	   
  }
  @Test()
  public void launchyoutube4() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e5=driver.findElement(By.name("search_query"));
	   e5.sendKeys("manaual");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube5() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e6=driver.findElement(By.name("search_query"));
	   e6.sendKeys("sql qa");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube6() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e7=driver.findElement(By.name("search_query"));
	   e7.sendKeys("sql");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube7() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e8=driver.findElement(By.name("search_query"));
	   e8.sendKeys("etl testing");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube8() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e9=driver.findElement(By.name("search_query"));
	   e9.sendKeys("corejava");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube9() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e01=driver.findElement(By.name("search_query"));
	   e01.sendKeys("bikes");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
  @Test()
  public void launchyoutube10() 
  {
	   driver=new ChromeDriver(); 
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	   WebElement e10=driver.findElement(By.name("search_query"));
	   e10.sendKeys("cars");
	   WebElement e3=driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
	   e3.click();
	   
  }
 
}
