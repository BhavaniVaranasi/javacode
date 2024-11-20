package Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//Step1
	WebDriver driver;
    @FindBy(xpath="//span[@class='nav-line-2 ']")
    WebElement accountandlist;
    //
    @FindBy(id="nav-al-signin")
    WebElement signin;
   
    @FindBy(id="twotabsearchtextbox")
    WebElement searching_tf;
    @FindBy(xpath="(//a[@class='nav-link nav-item'])[21]")
    WebElement signout;
    @FindBy(xpath="(//a[@class='nav-link nav-item'])[8]")
    WebElement Wishlist;
    @FindBy(xpath="(//input[@class='a-button-input a-declarative'])[1]")
    WebElement Wishlist_delete;
    
    
    //Step2
    public void aandlist(WebDriver driver) 
    {
    	Actions a1=new Actions(driver);
    	a1.moveToElement(accountandlist).perform();
    	
    }
   public void sigin_click()
    {
    	signin.click();
    }
    public void searching() 
    {
    	searching_tf.sendKeys("Shoe"+Keys.ENTER);
    }
    public void wishlist_delete()
    {
    	Wishlist.click();
    }
    public void wishlistdelete_icon()
    {
    	Wishlist_delete.click();
    }
    public void sign_out() throws InterruptedException
    {
    	Thread.sleep(1000);
    	signout.click();
    	
    }
   
    //Step3
     public Homepage(WebDriver driver) 
     {
    	 PageFactory.initElements(driver, this);
     }
 
 
}
