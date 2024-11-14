package day9_9th_oct;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment34_Screenshot1 
{
public static void main(String[] args) throws IOException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	TakesScreenshot d1 =  driver;
	File source =d1.getScreenshotAs(OutputType.FILE);
	File destination =new File("C:\\Users\\Admin\\Desktop\\Selenuim\\Bhavani.png");
	FileHandler.copy(source, destination);
	
	
	
	
	
}
}
