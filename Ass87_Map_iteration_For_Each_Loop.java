package Java_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ass87_Map_iteration_For_Each_Loop 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(123, "bhavani");
		m1.put(130, "bhanu");
		m1.put(120, "bharat");
		m1.put(126, "myra");
		
		System.out.println(m1); 
		
		System.out.println("-------Map keys Iteration using keySet------");
		for(Integer i1:m1.keySet())
		{
			System.out.println(i1);
		}
		System.out.println("-------Map values Iteration using values------");
		for(String s1:m1.values())
		{
			System.out.println(s1);
		}
		System.out.println("-------Map Iteration using entrySet------");
		for(Entry<Integer, String> e1:m1.entrySet())
		{
			System.out.println(e1);
		}
		

	}

}
