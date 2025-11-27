package BasicPrograms_Java;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		// Approach 1
		
		//String name = "kalyan";
//		String revrse_Name = "";
//		
//		for(int i = name.length()-1; i >= 0; i --)
//		{
//			revrse_Name = revrse_Name + name.charAt(i);
//			
//		}
//		System.out.println(revrse_Name);
		
		// Approach 2 
		
//		String name = "kalyan";
//		
//		StringBuilder builder = new StringBuilder(name);
//		System.out.println(builder.reverse());
		
		// Approach 3
		
//		String name = "kalyan";
//		
//		StringBuffer buffer = new StringBuffer(name);
//		System.out.println(buffer.reverse());
		
		
		// Example 
		
//		String name = "kalyan";
//		String revers = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			revers += name.charAt(i);
//		}
//		System.out.println(revers);	
		
		// Approach 4
		
//		String name = "Kalyan";
//		String revers_Name = "";
//		char arr[] = name.toCharArray();
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			revers_Name = revers_Name + arr[i];
//		}
//		System.out.println(revers_Name);
		
		
//		String name = "kalyan";
//		String reversName = "";
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			reversName = reversName + name.charAt(i);
//		}
//		System.out.println(reversName);
		
//		String name = "kalyan";
//		String reversName = "";
//		char arr[] = name.toCharArray();
//		
//		for(int i = name.length()-1; i >= 0; i--)
//		{
//			reversName = reversName + arr[i];
//		}
//		
//		System.out.println(reversName);
//		
//		StringBuilder builder = new StringBuilder(name);
//		System.out.println(builder.reverse());
//		
//		StringBuffer buffer = new StringBuffer(name);
//		System.out.println(buffer.reverse());
		
		String str = "kalyan";
		String revString = "";
		char arr[] = str.toCharArray();
		
		System.out.println("Printing string before reversing :" + str);
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			revString = revString + str.charAt(i);
		}
		System.out.println("Printing reversed String :" + revString);
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Printing reversedString :" + sb.reverse());
		
		StringBuffer sbf = new StringBuffer(str);
		System.out.println("Printing reversedString :" + sbf.reverse());
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			revString = revString + arr[i];
		}
		System.out.println("Printing reversed String :" + revString);		
	}

}
