package BasicPrograms_Java;

public class LargestNumber 
{
	public static void main(String[] args)
	{
//		int a = 100; 
//		int b = 200;
//		int c = 300;
//		
//		// Approach 1
//		
//		if(a > b && a > c)
//		{
//			System.out.println("Given A is greatest");
//		}
//		else if(b > a && b > c)
//		{
//			System.out.println("Given B is greatest");
//		}
//		else
//			System.out.println("Given C is greatest");
//		
//		// Approach 2
//		
//		int largest = a > b ? a : b;
//		largest = c > largest ? c : largest;
//		
//		System.out.println("Printing largest number :" + largest);
//		
//		// Approach 3 
//		
//		int larg = c > (a > b ? a : b) ? c : (a > b ? a : b);
//		System.out.println("Printing largest number :" + larg);
//		
//		// Example 
//		
//		int Large = a > b ? a : b;
//		Large = c > Large ? c : Large;
//		
//		System.out.println(Large);
//		
//		int Largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
//		System.out.println(Largest);
		
//		int a = 100;
//		int b = 200;
//		int c = 300;
//		
//		if(a > b && a > c)
//		{
//			System.out.println("A is largest number");
//		}
//		if(b > a && b > c)
//		{
//			System.out.println("B is largest number");
//		}
//		
//		else
//		{
//			System.out.println("C is largest number");
//		}
//		
//		int largest = a > b ? a : b;
//		largest = c > largest ? c : largest;
//		System.out.println(largest);
//		
//		int lar = c > (a > b ? a : b) ? c : (a > b ? a : b);
//		System.out.println(lar);
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		if(a > b & a > c)
			System.out.println("A is largest");
		if(b > a & b > c)
			System.out.println("B is largest");
		else
			System.out.println("C is largest");
		
		
		// Approach 2
		int largest = c > (a > b ? a : b ) ? c : (a > b ? a : b);
		System.out.println(largest);				
	}

}
