package day2_23rd_sep;

import org.openqa.selenium.chrome.ChromeDriver;

public class Luanch_google_Gettittle_method 
{
public static void main(String[] args)
{
	ChromeDriver driver =new ChromeDriver();
	driver.get("https:\\www.google.com");
	String title =driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
