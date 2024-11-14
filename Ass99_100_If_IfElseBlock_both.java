package Java_programs;

import java.util.Scanner;

public class Ass99_100_If_IfElseBlock_both 
{
	static void If_Block()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter number 8 ");
		int name = s1.nextInt();
		
		if(name == 8)
		{
			System.out.println("Correct number entered");
		}
	}
	static void If_Else_Block()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("ENter number 8 ");
		int name = s1.nextInt();
		
		if(name == 8)
		{
			System.out.println("Correct number entered");
		}
		else
		{
			System.out.println("Wrong number entered");
		}
	}

	public static void main(String[] args)
	{
		If_Block();
		If_Else_Block();
		
	}
}
