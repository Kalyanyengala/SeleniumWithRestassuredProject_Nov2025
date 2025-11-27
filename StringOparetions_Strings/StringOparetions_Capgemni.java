package StringOparetions_Strings;

public class StringOparetions_Capgemni
{
	public static void main(String[] args) 
	{
		String s = "abc123|uuu|294774ggg|yyy736";

		String[] parts = s.split("\\|");

		
		String second = parts[1].replaceAll("[^A-Za-z]", ""); 
		
		String last = parts[parts.length - 1].replaceAll("[^A-Za-z]", "");  

		System.out.println(second); // uuu
		System.out.println(last);   // yyy
		
		// Output : uuu yyy 
		
		
	}

}
