package ArraysPrograms_Java;

public class SearchableElement_LinearSearch_Arrays 
{
	public static void main(String[] args)
	{
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//		int serchableElement = 7;
//		boolean status = false;
//		
//		for(int i = 0; i <= arr.length-1; i++)
//		{
//			if(arr[i] == serchableElement)
//			{
//				System.out.println("serchableElement is founded :" + serchableElement);
//				status = true;
//				break;
//			}
//		}
//		if(!status)
//			System.out.println("serchableElement is not founded");
		
		int arr[] = { 1, 3, 4, 5, 6, 7, 8 };
		int serchableElemenet = 5;
		boolean status = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == serchableElemenet)
			{
				System.out.println("serchableElemenet is founded :" + arr[i]);
				status = true;
				break;				
			}
		}
		
		if(!status)
			System.out.println("serchableElemenet is not founded");
		
	}

}
