package Java_programs;

public class Ass98_Type_Casting_Widening 
{
	/*
	 *  Convert int to double
	 */

	public static void main(String[] args) 
	{
		int x= 897;
		double y = x; //implicit conversion
		double z = (int) x;  //explicit conversion
		System.out.println(y);  
		System.out.println(z);
		System.out.println(x);

	}

}
