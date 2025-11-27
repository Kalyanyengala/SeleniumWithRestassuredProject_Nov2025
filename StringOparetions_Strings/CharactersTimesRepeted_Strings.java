package StringOparetions_Strings;

import java.util.HashMap;
import java.util.Map;

public class CharactersTimesRepeted_Strings 
{
	public static void main(String[] args) 
	{
//		String str = " welcome to automation testing ";
//		char[] arr = str.toCharArray();
//		Map<Character, Integer> map = new HashMap<>();
//		
//		for(char ar : arr)
//		{
//			if(ar != ' ')
//			{
//				if(map.containsKey(ar))
//				{
//					map.put(ar, map.get(ar) + 1);
//				}
//				else
//				{
//					map.put(ar, 1);
//				}
//			}
//			
//		}
//		
//		System.out.println(map);
		
		
//		String str = " welcome to automation testing ";
//		char[] arr = str.toCharArray();
//		Map<Character , Integer> map = new HashMap<>();
//		
//		for(char ch : arr)
//		{
//			if(ch != ' ')
//			{
//				if(map.containsKey(ch))
//				{
//					map.put(ch, map.get(ch) + 1);
//				}
//				else
//					map.put(ch, 1);
//			}
//		}
//		System.out.println(map);
		
//		String str = " welcome to automation testing ";
//		char[] arr = str.toCharArray();
//		Map<Character, Integer> map = new HashMap<>();
//		
//		for(char ch : arr)
//		{
//			if(ch != ' ')
//			{
//				if(map.containsKey(ch))
//					map.put(ch, map.get(ch) + 1);
//				else
//					map.put(ch, 1);				
//			}
//		}
//		System.out.println(map);	
		
//		String str = "welcome to the java world";
//		char arr[] = str.toCharArray();
//		Map<Character, Integer> map = new HashMap<>();
//		
//		for(char ar : arr)
//		{
//			if(ar != ' ')
//			{
//				if(map.containsKey(ar))
//				{
//					map.put(ar, map.get(ar)+1);
//				}
//				else
//				{
//					map.put(ar, 1);
//				}
//			}
//			
//		}
//		
//		System.out.println(map);
		
		
		String str = "welcome to the java world";
		char chh[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : chh )
		{
			if(ch != ' ')
			{
				if(map.containsKey(ch))
				{
					map.put(ch, map.get(ch) + 1);
					
				}
				else
				{
					map.put(ch , 1);
				}
			}
		}
		System.out.println(map);		
		
	}

}
