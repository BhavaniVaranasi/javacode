package Java_programs;

public class Ass90_StringBuilder_Methods 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("bhavani");
		StringBuilder sb2 = new StringBuilder(10);
		
		System.out.println("StringBuilder without Para - "+sb);
		System.out.println("StringBuilder with Para - "+sb1); 
		System.out.println("StringBuilder with int Para - "+sb2);
		
		sb1.append(" varanasi");
		System.out.println("After Append - "+sb1); 
		System.out.println("After Insert - "+sb1.insert(0, " 1234")); 
		System.out.println("After Delete - "+sb1.delete(0, 5)); 
		System.out.println("After replace - "+sb1.replace(0, 7, "Bharat")); 
		System.out.println("After Substring - "+sb1.substring(0, 7)); 
		System.out.println("After Substring - "+sb1.substring(7)); 
		System.out.println("CharAt 4th index - "+sb1.charAt(4));
		System.out.println("After Reverse - "+sb1.reverse()); 
		

	}
}
