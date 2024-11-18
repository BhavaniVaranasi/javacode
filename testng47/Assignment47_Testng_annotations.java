package testng47;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment47_Testng_annotations 
{
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
    @BeforeSuite
    public void TS3()
    {
    	System.out.println("BeforeSuite");
    }
    @AfterClass
    public void TS4()
    {
    	System.out.println("AfterClass");
    }
}
