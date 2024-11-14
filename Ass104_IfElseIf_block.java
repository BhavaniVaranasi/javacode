package Java_programs;

import java.util.Scanner;

public class Ass104_IfElseIf_block 
{
	static void method1()
	{
		Scanner i1 = new Scanner(System.in);
		System.out.println("Enter number in range of 5. From 5 to 25");
		int num = i1.nextInt();
		
		if(num == 5)
		{
			System.out.println("Number 5 entered");
		}
		else if(num == 10)
		{
			System.out.println("Number 10 entered");
		}
		else if(num == 15)
		{
			System.out.println("Number 15 entered");
		}
		else if(num == 20)
		{
			System.out.println("Number 20 entered");
		}
		else if(num == 25)
		{
			System.out.println("Number 25 entered");
		}
		else
		{
			System.out.println("Random Number entered");
		}
	}

	public static void main(String[] args) 
	{
		
		method1();
	}

}
