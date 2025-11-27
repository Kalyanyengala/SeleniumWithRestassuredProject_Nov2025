package StringOparetions_Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepetedCharacters_String {

	public static void main(String[] args) 
	{
//		String str = "welcome to selenium";
//		System.out.println("Printing non repeted characters :" );
//		
//		for(int i = 0; i < str.length(); i++)
//		{
//			
//			boolean repeted = true;
//			
//			for(int j = 0; j < str.length(); j++)
//			{				
//				if(i != j && str.charAt(i) == str.charAt(j))
//				{
//					repeted = false;
//				}
//			}
//			
//			if(repeted)
//				System.out.print(str.charAt(i) + "  ");
//		}
		
		// APproach 1
		
//		String str = "welcome to selenium";
//		boolean repeted = false;
//		
//		System.out.println("Printing non repeted characters :");
//		for(int i = 0; i < str.length(); i++)
//		{
//			repeted = true;
//			
//			for(int j = 0; j < str.length(); j++)
//			{
//				if(i != j && str.charAt(i) == str.charAt(j))
//				{
//					repeted = false;
//				}
//			}
//			
//			if(repeted)
//				System.out.print(str.charAt(i) + " ");
//		}
//		
//		System.out.println();
//		
//		// Approach 2
//		
//		Map<Character , Integer> map = new LinkedHashMap<>();
//		
//		for(char ch : str.toCharArray())
//		{
//			if(map.containsKey(ch))
//			{
//				map.put(ch, map.get(ch) + 1);
//			}
//			else
//				map.put(ch, 1);
//		}
//		System.out.print("Printing non repeted characters :");
//		
//		for(Map.Entry<Character,Integer> entry : map.entrySet())
//		{
//			if(entry.getValue() == 1)
//			{
//				System.out.print(entry.getKey() + "  ");
//			}
//		}
		
		String str = "welcome to selenium";
		boolean repeted;
		System.out.println("Printing non repeted characters :");
		
		for(int i = 0; i < str.length(); i++)
		{
			repeted = true;
			
			for(int j = 0; j < str.length(); j++)
			{
				if(i != j && str.charAt(i) == str.charAt(j))
					repeted = false;
			}
			
			if(repeted)
				System.out.print(str.charAt(i) +" ");			
		}
		System.out.println();
		
		Map<Character , Integer> map = new LinkedHashMap<>();
		System.out.println("Printing non repeted characters :" );
		
		for(char ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch) + 1);
			}
			else
				map.put(ch, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
			    System.out.print(entry.getKey()+" ");
			}
		}	
	}
}
