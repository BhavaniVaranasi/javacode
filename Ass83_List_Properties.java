package Java_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ass83_List_Properties 
{
	public static void main(String[] args) 
	{
		List<Integer>  aL=new ArrayList<Integer> ();
		aL.add(301);
		aL.add(260);
		aL.add(208);
		aL.add(307);
		aL.add(353);
		aL.add(327);
//		aL.add("bharat");
//		aL.add('v');
//		aL.add(null);
//		aL.add(null);
		
		System.out.println("Follows indexing, null, duplicates"+ aL);
//		Collections.sort(aL);
		System.out.println("After Sort"+aL);
		
		Iterator i1= aL.iterator();
		System.out.println("Forword Iteration using iterator");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Forword Iteration using listIterator");
		ListIterator i2= aL.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Reversse Iteration using listIterator");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
