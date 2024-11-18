package testng48;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Assignment48_Testng_annotations 
{
	 @BeforeMethod
	    public void TS3()
	    {
	    	System.out.println("BeforeMethod");
	    }
	@Test
    public void TS1()
    {
    	System.out.println("test");
    	
    }
    @AfterMethod
    public void TS2()
    {
    	System.out.println("AfterMethod");
    }
   
    
}
