package StringOparetions_Strings;

public class ReverseEachWord_String 
{
	public static void main(String[] args)
	{
//		String str = "Welcome to java";
//		String arr[] = str.split(" ");
//		String reversWord = "";
//		
//		for(String ar : arr)
//		{
//			String word = "";
//			
//			for(int i = ar.length()-1; i >= 0; i--)
//			{
//				word = word + ar.charAt(i);
//			}
//			
//			reversWord = reversWord + word + " ";
//		}
//		
//		System.out.print("Reversed each character :" + reversWord.trim());
		
		
//		String str = " Welcome to java program ";
//		String arr[] = str.split(" ");
//		String reversWord = "";
//		
//		for(String ar : arr)
//		{
//			String word = "";
//			
//			for(int i = ar.length()-1; i >= 0; i--)
//			{
//				word = word + ar.charAt(i);
//			}
//			
//			reversWord = reversWord + word + " ";
//		}
//		
//		System.out.println("Reversed word is :" + reversWord.trim());	
		
		
		String str = "welcome to the java programe";
		String st[] = str.split(" ");
		String reversWord = "";
		
		for(String stt : st)
		{
			String word = "";
			
			for(int i = stt.length()-1; i >= 0; i--)
			{
				word = word + stt.charAt(i);
			}
			
			reversWord = reversWord + word + " ";
		}
		
		System.out.println(reversWord);
		
	}

}
