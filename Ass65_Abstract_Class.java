package Java_programs;
/*
 * Assignment 65 - WAP for Abstract class which has concrete and abstract methods in it and access those methods
 */
abstract class AbsClass
{
	abstract void method1();
	void method2()
	{
		System.out.println("Non Static Concrete method in abs class");
	}
	static void method3()
	{
		System.out.println("Static Concrete method in abs class");
	}

}
public class Ass65_Abstract_Class extends AbsClass
{
	public static void main(String[] args) 
	{
		method3();
		Ass65_Abstract_Class obj = new Ass65_Abstract_Class();
		obj.method2();
		obj.method1();

	}

	@Override
	void method1() 
	{
		System.out.println("in this method - Abstract method ovveriden in subclass i.e in Main method");
		
	}
}
