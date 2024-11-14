package Java_programs;

import java.util.Arrays;

public class Ass77_78_Array_both 
{
	static void Assignment77()
	{
		// copy array into other
		int array1[] = new int[4];
		array1[0] = 12;
		array1[1] = 60;
		array1[2] = 39;
		array1[3] = 27;
		int array2[] = new int[4];
		System.out.println("Array1 - "+Arrays.toString(array1));
		for(int i=0; i<array2.length;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println("Array2 - "+Arrays.toString(array2));
		
	}
	static void Assignment78()
	{
		// copy array into other in reverse order
		int array1[] = new int[4];
		array1[0] = 12;
		array1[1] = 60;
		array1[2] = 39;
		array1[3] = 27;
		int array2[] = new int[4];
		System.out.println("Original Array1 - "+Arrays.toString(array1));
		for(int i=0, k=array2.length-1; i<array2.length;i++, k--)
		{
			array2[i]=array1[k];
		}
		System.out.println("Reversed Array2 - "+Arrays.toString(array2));
		
	}

	public static void main(String[] args) 
	{
		Assignment77();
		Assignment78();
	}

}
