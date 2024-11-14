package day10_Ass1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_shot_current_time 
{
public static void main(String[] args) throws IOException 
{
	Date d1= new Date();
	System.out.println(d1.getTime()); 
	
	Date d2 = new Date(d1.getTime());
	System.out.println(d2);
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize(); 	
	
	TakesScreenshot ts =  driver;;
		File source=			ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Admin\\Desktop\\Selenuim\\bhavani01"+new Screen_shot_current_time().getClass()+".png");
	FileHandler.copy(source, destination);
	
	/*
	 * 
	 * 
	 * 
	 */
	
}
}
