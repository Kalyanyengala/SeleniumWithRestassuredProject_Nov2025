package BasicPrograms_Java;

public class Palindrome_String 
{
	public static void main(String[] args) 
	{
//		String name = "madam";
//		String original_Name = name;
//		String rev_Name = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			rev_Name = rev_Name + name.charAt(i);
//		}
//		
//		if(original_Name.equals(rev_Name))
//		{
//			System.out.println("Given string is PalindromeString :" + rev_Name);
//		}
//		else
//		{
//			System.out.println("Given string is not a PalindromeString :" + rev_Name);
//		}
		
//		String name = "madam ";
//		String original_Name = name;
//		String rev_Name = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			rev_Name = rev_Name + name.charAt(i);
//		}
//		
//		if(original_Name.equals(rev_Name))
//		{
//			System.out.println("Given string is PalindromeString :" + rev_Name);
//		}
//		else
//		{
//			System.out.println("Given string is not PalindromeString :" + rev_Name);
//		}
//		
//		String name = "madam";
//		String originalName = name;
//		String reversName = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			reversName = reversName + name.charAt(i);
//		}
//		
//		if(originalName.equals(reversName))
//		{
//			System.out.println("Given names are palindrome");
//		}
//		else
//			System.out.println("Given names are not a palindrome ");
//		
		
		
//		String name = "madam";
//		String originalName = name;
//		String reversName = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			reversName = reversName + name.charAt(i);
//		}
//		
//		if(originalName.equals(reversName))
//			System.out.println("Given srtrings are palindrome strings");
//		else
//			System.out.println("given strings are not a palindrome strings");
		
		String str = "madam";
		String originalString = str;
		String revString = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			revString = revString + str.charAt(i);
		}
		if(originalString.equals(revString))
			System.out.println("Given string is palindromeString :" + originalString);
		else
			System.out.println("Given string is not a palindromeString");		
	}

}
