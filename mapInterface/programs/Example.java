package mapInterface.programs;

import java.util.*;

//Map is the combination of key-value pairs
public class Example {

	public static void main(String[] args) {
		//We can use Hashtable, treemap, linkedhashmap, and hashmap
		Map<Integer, String> m1 = new LinkedHashMap<>();//MAP creation
		m1.put(101, "Strawberry");//Addition of elements into the map
		m1.put(102,"chocolate");
		m1.put(103, "blueberry");
		System.out.println(m1);
		System.out.println(m1.size());//Map size
		Set<Integer> keys = m1.keySet();//Retrieval of keys from the map
		for (Integer key : keys) {
			System.out.println(key);
		}
		Collection<String> values = m1.values();//Retrieval of values from the map
		for (String value : values) {
			System.out.println(value);
		}
//		System.out.println(m1);
//		m1.remove(101);//Deletion of elements from the map
//		System.out.println(m1);
		System.out.println(m1.get(102));//retrieval of value from the map based on the key
//		m1.remove(102, "chocolate");
//		System.out.println(m1);
		System.out.println(m1.containsKey(101));// verification of keys 
		System.out.println(m1.containsKey(105));
		System.out.println(m1.containsValue("chocolate"));//verification of values
		m1.putIfAbsent(104, "Red velvet");//Kind of insertion
		System.out.println(m1);
		m1.putIfAbsent(103, "blueberry");//duplicate 
		System.out.println(m1);
		m1.put(101, "raspberry");//updation of elements from the map
		System.out.println(m1);
	}

}
