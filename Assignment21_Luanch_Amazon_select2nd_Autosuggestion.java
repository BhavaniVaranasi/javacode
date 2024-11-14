package day7_4th_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment21_Luanch_Amazon_select2nd_Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=716869041967&hvpos=&hvnetw=g&hvrand=14373864099083569826&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302592&hvtargid=kwd-64107830&hydadcr=14452_2404648&gad_source=1");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoe");
		Thread.sleep(2000);
		List <WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(3000);
		
		int count  =l1.size();
		
		System.out.println(count);
		Thread.sleep(3000);
		
		l1.get(2).click();
		
	}

}
