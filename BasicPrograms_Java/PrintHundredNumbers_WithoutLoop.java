package BasicPrograms_Java;

public class PrintHundredNumbers_WithoutLoop 
{
	public static void main(String[] args) 
	{
//		printNumbers(1 , 100);	
//		printNumber(1 , 100);
		
		for(int i = 1; i <= 100; i++)       // with loop 
			System.out.println(i);
	}
	
	static void printNumbers(int number, int maxNumber)
	{
		if(number > maxNumber)
		{ 
			return;	
		}
		else
			System.out.println(number);
			printNumbers(number + 1 , maxNumber);
	}
	
	static void printNumber(int number , int maximumNumber)
	{
		if(number > maximumNumber)
			return;
		else
			System.out.println(number);
		printNumber(number + 1, maximumNumber);
	}
}
