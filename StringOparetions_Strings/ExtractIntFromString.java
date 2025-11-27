package StringOparetions_Strings;

public class ExtractIntFromString 
{
	public static void main(String[] args)
	{
//		String str = "Project started 2020 and completed 2025";    // OutPut = 2020 2025
//		String number = "";
//		
//		for(char ch : str.toCharArray())
//		{
//			if(Character.isDigit(ch))
//			{
//				number = number + ch;
//			}
//			
//			else if(!number.isEmpty())
//			{
//				System.out.println(number);
//				number = "";
//			}
//		}
//		
//		if(!number.isEmpty())
//		{
//			System.out.println(number);
//		}
		
		
//		String str = "Project started 2020 and completed 2025"; 
//		String number = "";
//		
//		for(char ch : str.toCharArray())
//		{
//			if(Character.isDigit(ch))
//			{
//				number = number + ch;
//			}
//			
//			else if(!number.isEmpty())
//			{
//				System.out.println(number);
//				number = "";
//			}
//		}
//		
//		if(!number.isEmpty())
//			System.out.println(number);		
		
		
		String str = "started year 2024 and ended year 2025";
		String number = "";
		
		for(char ch :str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				number = number + ch;
			}			
			else if(!number.isEmpty())
			{
				System.out.println(number);
				number = "";
			}
		}
		
		if(!number.isEmpty())
		{
			System.out.println(number);
		}
  }

}
