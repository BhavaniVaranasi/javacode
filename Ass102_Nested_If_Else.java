package Java_programs;

import java.util.Scanner;

public class Ass102_Nested_If_Else 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter age");
		age = s1.nextInt();
		
		if(age >= 18)
		{
			
			if(age ==18)
			{
			System.out.println("Eligible for vote with exact age 18");	
			}
			else
			{
				System.out.println("Eligible for vote with age = "+age);
			}
		}
		else
		{
			if(age > 16 )
			{
				System.out.println("Not Eligible for vote for more 1 year");		
			}
			else
			{
				System.out.println("Not Eligible for vote");	
			}
		}

	}
}
