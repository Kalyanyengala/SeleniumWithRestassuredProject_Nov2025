package ArraysPrograms_Java;

public class SecondLargest_Array_Arrays 
{
	public static void main(String[] args) 
	{
//		int arr[] = { 1, 2, 3, 4, 5 , 6 };
//		int max1 = 0;
//		int max2 = 0;
//		
//		if(arr[0] > max1)
//		{
//			max1 = arr[0];
//			max2 = arr[1];
//		}
//		else 
//		{
//			max1 = arr[1];
//			max2 = arr[0];
//		}
//		
//		for(int i = 2; i <= arr.length-1; i++ )
//		{
//			if(arr[i] > max1)
//			{
//				max2 = max1;
//				max1 = arr[i];
//			}
//			else if(arr[i] > max2)
//			{
//				max2 = arr[i];
//			}
//		}
//		
//		System.out.println("Printing maximum value is : "+ max1);
//		System.out.println("Priting second maximum value : " + max2);
		
		
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int max1 = 0;
//		int max2 = 0;
//		
//		if(arr[0] > max1)
//		{
//			max1 = arr[0];
//			max2 = arr[1];
//		}
//		
//		else 
//		{
//			max1 = arr[1];
//			max2 = arr[0];
//		}
//		
//		for(int i = 2; i <= arr.length-1; i++)
//		{
//			if(arr[i] > max1)
//			{
//				max2 = max1;
//				max1 = arr[i];
//			}
//			
//			else if(arr[i] > max2)
//			{
//				max2 = arr[i];
//			}
//		}
//		
//		System.out.println(" Printing maximum value : " + max1);
//		System.out.println(" Printing second maximum value :" + max2);
		
		
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7};
//		int max1 = 0;
//		int max2 = 0;
//		
//		if(arr[0] > max1)
//		{
//			max1 = arr[0];
//			max2 = arr[1];
//		}
//		
//		else 
//		{
//			max1 = arr[1];
//			max2 = arr[0];
//		}
//		
//		for(int i = 2; i <= arr.length-1; i++)
//		{
//			if(arr[i] > max1)
//			{
//				max2 = max1;
//				max1 = arr[i];
//			}
//			else if(arr[i] > max2)
//			{
//				max2 = arr[i];
//			}
//		}
//		
//		System.out.println(" Printing maximum value : " + max1);
//		System.out.println(" Printing second maximum value :" + max2);	
		
		
		
//		int arr[] = { 1, 2 ,3 ,4 ,5 , 7};
//		int max1 = 0;
//		int max2 = 0;
//		
//		if(arr[0] > max1)
//		{
//			max1 = arr[0];
//			max2 = arr[1];
//		}
//		
//		else
//		{
//			max1 = arr[1];
//			max2 = arr[0];
//		}
//		
//		for(int i = 2; i <= arr.length-1; i++)
//		{
//			if(arr[i] > max1)
//			{
//				max2 = max1;
//				max1 = arr[i];
//			}
//			
//			else if(arr[i] > max2)
//			{
//				max2 = arr[i];
//			}
//		}
//		
//		System.out.println("Printing second maximum value in an array is : "+ max2);
//		System.out.println("Printing maximum value : " + max1);
		
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int max1 = 0;
		int max2 = 0;
		
		if(arr[0] > max1)
		{
			max1 = arr[0];
			max2 = arr[1];
		}
		else
		{
			max1 = arr[1];
			max2 = arr[0];
		}
		
		for(int i = 2; i < arr.length; i++)
		{
			if(arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2)
			{
				max2 = arr[i];
			}
		}
		System.out.println("Printing maximumValue is :" + max1);
		System.out.println("Printing secondMaximumValues is :" + max2);		
	}

}
