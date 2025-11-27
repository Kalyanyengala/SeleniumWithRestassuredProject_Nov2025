package ArraysPrograms_Java;

public class MissingNumber_Array 
{
	public static void main(String[] args) 
	{
//		int arr[] = { 1, 2, 3, 5 };
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			sum1 = sum1 + arr[i];
//		}
//		
//		System.out.println(sum1);
//		
//		for(int i = 1; i <= 5; i++)
//		{
//			sum2 = sum2 + i;
//		}
//		
//		System.out.println(sum2);
//		
//		int result = (sum2 - sum1);
//		
//		System.out.println("Missing number in an array is :" + result);
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9};
//		int sum1 = 0;
//		int sum2 = 0;
//		int result = 0;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			sum1 = sum1 + arr[i];
//		}
//		
//		for(int i = 1; i <= 9; i++)
//		{
//			sum2 = sum2 + i;
//		}
//		
//		result = sum2 - sum1;
//		
//		System.out.println("Missing number in an array is :" + result);
		
		
//		int arr[] = { 1, 2, 3, 4, 6};
//		int sum1 = 0;
//		int sum2 = 0;
//		int result;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			sum1 = sum1 + arr[i];
//		}
//		
//		for(int i = 1; i <= 6; i++)
//		{
//			sum2 = sum2 + i;
//		}
//		
//		result = sum2 - sum1;
//		
//		System.out.println("Missing number in an array is :" + result);
		
//		int arr[] = { 1, 2, 3, 4, 6, 7, 8};
//		int sum1 = 0;
//		int sum2 = 0;
//		int result = 0;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			sum1 = sum1 + arr[i];
//		}
//		
//		for(int i = 1; i <= 8; i++)
//		{
//			sum2 = sum2 + i;
//		}
//		
//		result = sum2 - sum1;
//		System.out.println("Missing number in an array is :" + result);
		
		int arr[] = { 1, 2, 3, 5 };
		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum1 = sum1 + arr[i];
		}
		
		for(int i = 1; i <= 5; i++)
		{
			sum2 = sum2 + i;
		}
		
		result = sum2 - sum1;
		System.out.println("Missing number in an array is :" + result);
		
	}

}
