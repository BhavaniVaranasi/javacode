package Java_programs;
interface interface1
{
	void method1();
	void method2(int a);
}

public class Ass66_Interface implements interface1
{
	public static void main(String[] args) 
	{
		Ass66_Interface obj = new Ass66_Interface();
		obj.method1();
		obj.method2(20);

	}

	@Override
	public void method1() 
	{
		System.out.println("ovveriden abs method without para");
		
	}

	@Override
	public void method2(int b) 
	{
		System.out.println("ovveriden abs method with para int "+b);
		
	}

}
