package Java_programs;

public class Ass61_This_Calling_Statement 
{
	Ass61_This_Calling_Statement()
	{
		this('s');
		System.out.println("Constructor without parameter ");
	}
	Ass61_This_Calling_Statement(int a)
	{
		System.out.println("Constructor with int parameter "+a);
	}
	Ass61_This_Calling_Statement(char s)
	{
		this(30);
		System.out.println("Constructor with char parameter "+s);
	}

	public static void main(String[] args) 
	{
		
		new Ass61_This_Calling_Statement();
		
	}
}
