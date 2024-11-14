package day7_4th_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment18_Drag_Drop_revert_JSON {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement e1 =driver.findElement(By.id("div2"));
		WebElement e2 =driver.findElement(By.id("container-10"));
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		

	}

}
