package ArraysPrograms_Java;

import java.util.Arrays;

public class SumOfArrays 
{
	public static void main(String[] args) 
	{
//		int array[] = {1,2,3,4,5};
//		int sum = 0;
//		
//		for(int i = 0; i <= array.length-1; i++)
//		{
//			sum = sum + array[i];
//		}
//		
//		System.out.println("Sum of array is :" + sum);
//		
//		for(int arr : array)
//		{
//			sum = sum + arr;
//		}
//		
//		System.out.println(sum);
		
//		int array[] = {2, 4, 6, 8, 5};
//		int sum = 0;
//		
//		for(int i = 0; i <= array.length-1; i++)
//		{
//			sum = sum + array[i];
//		}
//		System.out.println("Sum of array is :" + sum );
//		
//		for(int arr : array)
//		{
//			sum = sum + arr;
//		}
//		
//		System.out.println("Sum of array is :" + sum );
		
		
//		int arr[] = { 1, 2 ,3 ,4 ,5 };
//		int sum = 0;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum of array is : "+ sum);
//		
//		for(int ar : arr)
//		{
//			sum = sum + ar;
//		}
//		System.out.println("Sum of array is : "+ sum);
		
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];			
		}
		
		System.out.println("Printing array is :" + Arrays.toString(arr) +"  And Sum is ----> "+ sum);		
		
	}

}
