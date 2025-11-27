package BasicPrograms_Java;

public class SumOfDigits_Number 
{
	public static void main(String[] args) 
	{
//		int number = 12345;
//		int sum = 0;
//		
//		while(number > 0)
//		{
//			sum = sum + number % 10;
//			number = number / 10;
//		}
//		System.out.println("Sum of digits in given number is :" + sum);
		
		
//		int number = 123456;
//		int sum = 0;
//		
//		while(number > 0)
//		{
//			sum = sum + number % 10;
//			number = number / 10;
//		}
//		System.out.println("Sum of digits in given number is :" + sum);
		
//		int number = 12345;
//		int sum = 0;
//		
//		while(number > 0)
//		{
//			sum = sum + number % 10;
//			number = number / 10;
//		}
//		System.out.println(sum);	
		
		int number = 12345;
		int sum = 0;
		
		while(number != 0)
		{
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println(sum);	
	}

}
