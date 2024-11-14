package Java_programs;

public class Ass67_Math_Class 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=30;
		float c=009.5f;
		float c1=16523.5f;
		double d=100.234;
		double d1=000.234;
		long l = 7687;
		long l1 = 798700;
		
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.addExact(l,l));
		System.out.println(Math.subtractExact(a, b));
		System.out.println(Math.subtractExact(l, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.max(c,c1));
		System.out.println(Math.max(d,d1));
		System.out.println(Math.max(l,l1));
		System.out.println(Math.min(a, b));
		System.out.println(Math.min(c,c1));
		System.out.println(Math.min(d,d1));
		System.out.println(Math.min(l,l1));
		System.out.println(Math.multiplyExact(a, b));
		System.out.println(Math.multiplyExact(l1, l));
		System.out.println(Math.multiplyExact(a, l));
		System.out.println(Math.abs(a));
		System.out.println(Math.abs(l));
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(c));
		System.out.println(Math.random());
		System.out.println(Math.divideExact(b, a));
		System.out.println(Math.divideExact(l1, l));
				
	}
}
