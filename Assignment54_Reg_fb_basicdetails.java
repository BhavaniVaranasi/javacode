package day11_14thoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment54_Reg_fb_basicdetails 
{
	@DataProvider(name="registrationData")
    public Object[][] registrationData()
    {
        return new Object[][] {
            {"John", "Doe", "01/01/1990", "Male", "john.doe1@example.com"},
            {"Jane", "Smith", "02/02/1992", "Female", "jane.smith2@example.com"},
            {"Alice", "Johnson", "03/03/1985", "Female", "alice.johnson3@example.com"},
            {"Bob", "Brown", "04/04/1980", "Male", "bob.brown4@example.com"},
            {"Charlie", "Davis", "05/05/1995", "Male", "charlie.davis5@example.com"},
            {"Eve", "Miller", "06/06/1988", "Female", "eve.miller6@example.com"},
            {"Frank", "Wilson", "07/07/1975", "Male", "frank.wilson7@example.com"},
            {"Grace", "Taylor", "08/08/1993", "Female", "grace.taylor8@example.com"},
            {"Hank", "Anderson", "09/09/1982", "Male", "hank.anderson9@example.com"},
            {"Ivy", "Thomas", "10/10/1990", "Female", "ivy.thomas10@example.com"}
        };
    }

    @Test(dataProvider="registrationData")
    public void registerOnFacebook(String firstName, String lastName, String dob, String gender, String emailID)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        // Assume the following locators match the fields on the Facebook registration page
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        WebElement lastNameField = driver.findElement(By.name("lastname"));
        WebElement emailField = driver.findElement(By.name("reg_email__"));
        WebElement dobField = driver.findElement(By.name("birthday")); // Adjust if needed for exact locators
        WebElement genderField = driver.findElement(By.xpath("//input[@name='sex' and @value='" + (gender.equals("Male") ? "2" : "1") + "']"));
        
        // Fill out the form fields
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(emailID);
        dobField.sendKeys(dob);
        genderField.click();
        
        // Assuming we have a "Submit" button on the page
        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();

        // Close the browser
        driver.quit();
    }
}
