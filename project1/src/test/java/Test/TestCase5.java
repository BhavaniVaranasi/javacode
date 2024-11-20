package Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import Source.Addtokart;
import Source.Go_To_cart;
import Source.Homepage;
import Source.Loginpage;
import Source.Search_Results;

public class TestCase5 extends LaunchQuit
{
	@Test
	  public void wishlist() throws InterruptedException 
	  {
		  Homepage H1=new Homepage(driver);
		  H1.aandlist(driver);
		  H1.sigin_click();
		  Loginpage l1=new Loginpage(driver);
		  l1.un();
		  l1.con_button();
		  l1.pwrd();
		  l1.sign();
		  H1.searching();
		  Search_Results s1=new Search_Results(driver);
		  s1.selectshoe();
		  Set<String> s2=driver.getWindowHandles();
			Iterator<String> i1=s2.iterator();
			
			String pid=i1.next();
			String cid=i1.next();
			
			System.out.println(pid);
			System.out.println(cid);
			driver.switchTo().window(cid);
			Search_Results Ser=new Search_Results(driver);
			Ser.addingtowishlist();
			Thread.sleep(5000);
			Ser.con_button();
            Addtokart A1=new Addtokart(driver);
			A1.add_to_cart();
			A1.Gotocart();
			Go_To_cart g1=new Go_To_cart(driver);
			g1.delete();
			driver.switchTo().window(pid);
			Thread.sleep(2000);
			H1.aandlist(driver);
		    H1.wishlist_delete();
		    H1.wishlistdelete_icon();
		    Thread.sleep(2000);
			H1.aandlist(driver);
		    H1.sign_out();
		 
	  }
}
