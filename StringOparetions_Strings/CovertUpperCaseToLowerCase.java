package StringOparetions_Strings;

public class CovertUpperCaseToLowerCase 
{
	public static void main(String[] args)
	{
		// To convert "aBcD" into "AbCd", you need to swap the case of each character:
		
		String str = "aBcD";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    
		    if (Character.isUpperCase(ch)) {
		        result += Character.toLowerCase(ch);
		    } else {
		        result += Character.toUpperCase(ch);
		    }
		}

		System.out.println(result);
		
	}

}
