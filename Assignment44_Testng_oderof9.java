package testng_oder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assignment44_Testng_oderof9 
{
         
        	 @Test
          public void TS1()
          {
        	  System.out.println("login to aplication");
          }
        	 @BeforeSuite
        	 public  void Ts2()
        	 {
        		 System.out.println("BeforeSuite ");
        	 }
        	 @BeforeTest
        	 public  void Ts3()
        	 {
        		 System.out.println("Beforetest ");
        	 }
        	 @BeforeClass
        	 public void Ts4()
        	 {
        		System.out.println("BeforeClass"); 
        	 }
        	 @BeforeMethod
        	 public void Ts5() {
        		 System.out.println("BeforeMethod");
        	 }
        	 
        	 @AfterSuite
        	 public  void Ts6()
        	 {
        		 System.out.println("AfterSuite ");
        	 }
        	 @AfterTest
        	 public  void Ts7()
        	 {
        		 System.out.println("Aftertest ");
        	 }
        	 @AfterClass
        	 public void Ts8()
        	 {
        		System.out.println("AfterClass"); 
        	 }
        	 @AfterMethod
        	 public void Ts9() {
        		 System.out.println("AfterMethod");
        	 }
         }
          
          

         
         
         
