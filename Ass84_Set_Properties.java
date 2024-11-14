package Java_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ass84_Set_Properties 
{
	public static void main(String[] args) 
	{
		Set<Integer> aL=new HashSet<Integer> ();
		aL.add(30);
		aL.add(26);
		aL.add(20);
		aL.add(30);
		aL.add(35);
		aL.add(32);
//		aL.add("myra");
//		aL.add('c');
//		aL.add(null);
//		aL.add(null);
		System.out.println("Set doesnt follow indexing, Duplicates not allowed, Single null allowed"+aL); //[32, Pradnya, null, 35, c, 20, 26, 30]
//		Collections.sort(aL); 
		System.out.println("Sorting not allowed in set");
		
		Iterator i1= aL.iterator();
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Iteration Not Possible using listIterator");
//		ListIterator i2= aL.listIterator(); 
	}

}
