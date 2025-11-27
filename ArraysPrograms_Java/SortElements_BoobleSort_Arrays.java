package ArraysPrograms_Java;

import java.util.Arrays;

public class SortElements_BoobleSort_Arrays 
{
	public static void main(String[] args)
	{
//		int array[] = { 1 ,2 ,3, 5, 9, 7, 6, 4};
//		int temp = 0;
//		
//		System.out.print("Before sorting :" + Arrays.toString(array));
//		
//		for(int i = 0; i < array.length-1; i++)
//		{
//			for(int j = 0; j < array.length-1; j++)
//			{
//				if(array[j] > array[j+1])
//				{
//					temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		
//		System.out.print("After sorting :" + Arrays.toString(array));
		
		
//		int array[] = { 2, 3, 5, 6, 1, 8, 7, 9, 0, 4};
//		
//		System.out.println("Before sorting :" + Arrays.toString(array));
//		
//		for(int i = 0; i < array.length-1; i++)
//		{
//			for(int j = 0; j < array.length-1; j++)
//			{
//				if(array[j] > array[j + 1])
//				{
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[ j + 1] = temp;
//				}
//			}
//		}
//		System.out.println("After sorting :" + Arrays.toString(array));
		
		
//		int array[] = { 2, 4, 6, 8, 0, 1, 3, 5, 7, 9};
//		
//		int temp = 0;
//		
//		System.out.println("Before sorting :" + Arrays.toString(array));
//		
//		
//		for(int i = 0; i < array.length-1; i++)
//		{
//			for(int j = 0; j < array.length-1; j++)
//			{
//				if(array[j] > array[ j + 1])
//				{
//					temp = array[j];
//					array[j] = array[ j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//		
//		System.out.println("After sorting :" + Arrays.toString(array));
//		
//		// Approach 2
//		
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		
//		// Approach 3
//		
//		Arrays.parallelSort(array);
//		System.out.println(Arrays.toString(array));		
		
		
//		int arr[] = { 4 , 3, 6, 7, 9, 1, 2, 3 };
//		int temp = 0;
//		
//		System.out.println("Before sorting :" + Arrays.toString(arr));
//		
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			for(int j = 0; j < arr.length-1; j++)
//			{
//				if(arr[j] > arr[j + 1])
//				{
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[ j + 1] = temp;
//				}
//			}
//		}
//		
//		System.out.println("After sorting :" + Arrays.toString(arr));	
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		
//		int arr[] = { 4 , 3, 6, 7, 9, 1, 2, 3 };
//		int temp = 0;
//		
//		System.out.println("Before sorting :" + Arrays.toString(arr));
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			for(int j = 0; j < arr.length-1; j++)
//			{
//				if(arr[j] > arr[j + 1])
//				{
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		
//		System.out.println("After sorting :" + Arrays.toString(arr));
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));	
		
//		int arr[] = { 5, 3, 4, 6, 1 ,2 , 7 };
//		int temp = 0;
//		
//		System.out.println("Printing before sorting :" + Arrays.toString(arr));
//		
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			for(int j=0; j < arr.length-1; j++)
//			{
//				if(arr[j] > arr[j + 1])
//				{
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		
//		System.out.println("Printing after sorting :" + Arrays.toString(arr));
//		
//		// Approach 2
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));	
		
		int arr[] = { 2, 1, 4, 3, 5, 7, 6 , 8 };
		int temp = 0;
		
		System.out.println("Printing array before sorting :" + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr.length-1; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
 		
		System.out.println("Printing array after sorting :" + Arrays.toString(arr));		
		
		// Approach 2
		
		int arr1[] = { 2, 1, 4, 3, 5, 7, 6 , 8 };
		
		System.out.println("Printing array before sorting :" + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Printing array after sorting :" + Arrays.toString(arr1));
		
		// Approach 3
		
        int arr2[] = { 2, 1, 4, 3, 5, 7, 6 , 8 };
		
		System.out.println("Printing array before sorting :" + Arrays.toString(arr2));
		Arrays.parallelSort(arr2);
		System.out.println("Printing array after sorting :" + Arrays.toString(arr2));
		
	}

}
