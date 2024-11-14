package Java_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ass85_Queue_Properties 
{
	public static void main(String[] args) 
	{
		Queue q1 = new LinkedList();
		q1.add(123);
		q1.add(124);
		q1.add(123);
		q1.add(12);
		q1.add(200);
		q1.add(10);
		q1.add(123);
		
//		q1.add("bhavani");
//		q1.add("bhavaniiii");
//		q1.add(null);
//		q1.add(true);
//		q1.add(123);
//		q1.add(null);
		System.out.println(q1);
		
//		Collections.sort(q1);   // Sort is Not applicable for queue
		
		Iterator qI = q1.iterator();
		while(qI.hasNext())
		{
			System.out.println(qI.next());
		}

//		ListIterator qIL = q1.listIterator();// listIterator is Not applicable for queue
		


	}
}
