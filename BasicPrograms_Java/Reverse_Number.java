package BasicPrograms_Java;

public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		// Approach 1
		
//		int number = 12345;
//		int reversed_Number = 0;
//		
//		while(number > 0)
//		{
//			reversed_Number = reversed_Number * 10 + number % 10;
//			number = number / 10;			
//					
//		}
//		
//		System.out.println("Reversed Number is : "+ reversed_Number);
		
		// Approach 2
		
//		int number = 12345;
		
//		StringBuilder builder = new StringBuilder(String.valueOf(number));		
//		System.out.println("Using Builder Class :" + builder.reverse());
		
		// Approach 3
		
//		int number = 12345;
//		
//		StringBuffer buffer = new StringBuffer(String.valueOf(number));
//		System.out.println(buffer.reverse());
		
		// Example 1
		
//		int number = 12345;
//		int revers_Number = 0;
//		
//		while(number > 0)
//		{
//			revers_Number = revers_Number * 10 + number % 10;
//			number = number / 10;
//								
//		}
//		System.out.println(revers_Number);
		
		
//		int number = 12345;
//		int revNumber = 0;
//		
//		while(number > 0)
//		{
//			revNumber = revNumber * 10 + number % 10;
//			number = number / 10;
//		}
//		System.out.println(revNumber);
		
//		StringBuilder string = new StringBuilder(String.valueOf(number));
//		System.out.println(string.reverse());
		
//		StringBuffer buffer = new StringBuffer(String.valueOf(number));
//		
//		System.out.println(buffer.reverse());
		
		int number = 12345;
		int revNumber = 0;
		
		System.out.println("Printing number before Reversing :" + number);
		while(number != 0)
		{
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Printing number after Reversed :" + revNumber);
		
		StringBuilder sb = new StringBuilder(String.valueOf(revNumber));
		System.out.println("Printing reversed number :" + sb.reverse());
		
		StringBuffer sbf = new StringBuffer(String.valueOf(revNumber));
		System.out.println("Printing reversedNumber :" + sbf.reverse());

	}
}
