
package day13_16th_oct;

import org.testng.annotations.Test;

public class Assignment60_usingPriority_Testng 
{
	 @Test(priority = 1)
	    public void test1() 
	 {
	        System.out.println("Executing Test 1 - Priority 1");
	    }

	    @Test(priority = 3)
	    public void test3() 
	    {
	        System.out.println("Executing Test 3 - Priority 3");
	    }

	    @Test(priority = 2)
	    public void test2() 
	    {
	        System.out.println("Executing Test 2 - Priority 2");
	    }
}
