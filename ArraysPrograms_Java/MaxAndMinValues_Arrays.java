package ArraysPrograms_Java;

import java.util.Arrays;

public class MaxAndMinValues_Arrays 
{
	public static void main(String[] args)
	{
//		int arr[] = { 10, 2, 3, 4, 50 }; 
//		int maxValue = 0;
//		int minValue = 0;
//		
//		maxValue = arr[0];
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] > maxValue)
//			{
//				maxValue = arr[i];
//			}
//		}
//		System.out.println("MaximumValue in an array is :" + maxValue);
//		
//		minValue = arr[0];
//		
//		for(int i = 0 ; i <= arr.length-1; i++)
//		{
//			if(arr[i] < minValue)
//			{
//				minValue = arr[i];
//			}
//		}
//		
//		System.out.println("MinValue in an array is : "+ minValue);
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 9 };
//		int maxValue;
//		int minValue;
//		
//		maxValue = arr[0];
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] > maxValue)
//			{
//				maxValue = arr[i];
//			}
//		}
//		
//		System.out.println("Maximum Value is :" + maxValue);
//		
//		minValue = arr[0];
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] < minValue)
//			{
//				minValue = arr[i];
//			}
//		}
//		
//		System.out.println("MinimumValue is :" + minValue);
//		
//		
//		Arrays.sort(arr);
//		System.out.println("MaxValue is :" + arr[arr.length-1]);
//		System.out.println("MinValue is :" + arr[0]);
//		
//		Arrays.sort(arr);
//		
//		System.out.println("MixValue is :" + arr[arr.length-1]);
//		System.out.println("MinValue is :" + arr[0]);
		
		
		
//		Arrays.sort(arr);
//		System.out.println("Maximum Values of Array is : "+ arr[arr.length-1]);
//		System.out.println("Minimum values of array is :" + arr[0]);
		
		
//		int arr[] = { 1, 2, 3, 4, 5 };
//		int maxValue = 0;
//		int minValue = 0;
//		
//		maxValue = arr[0];
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] > maxValue)
//			{
//				maxValue = arr[i];
//			}
//		}
//		
//		System.out.println("Printing maximum value of array is :" + maxValue);
//		
//		minValue = arr[0];
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] < minValue)
//			{
//				minValue = arr[i];
//			}
//		}
//		
//		System.out.println("Printing minimum value of array is :" + minValue);		
		
//		int arr[] = { 1, 2, 3, 4, 5, 6 };
//		int maxValue = 0;
//		int minValue = 0;
//		
//		
//		
//		maxValue = arr[0];
//		for(int i = 0; i < arr.length; i++)
//		{
//			if(arr[i] > maxValue)
//			{
//				maxValue = arr[i];
//			}
//		}
//		System.out.println("Printing maxValues :" + maxValue);
//        
//		
//        minValue = arr[0];
//		for(int i = 0; i < arr.length; i++)
//		{
//			if(arr[i] < minValue)
//			{
//				minValue = arr[i];
//			}
//		}		
//		
//		System.out.println("Printing minValues :" + minValue);
//		
//		Arrays.sort(arr);
//		System.out.println("Printing maxValue :" + arr[arr.length-1]);
//		System.out.println("Printing minValue :" + arr[0]);
		
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int maxValue = arr[0];
		int minValue = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > maxValue)
				maxValue = arr[i];
		}
		
		System.out.println("Printing maxValues :" + maxValue);
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < minValue)
				minValue = arr[i];
		}
		
		System.out.println("Printing minValues :" + minValue);
		
		Arrays.sort(arr);
		System.out.println("Maxvalue is :" + arr[arr.length-1]);
		System.out.println("Minvalue is :" + arr[0]);		
	}

}
