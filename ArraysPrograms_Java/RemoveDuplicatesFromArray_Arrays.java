package ArraysPrograms_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray_Arrays 
{
	public static void main(String[] args)
	{
//			int arr[] = { 1, 2, 3, 4, 4, 3, 2};
//			int length = arr.length;
//			int temp[] = new int[length];
//			int j = 0;
//			
//			for(int i = 0; i < length; i++)
//			{
//				boolean duplicate = false;
//				
//				for(int k = 0; k < j; k++)
//				{
//					if(arr[i] == temp[k])
//					{
//						duplicate = true;
//						break;
//					}
//				}
//				
//				if(!duplicate)
//				{
//					temp[j++] = arr[i];
//				}
//			}
//			
//			int arr2[] = Arrays.copyOf(temp, j);
//			System.out.println(Arrays.toString(arr2));
			
			// Approach 2
			
//		int arr[] = { 1, 2, 3, 4, 4, 3, 2};
//		
//			Set<Integer> set = new LinkedHashSet<>();
//			
//			for(int ar : arr)
//			{
//				set.add(ar);
//			}
//			
//			System.out.println(set);
		
//		int arr[] = { 1, 2, 3, 4, 4, 3, 2};
//		int length = arr.length;
//		
//		int temp[] = new int[length];
//		int exampleArray = 0;
//		
//		boolean duplicates = false;
//		
//		for(int i = 0; i < length; i++)
//		{			
//			duplicates = false;
//			
//			for(int j = 0; j < exampleArray; j++ )
//			{
//				if(arr[i] == temp[j])
//				{
//					duplicates = true;
//					break;
//				}
//			}
//			
//			if(!duplicates)
//			{
//				temp[exampleArray++] = arr[i];
//			}
//		}
//		
//		int finalArray [] = Arrays.copyOf(temp, exampleArray);
//		System.out.println(Arrays.toString(finalArray));
		
//		int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2 };
//		int length = arr.length;
//		int temp[] = new int[length];
//		int varible = 0;
//		boolean duplicate = false;
//		
//		for(int i = 0; i < length; i++)
//		{
//			duplicate = false;
//			
//			for(int j = 0; j < varible; j++)
//			{
//				if(arr[i] == temp[j])
//				{
//					duplicate = true;
//					break;
//				}
//			}
//			
//			if(!duplicate)
//			{
//				temp[varible++] = arr[i];
//			}
//		}
//		
//		int finalArray[] = Arrays.copyOf(temp, varible);
//		System.out.println(Arrays.toString(finalArray));	
		
		// Approach 2
		
//		int arr[] = { 1, 2, 3, 4, 4, 3, 2};
//		
//		Set<Integer> set = new HashSet<>();
//		
//		for(int array : arr)
//		{
//			set.add(array);
//		}
//		
//		System.out.println(set);
		
		
		int arr[] = { 1, 2, 3, 4, 4, 3, 5, 6, 5, 8 };
		int arrLength = arr.length;
		
		int temp[] = new int[arrLength];
		int tempVarible = 0;
		boolean duplicates = false;
		System.out.println("Printing array before removing duplicates :" + Arrays.toString(arr));
		
		for(int i = 0; i < arrLength; i++)
		{
			duplicates = false;
			
			for(int j = 0; j < tempVarible; j++)
			{
				if(arr[i] == temp[j])
				{
					duplicates = true;
					break;
				}
			}
			
			if(!duplicates)
			{
				temp[tempVarible++] = arr[i];
			}
		}
		
		int arr2[] = Arrays.copyOf(temp, tempVarible);
		System.out.println("Printing array after removing duplicates :" + Arrays.toString(arr2));		
		
//		Set<Integer> set = new HashSet<>();
//		
//		for(int ar : arr)
//		{
//			set.add(ar);	
//			
//		}
//		
//		System.out.println(set);
		
		Set<Integer> set = new HashSet<>();
		for(int ar : arr)
		{
			set.add(ar);
		}
		
		System.out.println(set);
	}
	

}
