package BasicPrograms_Java;

public class EvenCount_OddCount_Number 
{
	public static void main(String[] args)
	{
//		int number = 1234567;
//		int evenCount = 0;
//		int oddCount = 0;
//		
//		while(number > 0)
//		{
//			int reminder = number % 10;	
//			
//			if(reminder % 2 == 0)
//			{
//				evenCount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//			
//			number = number / 10;			
//		}
//		
//		System.out.println("Total number of evenNumbers are : "+ evenCount);
//		System.out.println("Total number of oddNumbers are : "+ oddCount);
		
		
//		int number = 1234567;
//		int evenCount = 0;
//		int oddCount = 0;
//		
//		
//		while(number > 0)
//		{
//			int reminder = number % 10;
//			
//			if(reminder % 2 == 0)
//			{
//				evenCount++;
//			}
//				
//			else
//			{
//				oddCount++;
//			}
//			
//			number = number / 10;
//		}
//		
//		System.out.println("Total number of evenNumbers are : "+ evenCount);
//		System.out.println("Total number of oddNumbers are : "+ oddCount);
		
//		int number = 1234567;
//		int evenCount = 0;
//		int oddCount = 0;
//		int reminder = 0;
//		
//		while(number > 0)
//		{
//			reminder = number % 10;
//			
//			if(reminder % 2 == 0)
//			{
//				evenCount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//			
//			number = number / 10;
//		}
//		
//		System.out.println("Total number of evenNumbers are : "+ evenCount);
//		System.out.println("Total number of oddNumbers are : "+ oddCount);
		
//		int number = 12345;
//		int evenCount = 0;
//		int oddCount = 0;
//		
//		while(number > 0)
//		{
//			int reminder = number % 10;
//			
//			if(reminder % 2 == 0)
//			{
//				evenCount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//			
//			number = number / 10;
//		}
//		
//		System.out.println("EvenNumbers :" + evenCount);
//		System.out.println("OddNumbers :" + oddCount);
		
//		int number = 12345;
//		int evenCount = 0;
//		int oddCount = 0;
//		
//		while(number > 0)
//		{
//			int reminder = number % 10;
//			
//			if(reminder % 2 == 0)
//			{
//				evenCount++;
//			}
//			else
//			{
//				oddCount++;
//			}
//			
//			number = number / 10;
//		}		
//		
//		System.out.println("EvenNumbers :" + evenCount);
//		System.out.println("OddNumbers :" + oddCount);
		
		
//		int number = 1234567;
//		int evenCount = 0;
//		int oddCount = 0;
//		int reminder = 0;
//		
//		while(number != 0)
//		{
//			reminder = number % 10;
//			
//			if(reminder % 2 == 0)
//			{
//				 System.out.print("Even: " + reminder + "\n");
//				evenCount++;
//			}
//			else
//			{
//				System.out.print("Odd: " + reminder + "\n");
//				oddCount++;
//			    number = number / 10;
//			}
//		}
//		System.out.println("Printing evenCount in number :" + evenCount);
//		System.out.println("Printing oddCount in number :" + oddCount);	
//		
//		int number;
//		while(number != 0) {
//		    int remainder = number % 10;
//		    if(remainder % 2 == 0) {
//		        System.out.print("Even: " + remainder + "\n");
//		        int evenCount;
//				evenCount++;
//		    } else {
//		        System.out.print("Odd: " + remainder + "\n");
//		        int oddCount;
//				oddCount++;
//		    }
//		    number = number / 10;
//		}
		
		int number = 1234567;    // This logic will prints even and odd numbers not total numbers 
		int evenCount = 0;
		int oddCount = 0;
		int reminder = 0;
		
		while(number != 0)
		{
			reminder = number % 10;
			
			if(reminder % 2 == 0)
			{
				 System.out.print("Even: " + reminder + "\n");
				evenCount++;
			}
			else
			{
				System.out.print("Odd: " + reminder + "\n");
				oddCount++;			    
			}
			number = number / 10;
		}
		System.out.println("Printing evenCount in number :" + evenCount);
		System.out.println("Printing oddCount in number :" + oddCount);	
	}

}
