package Java_programs;

public class Ass68_to_Assignment76_String_Functions 
{
	static void Assignment68()
	{
		String name="Manish";
		String nameReplace = name.replace('h','z');
		System.out.println("Original String "+name);
		System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment69()
	{
		String name="Manish Tiwari";
		String nameReplace = name.replaceAll("Tiwari","Kumar");
		System.out.println("Original String "+name);
		System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment70()
	{
		// Replace all the alphbates
		String name="Manish#1234 87@$";
		String nameReplace = name.replaceAll("[a-z]","");
		System.out.println("Original String "+name);
		System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment71()
	{
		// Replace all the Numerics
		String name="Manish#1234 87@$";
		String nameReplace = name.replaceAll("[0-9]","");
		System.out.println("Original String "+name);
		System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment72()
	{
		// Replace all the Capital letters
		String name="ManisH#1234 87@$";
		String nameReplace = name.replaceAll("[A-Z]","");
		System.out.println("Original String "+name);
		System.out.println("After replace h with z ->"+nameReplace);
	}
	static void Assignment73()
	{
		// Check if string ends with 'I'
		String name="AshvinI";
		boolean result = name.matches("(.*)I");
		if(result)
		{
			System.out.println("String ends with I");
		}
	}
	static void Assignment74()
	{
		// Check if string starts with 'A'
		String name="AshvinI";
		boolean result = name.matches("A(.*)");
		if(result)
		{
			System.out.println("String Starts with A");
		}
	}
	static void Assignment75()
	{
		// Check if string contains 'a'
		String name="AshvanI";
		boolean result = name.matches("(.*)a(.*)");
		if(result)
		{
			System.out.println("String Contains a");
		}
	}
	static void Assignment76()
	{
		// Check if string has exact 4 chars
		String name="myra";
		boolean result = name.matches("....");
		if(result)
		{
			System.out.println("String has exact 4 characters");
		}
	}
	
	public static void main(String[] args) 
	{
		Assignment68();
		Assignment69();
		Assignment70();
		Assignment71();
		Assignment72();
		Assignment73();
		Assignment74();
		Assignment75();
		Assignment76();

	}
}
