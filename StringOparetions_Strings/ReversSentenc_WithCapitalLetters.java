package StringOparetions_Strings;

public class ReversSentenc_WithCapitalLetters 
{
	public static void main(String[] args) 
	{
//		String str = "welcome to the java programe";  // OutPut : Program Java The To Welcome 
//        String st[] = str.split(" ");
//        String reversWord = "";
//
//        
//        for (int i = st.length - 1; i >= 0; i--) {
//            String word = st[i];
//          
//            word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
//
//            reversWord = reversWord + word + " ";
//        }
//
//        System.out.println(reversWord.trim());
		
//		String str = "welcome to java";          // -------> Dont give spaces 
//		String strArray[] = str.split(" ");
//		String revWord = "";
//		
//		for(int i = strArray.length-1; i >= 0; i--)
//		{
//			String word = strArray[i];
//			word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
//			
//			revWord = revWord + word + "  ";
//		}
//		
//		System.out.println(revWord.trim());
//        
		
		
		String str = "welcome to java";
		String strArray[] = str.split(" ");
		String revWord = "";
		
		for(int i = strArray.length-1; i >= 0; i--)
		{
			String word = strArray[i];
			word = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			revWord = revWord + word + " ";
		}
		System.out.println(revWord);
		
		
		
		
		
		
		
		
        
    }
		
}

