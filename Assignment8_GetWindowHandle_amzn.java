package day4_25th_sep;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_GetWindowHandle_amzn 
{
public static void main(String[] args) 
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.manage().window().maximize();
	String s1=driver.getWindowHandle();
	System.out.println(s1);    //981C58C97B8F4B1CBA6450A7BBDFD570
}
}
