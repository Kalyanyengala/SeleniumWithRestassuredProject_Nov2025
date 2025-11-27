package BasicPrograms_Java;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
//		int number = 12321;
//		int original_Number = number;
//		int rev_Number = 0;
//		
//		while(number > 0)
//		{
//			rev_Number = rev_Number * 10 + number % 10;
//			number = number / 10;					
//		}
//		
//		if(original_Number == rev_Number) 
//		{
//			System.out.println("Given number is PalindromeNumber: " + rev_Number);
//		}
//		else
//			System.out.println("Given number is not a PalindromeNumber : " + rev_Number);		
	
	// Example 1
		
//		int number = 12321;
//		int original_Number = number;
//		int rev_Number = 0;
//		
//		while(number > 0)
//		{
//			rev_Number = rev_Number * 10 + number % 10;
//			number = number / 10;
//		}
//		
//		if(original_Number == rev_Number)
//		{
//			System.out.println("Given number is PalindromeNumber :" + rev_Number);
//		}
//		else
//		{
//			System.out.println("Given number is not a PalindromeNumber :" + rev_Number);
//		}
		
//		int number = 1234321;
//		int originalNumber = number;
//		int reversNumber = 0;
//		
//		while( number > 0)
//		{
//			reversNumber = reversNumber * 10 + number % 10;
//			number = number / 10;
//		}
//		
//		if(originalNumber == reversNumber)
//		{
//			System.out.println("Given number is palindromeNumber :" + originalNumber);
//		}
//		
//		else
//			System.out.println("Given number is not a palindromeNumber :" + originalNumber);
		
		
		int number = 1234321;
		int originalNumber = number;
		int revnumber = 0;
		
		while(number != 0)
		{
			revnumber = revnumber * 10 + number % 10;
			number = number / 10;
		}
		
		if(originalNumber == revnumber)
			System.out.println("Given number is palindromeNumber :" + originalNumber);
		else
			System.out.println("Given number is not palindromeNumber");
		
		
		
		
		
		
		
	}

}
