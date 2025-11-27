package StringOparetions_Strings;

public class Owells_String 
{
	public static void main(String[] args) 
	{
//		String str = " Welcome to java ";
//		int count = 0;
//		
//		for(int i = 0; i <= str.length()-1; i++)
//		{
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u')
//			{
//				 count = count++;
//			}
//		}
//		System.out.println(count);
		
//		String str = " Welcome to java program";
//		int count = 0;
//		
//		for(int i = 0; i <= str.length()-1; i++)
//		{
//			char ch = Character.toLowerCase(str.charAt(i));
//			
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//			{
//				count++;
//			}
//		}
//		
//		System.out.println("Printing owells in given word :" + count);
		
//		String str = " Welcome to java ";
//		String owells = "";
//		
//		for(int i = 0; i <= str.length()-1; i++)
//		{
//			char ch = Character.toLowerCase(str.charAt(i));
//			
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
//			{
//				owells += ch;
//			}
//		}
//		
//		System.out.println("Printing owells in given word :" + owells.replace("", " "));	
		
		
//		String str = "welcome to java world";
//		int owells = 0;
//		
//		for(int i = 0; i <= str.length()-1; i++)
//		{
//			char ch = Character.toLowerCase(str.charAt(i));
//			
//			if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
//			{
//				System.out.print(ch + " ");
//			}
//		}
		
		String str = "welcome to the java world";
		int count =0;
		
		for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = Character.toLowerCase(str.charAt(i));
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
