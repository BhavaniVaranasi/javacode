package Java_programs;

import java.util.Scanner;

public class Ass101_IfElseIf_block 
{
	static void method1()
	{
		Scanner i = new Scanner(System.in);
		System.out.println("Enter 4 or 10");
		int num = i.nextInt();
		
		if(num == 4)
		{
			System.out.println("Number 4 entered");
		}
		else if(num == 10)
		{
			System.out.println("Number 10 entered");
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
