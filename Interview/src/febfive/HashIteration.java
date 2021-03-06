package febfive;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashIteration {
	 
	public static void main(String[] args) {
 
		HashMap<String, String> userCountryMap = new HashMap<>();
		
		// Putting key-values pairs in HashMap
		userCountryMap.put("Anchit","India");
		userCountryMap.put("Andy", "USA");
		userCountryMap.put("Roy", "Germary");
		userCountryMap.put("Mary","France");
		
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap with foreach and lambda:");
		userCountryMap.forEach((user,country) -> { 
			System.out.println(user+" --> "+country);
			} 
		);
		
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap using keyset() with foreach loop:");
		for(String user:userCountryMap.keySet())
		{
			System.out.println(user+" --> "+userCountryMap.get(user));
		}
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap's keyset() with foreach and lambda:");
		userCountryMap.keySet().forEach((user) -> { 
			System.out.println(user+" --> "+userCountryMap.get(user));
			} 
		);
		
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap's entrySet with iterator");
		Iterator<Entry<String, String>> iterator = userCountryMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry<String, String> next = iterator.next();
			System.out.println(next.getKey()+" --> "+next.getValue());
		}
		
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap's entrySet with foreach and lambda");
		userCountryMap.entrySet().forEach((entry) -> { 
			System.out.println(entry.getKey()+" --> "+entry.getValue());
			} 
		);
		
		System.out.println("=========================================================");
		System.out.println("Iterating over HashMap's entrySet with foreach loop");
		for(Map.Entry<String, String> entry:userCountryMap.entrySet())
		{
			System.out.println(entry.getKey()+" --> "+entry.getValue());
		}
		
	}
}
