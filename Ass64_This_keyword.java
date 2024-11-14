package Java_programs;

public class Ass64_This_keyword 
{
	int i = 32;
	String s1 = "bhavani varanasi";
	
	void method1(int y, String z)
	{
		this.i=y;
		this.s1=z;
	}
	
	public static void main(String[] args)
	{
		int x=37;
		String s2 = "myra";
		Ass64_This_keyword obj = new Ass64_This_keyword();
		System.out.println("Original Global value of i = "+obj.i);
		System.out.println("Original Global value of s1 = "+obj.s1);
		obj.method1(x,s2);
		System.out.println("After this keyword Global value of i = "+obj.i);
		System.out.println("After this keyword Global value of s1 = "+obj.s1);
	
	}

}
