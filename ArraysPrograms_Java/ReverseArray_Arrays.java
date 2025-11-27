package ArraysPrograms_Java;

import java.util.Arrays;

public class ReverseArray_Arrays 
{
	public static void main(String[] args)
	{
//		int originalArray[] = { 1, 2, 3, 4, 5 };
//		
//		System.out.println(Arrays.toString(originalArray));
//		
//		int reversedArray[] = new int[originalArray.length];
//		
//		for(int i = 0 , j = originalArray.length-1; i < originalArray.length; i++ , j--)
//		{
//			reversedArray[j] = originalArray[i];
//		}
//		
//		System.out.println("Original Array is printing :" + Arrays.toString(originalArray));
//		System.out.println("Reversed Array is printing :" + Arrays.toString(reversedArray));
		
//		int originalArr[] = { 1, 2, 3, 4, 5, 6, 7 };
//		int reversArr[] = new int[originalArr.length];
//		
//		for(int i = 0, j = originalArr.length-1; i < originalArr.length; i++ , j--)
//		{
//			reversArr[j] = originalArr[i];
//		}
//		
//		System.out.println("Original Array is printing :" + Arrays.toString(originalArr));
//		System.out.println("Reversed Array is printing :" + Arrays.toString(reversArr));
		
//		int originalArray[] = new int[5];
//		originalArray[0] = 2;
//		originalArray[1] = 4;
//		originalArray[2] = 5;
//		originalArray[3] = 6;
//		originalArray[4] = 7;
//		
//		
//		System.out.println("Before Reversing Array : " + Arrays.toString(originalArray));
//		
//		int revArray[] = new int[originalArray.length];
//		
//		for(int i = 0 , j = originalArray.length-1; i < originalArray.length; i++ , j-- )
//		{
//			revArray[j] = originalArray[i];
//		}
// 		
//		//System.out.println("After Reversing Array : " + Arrays.toString(originalArray));
//		System.out.println("After Reversing Array : " + Arrays.toString(revArray));	
		
//		int originalArray[] = new int[5];
//		originalArray[0] = 2;
//		originalArray[1] = 4;
//		originalArray[2] = 5;
//		originalArray[3] = 6;
//		originalArray[4] = 7;
//		
//		System.out.println("Before Reversing Array : " + Arrays.toString(originalArray));
//		int revArr[] = new int[originalArray.length];
//		
//		for(int i = 0, j = originalArray.length-1; i < originalArray.length; i++ , j--)
//		{
//			revArr[j] = originalArray[i];
//		}
//		System.out.println("After Reversing Array : " + Arrays.toString(revArr));	
		
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8};
//		System.out.println("Before Reversing Array : " + Arrays.toString(arr));
//		
//		int revArr[] = new int[arr.length];
//		
//		for(int i = 0, j = arr.length-1; i < arr.length; i++, j--)
//		{
//			revArr[j] = arr[i];
//		}
//		
//		System.out.println("After Reversing Array : " + Arrays.toString(revArr));	
		
		
//		int originalArray[] = { 1, 2, 3, 4, 5, 6 };
//		int tempArray[] = new int[originalArray.length];
//		System.out.println("Printing array before reversing : "+ Arrays.toString(originalArray));
//		
//		for(int i = 0, j = originalArray.length-1; i < originalArray.length; i++ , j--)
//		{
//			tempArray[j] = originalArray[i]; 
//		}
//		
//		System.out.println("Printing array after reversing : "+ Arrays.toString(tempArray));
		
		int originalArray[] = { 1, 2, 3, 4, 5, 6 };
		int tempArray[] = new int[originalArray.length];
		System.out.println("Printing array before reversing :" + Arrays.toString(originalArray));
 		
		for(int i = 0, j = originalArray.length-1; i < originalArray.length; i++, j--)
		{
			tempArray[j] = originalArray[i];
		}
		
		System.out.println("Printing array before reversing :" + Arrays.toString(tempArray));
	}

}
