package Java_programs;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Ass81_Enumeration 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		
		s1.add("bhavani");
		s1.add('t');
		s1.add(3528);
		s1.add(null);
			
		Enumeration e1 = s1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		
		Vector s2 = new Vector();
		s2.add("bhavani");
		s2.add('g');
		s2.add(3528);
		s2.add(null);
		
		Enumeration e2 = s2.elements();
		while(e2.hasMoreElements())
		{
			System.out.println(e2.nextElement());
		}

	}

}
