package Java_programs;

public class Ass95_SIB_IIB_Constructor 
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	Ass95_SIB_IIB_Constructor()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new Ass95_SIB_IIB_Constructor();
	}
}
