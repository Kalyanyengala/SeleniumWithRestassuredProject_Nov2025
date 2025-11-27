package ArraysPrograms_Java;

import java.util.Arrays;

public class TwoArraysAreEqual_Arrays 
{
	public static void main(String[] args) 
	{
//		int arr1[] = {1, 2, 3, 4, 5};             -----> Not corrected Logic 
//		int arr2[] = {1, 2, 3, 4, 5, 6};
//		boolean status = false;
//		
//		for(int i = 0; i <= arr1.length-1; i++)
//		{
//			if(arr1[i] == arr2[i])
//			{
//				System.out.println("Arrays are equals ");
//				status = true;
//				break;
//			}
//			else
//			{
//				System.out.println("Arrays are not equal ");
//			}
//		}
		
		
//		int arr1[] = { 1, 2, 3, 4, 5};
//		int arr2[] = { 1, 2, 3, 4, 5};
//		boolean status = true;
//		
//		if(arr1.length == arr2.length)
//		{
//			
//		for(int i = 0; i <= arr1.length-1; i++)
//		{
//			if(arr1[i] != arr2[i])
//			{
//				status = false;
//			}
//		}		
//		}
//		else
//		{
//			status = false;
//		}
//		
//		if(status == true)
//		{
//			System.out.println("Arrays are equal");
//		}
//		else
//		{
//			System.out.println("Arrays are not equal");
//		}
		
		
//		int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 1, 2, 3, 4, 5 };
//		boolean status = true;
//		
//		if(arr1.length == arr2.length)
//		{
//			for(int i = 0; i <= arr1.length-1; i++)
//			{
//				if(arr1[i] != arr2[i])
//				{
//					status = false;
//				}
//			}
//		}
//		else
//		{
//			status = false;
//		}
//		
//		if(status == true)
//		{
//			System.out.println("Given arrays are equal");
//		}
//		else
//		{
//			System.out.println("Given arrays are not equal");
//		}
		
//		int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 1, 2, 3, 4, 5 };
//		
//		boolean status = Arrays.equals(arr1, arr2);
//		
//		if(status == true)
//			System.out.println("Given arrays are equals");
//		else
//			System.out.println("Given arrays are not equal");	
		
//		int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 1, 2, 3, 4, 5 };
//		boolean status = true;
//		
//		if(arr1.length == arr2.length)
//		{
//			for(int i = 0; i <= arr1.length-1; i++)
//			{
//				if(arr1[i] != arr2[i])
//				{
//					
//					 status = false;				 
//				}
//				
//			}
//		}
//		else
//			status = false;
//		if(status == true)
//		{
//			System.out.println("Arrays are equal");
//		}
//		else
//			System.out.println("Arrays are not equal");
//			
		
//		int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 1, 2, 3, 4, 8 };
//		boolean status = true;
//		
//		if(arr1.length == arr2.length)
//		{
//			for(int i = 0; i <= arr1.length-1; i++)
//			{
//				if(arr1[i] != arr2[i])
//				{
//					status = false;
//				}
//			}
//		}
//		else
//			status = false;
//		if(status == true)
//		{
//			System.out.println("Both arrays are equal");
//		}
//		else
//			System.out.println("Not equal");		
		
//		int arr1[] = { 1, 2, 3, 4, 5 };
//		int arr2[] = { 1, 2, 3, 4, 5 };
//		boolean status = true;
//		
//		if(arr1.length == arr2.length)
//		{
//			for(int i = 0; i < arr1.length; i++)
//			{
//				if(arr1[i] != arr2[i])
//				{
//					status = false;
//				}
//			}
//		}
//		else
//		{
//			status = false;
//		}
//		
//		if(status)
//		{
//			System.out.println("Given both arrays are equal");
//		}
//		else
//			System.out.println("Given both arrays are not equal");	
		
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5 };
		boolean status = true;
		
		if(arr1.length == arr2.length)
		{
			for(int i = 0; i < arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
					status = false;
			}
		}
		else
			status = false;
		if(status)
			System.out.println("Given both arrays are equals");
		else
			System.out.println("Given both arrays are not equals");		
	}

}
