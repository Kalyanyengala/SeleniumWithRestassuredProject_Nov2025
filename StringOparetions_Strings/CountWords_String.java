package StringOparetions_Strings;

public class CountWords_String 
{
	public static void main(String[] args) 
	{
//		String str = " kalyan ";
//		int count = 1;
//		
//		for(int i = 0; i < str.length()-1; i++)
//		{
//			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println("Count of character is :" + count);
//		
		
//		String str = " kalyan ";
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//		    if (str.charAt(i) != ' ') {
//		        count++;
//		    }
//		}
//
//		System.out.println("Character count (excluding spaces): " + count);

		
//		String str = "  Kalyan Yengala ";
//		int count = 0;
//		
//		for(int i = 0; i < str.length(); i++)
//		{
//			if(str.charAt(i) != ' ')
//			{
//				count++;
//			}
//		}
//		System.out.println("Character Count is :" + count);
		
		String str = "  Kalyan Yengala ";
		int count = 0;
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
