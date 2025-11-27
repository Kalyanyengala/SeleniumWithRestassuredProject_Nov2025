package StringOparetions_Strings;

public class CharecterOccurence_String 
{
	public static void main(String[] args) 
	{
//		String example = "Welcome to the world";
//		
//		int firstCount = example.length();
//		int secondCount = example.replaceAll("o", "").length();
//		
//		int finalCount = firstCount - secondCount;
//		System.out.println("Occurences of O character is :" + finalCount);
		
//		String name = "Welcome to the java world";
		
//		int firstCount = name.length();
//		int secondCount = name.replaceAll("o", "").length();
//		
//		int finalCount = firstCount - secondCount;
//		
//		System.out.println("Number of charecter occurences of O is :" + finalCount);
		
		String str = "Welcome to the java world";
		int firstCount = str.length();
		int secondCount = str.replaceAll("e", "").length();
		int finalCount = firstCount - secondCount;
		System.out.println(finalCount);
		
	}

}
