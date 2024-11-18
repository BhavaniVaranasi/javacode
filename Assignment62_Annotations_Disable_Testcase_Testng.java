package day13_16th_oct;

import org.testng.annotations.Test;

public class Assignment62_Annotations_Disable_Testcase_Testng 
{
	@Test
    public void test1() 
	{
        System.out.println("Executing Test 1");
    }

    @Test(enabled = false)
    public void test2() 
    {
        System.out.println("Executing Test 2 - This test is disabled");
    }

    @Test
    public void test3() 
    {
        System.out.println("Executing Test 3");
    }
}
