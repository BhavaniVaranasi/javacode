package Java_programs;

class Parent_Class
{
	void parent_Method()
	{
		System.out.println("parent_Method without parameter");
		
	}
	void parent_Method(int a)
	{
		System.out.println("parent_Method with int parameter "+a);
	}
}
public class Ass63_Super_Keyword extends Parent_Class
{
	void parent_Method()
	{
		System.out.println("Child_Method without parameter");
		super.parent_Method();
	}
	void parent_Method(int a)
	{
		System.out.println("Child_Method with int parameter "+a);
		super.parent_Method(50);
	}
	public static void main(String[] args) 
	{
		Ass63_Super_Keyword obj = new Ass63_Super_Keyword();
		obj.parent_Method();
		obj.parent_Method(30);

	}
}
