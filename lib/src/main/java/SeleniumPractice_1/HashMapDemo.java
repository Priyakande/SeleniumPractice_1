package SeleniumPractice_1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String> ();
		hm.put(1, "Priya");
		hm.put(2, "Puja");
		hm.put(3, "Snehal");
		hm.put(4, "Komal");
		
		hm.putIfAbsent(1, "Nano"); //adds a key-value pair to HashMap if given key isn not already there.

		//putAll() Copy every key-value pair from one HashMap to another
		HashMap<Integer, String> hm2 = new HashMap<Integer,String> ();
		hm2.put(1, "Rani");
		hm2.putAll(hm);
		
		for(Map.Entry m:hm2.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}	
	}

}
