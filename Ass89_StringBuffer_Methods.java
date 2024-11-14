package Java_programs;

public class Ass89_StringBuffer_Methods 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("bhavani varanasi");
		System.out.println("Original StringBuffer - "+ sb);
		sb.append(" @91");
		System.out.println("After Append - "+sb); 
		sb.insert(0, "sss. ");
		System.out.println("After Insert - "+sb); 
		sb.replace(0, 5, "---");
		System.out.println("After replace - "+sb); 
		sb.delete(0, 3);
		System.out.println("After Delete - "+sb); 
		System.out.println("Length-"+sb.length()); 
		System.out.println("Char at index 6-"+sb.charAt(6));
		System.out.println("Substring - "+ sb.substring(0, 8)); 
		System.out.println("After Reverse - "+sb.reverse()); 
		System.out.println("String capacity - "+sb.capacity());  
		
		

	}

}
