package ArraysPrograms_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FetchingDataByHelpOfMap_Arrays 
{
	public static void main(String[] args) 
	{
//		HashMap<String , String> map = new HashMap<>();
//		map.put("Kalyan","Kalyan@gmail.com");
//		map.put("Renu", "Renu@gmail.com");
//		map.put("Pavan", "Pavan@gmail.com");
		
//		System.out.println(map.get("Kalyan"));
//		
//		Iterator<String> it = map.keySet().iterator();
//		//System.out.println(it.next());
//		
//		while(it.hasNext())
//		{
//			String key = it.next();
//			String value = map.get(key);
//			
//			System.out.println(key + " " + value);
//		}
		
		
//		Iterator<String> it = map.keySet().iterator();
//		
//		while(it.hasNext())
//		{
//			String key = it.next();
//			String value = map.get(key);
//			
//			System.out.println(key + " " + value);
//		}
//		
//		
//		Iterator<String> it = map.keySet().iterator();
//		
//		while(it.hasNext())
//		{
//			String key = it.next();
//			String value = map.get(key);
//			
//			System.out.println(key + " " + value);
//		}
		
		// Approach 2
		
//		Iterator<Entry<String, String>>  it = map.entrySet().iterator();
//		
//		while(it.hasNext())
//		{
//			Entry<String , String> entry = it.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
//		Iterator<Entry<String , String>> it =  map.entrySet().iterator();
//		
//		while(it.hasNext())
//		{
//			Entry<String , String> entry = it.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
//		Iterator<Entry<String , String>> it = map.entrySet().iterator();
//		while(it.hasNext())
//		{
//			Entry<String , String> entry = it.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		// Approach 3
		
//		List<Map.Entry<String, String>> list = new ArrayList(map.entrySet());
//		for(int i = 0; i < list.size(); i++)
//		{
//			Map.Entry<String , String> entry = list.get(i);
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//		
//		List<Map.Entry<String, String>> entry = new ArrayList<>(map.entrySet());
//		
//		for(int i = 0; i <= entry.size()-1; i++)
//		{
//			Map.Entry<String, String> l = entry.get(i);
//			System.out.println(l.getKey() + " " + l.getValue());
//		}
		
//		List<Map.Entry<String , String>> list = new ArrayList<>(map.entrySet());
//		
//		for(int i = 0; i <= list.size()-1; i++)
//		{
//		Map.Entry<String, String> entry = list.get(i);
//		System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
//		List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
//		
//		for(int i = 0; i <= list.size()-1; i++)
//		{
//			Map.Entry<String,String> entry = list.get(i);
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		// Approach 4

//		for(Map.Entry<String, String> entry : map.entrySet())
//		{
//			System.out.println(entry.getKey() + "" + entry.getValue());
//		}		
		
		
//		Map<String , String> map = new HashMap<>();
//		map.put("Kalyan", "733727");
//		map.put("Pavan", "98576");
//		map.put("Renu", "6759890");
//		map.put("Anjan", "84973838");
		
//		System.out.println(map.get("Kalyan"));
//		System.out.println(map.get("Pavan"));
//		System.out.println(map.get("Renu"));
//		System.out.println(map.get("Anjan"));
//		
//		System.out.println(map.keySet());
//		System.out.println(map.entrySet());
		
//		for(Map.Entry<String, Integer> entry : map.entrySet())
//		{
//			System.out.println("Keys : ---> " + entry.getKey() + " Values :----> "  + entry.getValue());
//		}
		
//		for(Map.Entry<String, Integer> entry :map.entrySet())
//		{
//			System.out.println("Keys : ---> " + entry.getKey() + " Values :----> "  + entry.getValue());
//		}
		
//		Iterator<String> it = map.keySet().iterator();
//		
//		while(it.hasNext())
//		{
//			String keys = it.next();
//			String values = map.get(keys);
//			
//			System.out.println("Keys : ---> " +  keys + "   " +"Values : ---> " + values );
//			System.out.println();
//		}
		
//		Iterator<String> it = map.keySet().iterator();
//		
//		while(it.hasNext())
//		{
//			String keys = it.next();
//			String values = map.get(keys);
//			System.out.println("Keys : ---> " +  keys + "   " +"Values : ---> " + values );
//			System.out.println();
//		}
		
//		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//		
//		while(it.hasNext())
//		{
//			Entry<String, String> entry = it.next();
//			System.out.println("Printing keys :--->" + entry.getKey()+ "  " + "Printing values :-->" + entry.getValue());
//			System.out.println();			
//		}
		
//		List<Map.Entry<String , String>> list = new ArrayList<>(map.entrySet());
//		
//		for(int i = 0; i <= list.size()-1; i++)
//		{
//			Map.Entry<String,String> entry = list.get(i);
//			System.out.println("Printing keys :--->" + entry.getKey()+ "  " + "Printing values :-->" + entry.getValue());
//		}
		
//		List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
//		
//		for(int i = 0; i <= list.size()-1; i++)
//		{
//			Map.Entry<String,String> entry = list.get(i);
//			System.out.println("Printing keys :--->" + entry.getKey()+ "  " + "Printing values :-->" + entry.getValue());
//		}		
		
		
//		Map<String , String> mapObject = new HashMap<>();
//		
//		mapObject.put("name", "Kalyan");
//		mapObject.put("job", "Automation Test Engineer");
//		mapObject.put("company", "Ahana Systems & Solutions PvtLtd");
//		mapObject.put("employeID", "9857");
//		
//		System.out.println(mapObject);		
//		System.out.println("Printing only keys :" + mapObject.keySet());
//		System.out.println("Printing both keys and values :" + mapObject.entrySet());
//		
//		for(Map.Entry<String , String> entry :mapObject.entrySet())
//		{
//			String keys = entry.getKey();
//			String values = entry.getValue();
//			
//			System.out.print(keys + " : " + values + " ; ");
//		}
//		
//		System.out.println();
//		
//		System.out.println("Printing from list....");
//				
//		List<Map.Entry<String, String>> listobject = new ArrayList<>(mapObject.entrySet());
//		
//		for(int i = 0; i < listobject.size(); i++)
//		{
//			Map.Entry<String, String> entry = listobject.get(i);
//			String keys = entry.getKey();
//			String values = entry.getValue();
//			
//			System.out.print(keys + " : " + values + " ; ");
//		}
//		System.out.println();
//		
//		System.out.println("Printing from iterator keyset.....");
//		Iterator<String> it = mapObject.keySet().iterator();
//		
//		while(it.hasNext())
//		{
//			String keys  = it.next();
//			String values = mapObject.get(keys);
//			
//			System.out.print(keys + " : "  + values + " ; ");
//		}
//		
//        System.out.println();
//		
//		System.out.println("Printing from iterator entryset.....");
//		Iterator<Map.Entry<String,String>> itr = mapObject.entrySet().iterator();
//		
//		while(itr.hasNext())
//		{
//			Map.Entry<String , String> entry = itr.next();
//			String keys = entry.getKey();
//			String values = entry.getValue();
//			 
//			System.out.print(keys+" : "+values+" ; " );
//		}		
		
        Map<String , String> mapObject = new HashMap<>();
		
		mapObject.put("name", "Kalyan");
		mapObject.put("job", "Automation Test Engineer");
		mapObject.put("company", "Ahana Systems & Solutions PvtLtd");
		mapObject.put("employeID", "9857");
		
		System.out.println(mapObject);		
		System.out.println("Printing only keys :" + mapObject.keySet());
		System.out.println("Printing both keys and values :" + mapObject.entrySet());
		
		System.out.println("Printing from foreach loop .....");
		
		for(Map.Entry<String, String> entry :mapObject.entrySet())
		{
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.print(key+" : "+value+" ; " );
		}
		System.out.println();
		
		System.out.println("Printing from foreach loop .....");
		
		List<Map.Entry<String, String>> listObject = new ArrayList<>(mapObject.entrySet());
		
		for(int i = 0; i < listObject.size(); i++)
		{
		  Map.Entry<String, String> entry =	listObject.get(i);
		  
		  String key = entry.getKey();
		  String value = entry.getValue();
		  
		  System.out.print(key+" : "+value+" ; " );		  
		}
		
        System.out.println();
		
		System.out.println("Printing from iterator keyset .....");
		
		Iterator<String> it = mapObject.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = mapObject.get(key);
			
			System.out.print(key+" : "+value+" ; " );	
		}
		
		System.out.println();
			
		System.out.println("Printing from iterator entryset .....");
		
		Iterator<Map.Entry<String, String>> itr = mapObject.entrySet().iterator();
		
		while(itr.hasNext())
		{
		    Map.Entry<String,String> entry = itr.next();
		    String key = entry.getKey();
		    String value = entry.getValue();
		    
		    System.out.print(key+" : "+value+" ; " );	
		}	
	}
	
}
