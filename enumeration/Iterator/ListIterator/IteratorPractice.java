package enumeration.Iterator.ListIterator;

import java.util.*;

public class IteratorPractice {
/*
 * Iterator is an interface
 * Introduced for iterating all the collection objects
 * Legacy classes – v1.0  + New classes – v1.2
 * One direction, read-only with special permission for removing the existing elements
 * Two main methods --> hasNext, next
 * And we cannot access the map collection because it is not belongs to the collection ..
 * interface only it's part of collections framework ..
 * directly but we can access through the keysSet, ..
 * values and entrySet. 
 */
	public static void main(String[] args) {
		//List 
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(49);
		al.add(456);
		al.add(24);
		al.add(14);
		System.out.println(al);
		Iterator<Integer> i1 = al.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			i1.remove();
		}
		System.out.println(al);
		
		System.out.println();
		//Map 
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(4,"a");
		m1.put(49,"b");
		m1.put(456,"c");
		m1.put(24,"d");
		m1.put(14,"e");
		Iterator<Integer> i2 = m1.keySet().iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
			i2.remove();
		}
		System.out.println(m1);
	}

}
