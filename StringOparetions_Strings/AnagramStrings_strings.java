package StringOparetions_Strings;

import java.util.Arrays;

public class AnagramStrings_strings 
{
	public static void main(String[] args)
	{
//		String str = "brag";
//		String str1 = "grab";
//		
//		str = str.toLowerCase();
//		str1 = str1.toLowerCase();
//		
//		char[] ch = str.toCharArray();
//		char[] ch1 = str1.toCharArray();
//		
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//		
//		if(Arrays.equals(ch, ch1) == true)
//		{
//			System.out.println("Given Strings are a anagrams :" + Arrays.toString(ch));
//		}
//		else
//			System.out.println("Given strings are not anagrams");
		
//		String str = "brag";
//		String str1 = "grab";
//		
//		str = str.toLowerCase();
//		str1 = str1.toLowerCase();
//		
//		if(str.length() == str1.length())
//		{
//			char[] ch = str.toCharArray();
//			char[] ch1 = str1.toCharArray();
//			
//			Arrays.sort(ch);
//			Arrays.sort(ch1);
//			
//			if(Arrays.equals(ch, ch1) == true)
//			{
//				System.out.println("Given strings are anagrams :" + Arrays.toString(ch));
//			}
//		}
//		else
//			System.out.println("Given strings are not a anagramse");
		
		String str1 = "grab";
		String str2 = "brag";
		str1.toLowerCase();
		str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char arr1[] = str1.toCharArray();
			char arr2[] = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2) == true)
				System.out.println("Given strings are anagrams");
			else
				System.out.println("Given strings are not a anagrams");
		}
		else
			System.out.println(" Not anagrams");
		
		
		
		
	}

}
