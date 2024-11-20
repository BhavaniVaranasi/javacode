package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Go_To_cart 
{
@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[2]")
WebElement Delete;

public void delete()
{
	Delete.click();
}
public Go_To_cart(WebDriver driver) 
{
	 PageFactory.initElements(driver, this);
}
}
