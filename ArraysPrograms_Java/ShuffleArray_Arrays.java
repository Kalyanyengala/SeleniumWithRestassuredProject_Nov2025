package ArraysPrograms_Java;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray_Arrays 
{
	public static void main(String[] args) 
	{
//		int array[] = { 1, 2, 3, 4, 5 };
//		
//		Random rand = new Random();
//		
//		for(int i = 0; i <= array.length-1; i++)
//		{
//			int randNext = rand.nextInt(array.length);
//			int temp = array[randNext];
//			array[randNext] = array[i];
//			array[i] = temp;
//		}
//		
//		System.out.println(Arrays.toString(array));
		
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//		Random rand = new Random();
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			int randNext = rand.nextInt(arr.length);
//			int temp = arr[randNext];
//			arr[randNext] = arr[i];
//			arr[i] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		Random rand = new Random();
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			int nextRand = rand.nextInt(arr.length);
//			int temp = arr[nextRand];
//			arr[nextRand] = arr[i];
//			arr[i] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
//		int arr[] = { 1, 2, 3, 4, 5 };
//		Random rand = new Random();
//		System.out.println("Before suffelled array : " + Arrays.toString(arr));
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			int randNext = rand.nextInt(arr.length);
//			int temp = arr[randNext];
//			arr[randNext] = arr[i];
//			arr[i] = temp;
//		}
//		System.out.println("After suffelled array : " + Arrays.toString(arr));
		
		
		int arr[] = { 1, 2, 3, 4, 5 };
		Random randObject = new Random();
		int temp = 0;
		System.out.println("Printing array before shuffle :" + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++)
		{
			int randomVarible = randObject.nextInt(arr.length);
			temp = arr[randomVarible];
			arr[randomVarible] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Printing array after shuffle :" + Arrays.toString(arr));		
	}

}
