package ArraysPrograms_Java;

public class CheckSumOfArrayReturnTrue_Arrays
{
	public static void main(String[] args) 
	{
		// QA : Check if the sum of any two elements in the array equals 7, and if yes → return true.
		
//		int arr[] = { 1, 2, 3, 4, 5 };
//		int sum = 7;
//		
//		boolean status = checkPairSome(arr, sum);
//		System.out.println(status);
//		
//		int arr[] = { 1, 2, 3, 4, 5 };
//		int sum = 7;
//		
//		boolean status = checkPairSome(arr, sum);
//		System.out.println(status);
		
//		int arr[] = { 1 , 2 , 3 , 4 , 5};
//		int varible = 7;
//		
//		boolean status = checkPairSomeValue(arr , varible);
//		System.out.println("Printing status :" + status);
//		
//		if(status)
//			System.out.println("Sum of values are matching :" + varible);
//		else
//			System.out.println("Sum of values are not matching");
		
		int arr[] = { 1, 2, 3, 4, 5 };
		int varible = 7;
		
		boolean status = checkPairSomeValue(arr , varible);
		System.out.println("Printing status : " + status);
		
		if(status)
			System.out.println("Sum of given values are equal");
		else
			System.out.println("Sum of given values are not equal");
		
	}
	
//	public static boolean checkPairSome(int arr[] , int sum)
//	{	
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] + arr[j] == sum)
//				{
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}
//

//	public static boolean checkPairSome(int arr[] , int sum)
//	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] + arr[j] == sum)
//				{
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}
	
	
//	public static boolean checkPairSomeValue(int arr[] , int varible)
//	{
//		for(int i = 0; i < arr.length; i++)
//		{
//			for(int j = i + 1; j < arr.length; j++)
//			{
//				if(arr[i] + arr[j] == varible)
//				{
//					return true;					
//				}
//			}
//		}
//		
//		return false;
//	}
	
	public static boolean checkPairSomeValue(int arr[], int varible)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == varible)
				return true;
			}
		}
		
		return false;
	}	
}