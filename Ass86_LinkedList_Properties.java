package Java_programs;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ass86_LinkedList_Properties 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> lList = new LinkedList<Integer>();
		lList.add(123);
		lList.add(235);
		lList.add(12);
		lList.add(1);
		lList.add(123);
//		lList.add(null);
//		lList.add("myra");
//		lList.add(true);
//		lList.add(null);
		
		System.out.println(lList);
		Collections.sort(lList);
		System.out.println("After sort "+lList);
		
		Iterator<Integer> it_lList = lList.iterator();
		System.out.println("********Iterator hasNext**********");
		while(it_lList.hasNext())
		{
			System.out.println(it_lList.next());
		}
		
		ListIterator<Integer> it_lList1 = lList.listIterator();
		System.out.println("**********ListIterator hasNext**********");
		while(it_lList1.hasNext())
		{
			System.out.println(it_lList1.next());
		}
		System.out.println("**********ListIterator hasPrevious**********");
		while(it_lList1.hasPrevious())
		{
			System.out.println(it_lList1.previous());
		}
	}
}
