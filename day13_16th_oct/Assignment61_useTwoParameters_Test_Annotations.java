package day13_16th_oct;

import org.testng.annotations.Test;

public class Assignment61_useTwoParameters_Test_Annotations 
{
	@Test(priority = 1, invocationCount = 3)
    public void testMethod1() 
	{
        System.out.println("Executing Test Method 1 - Priority 1, Invocation Count 3");
    }

    @Test(priority = 2, invocationCount = 2)
    public void testMethod2() 
    {
        System.out.println("Executing Test Method 2 - Priority 2, Invocation Count 2");
    }
    
    @Test(priority = 3, invocationCount = 1)
    public void testMethod3() {
        System.out.println("Executing Test Method 3 - Priority 3, Invocation Count 1");
    }
}
