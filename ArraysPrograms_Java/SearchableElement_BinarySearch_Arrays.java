package ArraysPrograms_Java;

import java.util.Arrays;

public class SearchableElement_BinarySearch_Arrays
{
	public static void main(String[] args)
	{
//		int array[] = { 1, 2, 3, 4, 5};
//		int lowValue = 0;
//		int highValue = array.length-1;
//		int midValue;
//		int keyValue = 5;
//		boolean status = false;
//		
//		while(lowValue <= highValue)
//		{
//			midValue = (lowValue + highValue) / 2;
//			
//			if(array[midValue] == keyValue)
//			{
//				System.out.println("Searchable element is founded : " + array[midValue]);
//				status = true;
//				break;
//			}
//			
//			if(array[midValue] > keyValue)
//			{
//				highValue = midValue -1;
//			}
//			
//			if(array[midValue] < keyValue)
//			{
//				lowValue = midValue +1;
//			}
//			
//		 }
//		
//		if(status == false)
//			System.out.println("Searchable element is not founded");
		
		
//		int array[] = { 1, 2, 3, 4, 5};
//		int lowValue = 0;
//		int highValue = array.length-1;
//		int keyValue = 4;
//		int midValue = 0;
//		boolean status = false;
//		
//		while(lowValue <= highValue)
//		{
//			midValue = (lowValue + highValue) / 2;
//			
//			if(array[midValue] == keyValue)
//			{
//				System.out.println("Searchable element is founded : " + array[midValue]);
//				status = true;
//				break;
//			}
//			
//			if(array[midValue] < keyValue)
//			{
//				lowValue = midValue + 1;
//			}
//			
//			if(array[midValue] > keyValue)
//			{
//				highValue = midValue - 1;
//				
//			}
//			
//		}
//		
//		if(status == false)
//			System.out.println("Searchable element is not founded ");
//		
//		System.out.println(Arrays.binarySearch(array, keyValue));
//		
//		int array[] = { 1, 2, 3, 4, 5 };
//		int keyValue = 5;
//		int lowValue = 0;
//		int highValue = array.length-1;
//		int midValue = 0;
//		boolean status = false;
//		
//		while(lowValue <= highValue)
//		{
//			midValue = ( lowValue + highValue );
//			
//			if(array[midValue] == keyValue)
//			{
//				System.out.println("Searchable element is founded :" + array[midValue]);
//				status = true;
//				break;
//			}
//			
//			if(array[midValue] < keyValue)
//			{
//				lowValue = midValue + 1;
//			}
//			
//			if(array[midValue] > keyValue)
//			{
//				highValue = midValue -1;
//			}
//		}
//		
//		if(status == false)
//			System.out.println("Searchable element is not founded");
//		
//		// Approach 2
//		
//		System.out.println("Indexing of keyValue is :" + Arrays.binarySearch(array, keyValue));
		
//		int arr[] = { 1, 2, 3, 4, 5 };
//		int lowValue = 0;
//		int highValue = arr.length-1;
//		int keyValue = 5;
//		int midValue = 0;
//		boolean status = false;
//		
//		while(lowValue <= highValue)
//		{
//			midValue = (lowValue + highValue) / 2;
//			
//			if(arr[midValue] == keyValue)
//			{
//				System.out.println("Searchable element is founded :" + arr[midValue]);
//				status = true;
//				break;
//			}
//			
//			if(arr[midValue] < keyValue)
//			{
//				lowValue = midValue + 1;
//			}
//			
//			if(arr[midValue] > keyValue)
//			{
//				highValue = midValue - 1;
//			}
//			
//		}
//		
//		if(status == false)
//		{
//			System.out.println("searchanle element is not founded");
//		}
		
		int arr[] = { 1, 2, 3, 4, 5 };
		int keyValue = 5;
		int lowValue = 0;
		int highValue = arr.length-1;
		int midValue = 0;
		boolean status = false;
		
		while(lowValue <= highValue)
		{
			midValue = (lowValue + highValue) / 2;
			
			if(arr[midValue] == keyValue)
			{
				System.out.println("Searchable element is founded :" + arr[midValue]);
				status = true;
				break;
			}
			
			if(arr[midValue] < keyValue)
			{
				lowValue = midValue + 1;
			}
			
			if(arr[midValue] > keyValue)
			{
				highValue = midValue - 1;
			}
		}
		
		if(!status)
			System.out.println("Searchable element is not founded");		
	}

}
