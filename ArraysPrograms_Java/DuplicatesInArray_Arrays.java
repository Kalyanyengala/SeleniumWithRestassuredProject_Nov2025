package ArraysPrograms_Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray_Arrays 
{
	public static void main(String[] args) 
	{
//		int arr[] = { 1, 2, 3, 4, 5 , 6 };
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println(arr[i]);
//					status = true;
//					break;
//				}
//			}
//		}
//		
//		if(status == false)
//		{
//			System.out.println("Duplicates not found");
//		}
		
//		int arr[] = { 1, 2, 3 , 4, 1, 2 };
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println("Duplicates are founded :" + arr[i]);
//					status = true;
//					break;
//				}
//			}		
//		}
//		if(status == false)
//		{
//			System.out.println("Duplicates are not founded");
//		}
		
		
//		int arr[] = { 1, 2, 3, 4, 4, 3, 5 };
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1 ; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println("Duplicates are founded :" + arr[i]);
//					status = true;
//					break;
//				}
//			}
//		}
//		if(status == false)
//			System.out.println("Duplicates are not founded");/
		
		// Approach 2
		
//		int arr[] = { 1, 2, 3, 4, 4, 3, 5 };
//		HashSet<Integer> set = new HashSet<>();
//		boolean status = false;
//		
//		for(Integer ar : arr)
//		{
//			if(set.add(ar) == false)
//			{
//				System.out.println("Duplicates are founded : " + ar);
//				status = true;
//				
//			}
//		}
//		if(status == false)
//			System.out.println("Duplicates are not founded ");
//		
		
//		String arr[] = { "Java", "selenium" , "Java" , "Python" , "Python"};
//		boolean status = false;
//		
//		HashSet<String> set = new HashSet<>();
//		
//		for(String ar : arr)
//		{
//			if(set.add(ar) == false)
//			{
//				System.out.println("Duplicates are founded :" + ar);
//				status = true;
//			}
//		}
//		if(status == false)
//			System.out.println("Duplicates are not founded");
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 8};
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println(arr[i]);
//					status = true;
//					break;
//				}
//			}
//		}
//		
//		if(status == false)
//		{
//			System.out.println("Duplicates are not founded");
//		}
		
//		int arr[] = { 1, 2, 3, 4, 3, 2, 5};
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			for(int j = i + 1; j <= arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println(arr[i]);
//					status = true;
//					break;
//				}
//			}
//		}
//		
//		if(status == false)
//			System.out.println("Duplicates are not founded");
		
		
		
		
//		int arr[] = { 1, 2, 3, 4, 3, 2, 5};
//		HashSet set = new HashSet();
//		boolean status = false;
//		
//		for(int ar : arr)
//		{
//			if(set.add(arr) == false)
//			{
//				System.out.println("Duplictaes are founded :" + ar);
//				status = true;
//				break;
//				
//			}
//		}
//		
//		if(!status)
//			System.out.println("Duplictaes are not founded");
		
//		int arr[] = { 1, 2, 3, 4, 3, 2, 1, 9 };
//		boolean status = false;
//		Set<Integer> set = new HashSet();
//		
//		for(int ar : arr)
//		{
//			if(set.add(ar) == false)
//			{
//				System.out.println("Duplicates are founded :" + ar);
//				status = true;
//				
//			}
//		}
//		
//		if(!status)
//			System.out.println("Duplicates are not founded ");	
		
//		String arr[] = { "Java", "selenium" , "Java" , "Python" , "Python"};
//		boolean status = false;
//		Set<String> set = new HashSet<>();
//		
//		for(String st : arr)
//		{
//			if(set.add(st) == false)
//			{
//				System.out.println("Duplicates are founded :" + st);
//				status = true;
//			}
//		}
//		
//		if(status == false)
//			System.out.println("Duplicates are not founded");
//		
//		int arr[] = { 1, 2, 3, 4, 3 , 4 , 5};
//		boolean duplicates = false;
//		
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println("Duplicates are founded :" + arr[i]);
//					duplicates = true;
//				}
//			}
//		}
//		
//		if(!duplicates)
//		{
//			System.out.println("Duplicates are not founded");
//		}
//		
//		Set<Integer> set = new HashSet<>();
//		
//		boolean status = false;
//		
//		for(Integer ar : arr)
//		{
//			if(set.add(ar) == false)
//			{
//				System.out.println("Duplicates are founded :" + ar);
//				status = true;
//			}
//		}
//		
//		if(!status)
//			System.out.println("Duplicates are not founded.");
		
//		int arr[] = { 1, 2, 3, 4, 4, 3, 5 };
//		boolean status = false;
//		
//		for(int i = 0 ; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					System.out.println("Duplicates are founded :" + arr[i]);
//					status = true;
//				}
//			}
//		}
//		if(!status)
//			System.out.println("Duplicates are not founded");
		
		int arr[] = { 1, 2, 3, 4, 4, 3, 5 };
		Set<Integer> set = new HashSet<>();
		boolean duplicates = false;
		
		for(Integer ar : arr)
		{
			if(set.add(ar) == false)
			{
				System.out.println("Duplicates are founded:" + ar);
				duplicates = true;
			}
			
		}
		if(!duplicates)
			System.out.println("Duplicates are not founded");
				
		
	}

}
