package StringOparetions_Strings;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayList_String_Strings 
{
	public static void main(String[] args)
	{
//		ArrayList<String>list = new ArrayList<>();
//		list.add("kalyan");
//		list.add("Pavan");
//		System.out.println(list.get(0));
//		
//		String[] str = new String[list.size()];
//		
//		for(int i = 0; i < list.size(); i++)
//		{
//			str[i] = list.get(i);
//		}
//		
//		for(String arr : str)
//		{
//			System.out.println(arr);
//		}
		
//		ArrayList<String> list = new ArrayList<>();	
//		list.add("Naveen");
//		list.add("praveen");
//		list.add("aveen");
//		list.add("Nav");
//		
//		String[] str = new String[list.size()];
//		
//		for(int i = 0; i < list.size(); i++)
//		{
//			str[i] = list.get(i);
//		}
//		
//		for(String arr : str)
//		{
//			System.out.println("Printing data :" + arr);
//		}		
		
//		ArrayList<String> list = new ArrayList<>();	
//		list.add("Naveen");
//		list.add("praveen");
//		
//		String[] str = new String[list.size()];
//		
//		for(int i = 0; i < list.size(); i++)
//		{
//			str[i] = list.get(i);
//		}
//		
//		for(String arr : str)
//			System.out.println(arr);	
		
		List<String> list = new ArrayList<>();
		list.add("Naveen");
		list.add("praveen");
		
		String str[] = new String[list.size()];
		
		for(int i = 0; i <= list.size()-1; i++)
		{
			str[i] = list.get(i);
		}
		
		for(String st : str)
		{
			System.out.println(st);
		}
		
	}

}
