package StringOparetions_Strings;

public class DuplicateCharacters_String 
{
	public static void main(String[] args)
	{
		//String str = " Welcome to java programming ";
//		int count = 0;
//		char[] string = str.toCharArray();
//		
//		for(int i = 0; i <= string.length-1; i++)
//		{
//			count = 1;
//			
//			for(int j = i + 1; j <= string.length-1; j++)
//			{
//				if(string[i] == string[j] && string[i] != ' ' && string[j] != '0')
//				{
//					count++;
//					string[j] = '0';
//				}
//			}
//			
//			if(count > 1 && string[i] != '0')
//			{
//				System.out.print(string[i] + " ");
//			}
//		}
		
//		String str = " Welcome to java programming ";
//		int count = 0;
//		char[] string = str.toCharArray();
//		
//		for(int i = 0; i <= string.length-1; i++)
//		{
//			count = 1;
//			
//			for(int j = i + 1; j <= string.length-1; j++)
//			{
//				if(string[i] == string[j] && string[i] != ' ' && string[j] != '0')
//				{
//					count++;
//					string[j] = '0';
//				}
//			}
//			
//			if(count > 1 && string[i] != '0')
//			{
//				System.out.print(string[i] + " ");
//			}
//		}
		
//		String str = " Welcome to java programming ";
//		char[] string = str.toCharArray();
//		int count = 0;
//		
//		for(int i = 0; i <= string.length-1; i++)
//		{
//			count = 1; 
//			
//			for(int j = i + 1; j <= string.length-1; j++)
//			{
//				if(string[i] == string[j] && string[i] != ' ' && string[j] != '0')
//				{
//					count++;
//					string[j] = '0';
//				}
//			}
//			
//			if(count > 1 && string[i] != '0')
//			{
//				System.out.print(string[i] + " ");
//				
//			}
//			
//		}	
		
		String str = " Welcome to java programming ";
		int count = 0;
		char ch[] = str.toCharArray();
		System.out.println("Duplicate characters are founded : ");
		
		for(int i = 0; i <= ch.length-1; i++)
		{
			count = 1;
			
			for(int j = i + 1; j <= ch.length-1; j++)
			{
				if(ch[i] == ch[j] && ch[i] !=' ' && ch[j] != '0')
				{
					count++;
					ch[j] = '0';
				}
			}
			
			if(count > 1 && ch[i] != '0')
			{
				System.out.print(ch[i] + " ");
			}
		}		
		
		
	}

}
