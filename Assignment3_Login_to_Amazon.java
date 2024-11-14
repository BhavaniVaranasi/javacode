package day2_23rd_sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_to_Amazon 
{
public static void main(String[] args) 
{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgoogmantxtmob170-21%26ascsubtag%3D_k_EAIaIQobChMIlcnpg6uJiQMV29MWBR2I8AB-EAAYASAAEgL4IPD_BwE_k_%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement e1 = driver.findElement(By.name("email"));
	e1.sendKeys("bhavanivaranasi321@gmail.com");
	WebElement e2 = driver.findElement(By.id("continue"));
	e2.click();
	WebElement e3 = driver.findElement(By.id("ap_password"));
	e3.sendKeys("Vb@Jan@2021");
	WebElement e4 = driver.findElement(By.id("auth-signin-button"));
	e4.click();
	
	
}
}
