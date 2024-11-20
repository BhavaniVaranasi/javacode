package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//step1
public class Addtokart 
{
	@FindBy(id="add-to-cart-button")
	 WebElement add_cart;
	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	WebElement Go_Tocart;
	
//step2
public void add_to_cart()
{
	 add_cart.click();
}

public void Gotocart()
{
	Go_Tocart.click();
}

//step3
public Addtokart(WebDriver driver) 
{
	 PageFactory.initElements(driver, this);
}
}
