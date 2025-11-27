package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class NonRepetedCharacters_String_Coforge {

	public static void main(String[] args) 
	{
		// Approach 1
		
		String str = "helloh";
		System.out.println("Printing non repeted characters :" );
		
		for(int i = 0; i < str.length(); i++)
		{
			
			boolean repeted = true;
			
			for(int j = 0; j < str.length(); j++)
			{				
				if(i != j && str.charAt(i) == str.charAt(j))
				{
					repeted = false;
				}
			}
			
			if(repeted)
				System.out.print(str.charAt(i) + "  ");
		}
		
		System.out.println();
		
		// Approach 2
		
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.print("Printing non repeted characters :" );
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
		
		
	}

}
