package BasicPrograms_Java;

public class RemoveSpecialCharecters_String
{
	public static void main(String[] args)
	{
		String name = "!@#$%^&* (         Kalyan  )*&^";
		
//		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
//		System.out.println(name.replaceAll("[^a-zA-Z0-9]" , ""));
		
		//System.out.println(name.replaceAll("\\s", ""));
		
		
		System.out.println(name.replaceAll("[^a-zA-Z1-9]", ""));
		
		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
