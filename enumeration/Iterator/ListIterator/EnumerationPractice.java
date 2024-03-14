package enumeration.Iterator.ListIterator;

import java.util.*;

public class EnumerationPractice {
/*
 * Enumeration is an interface
 * Introduced for iterating the legacy collection objects 
 * Legacy classes – version 1.0 – HashTable, Stack, Vector, Dictionary and Properties
 * New classes – version 1.2
 * Enumeration is also a legacy interface
 * Two main methods --> hasMoreElements, nextElement
 * We cannot perform further operations other than accessing the elements
 */
	public static void main(String[] args) {
		Hashtable<String, Integer> h1 = new Hashtable<>();
		h1.put("India",500);
		h1.put("America",600);
		h1.put("London",700);
		h1.put("Canada",800);
		System.out.println(h1);
		Enumeration<Integer> e = h1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println();
		
		Stack<Integer> s1 = new Stack<>();
		s1.add(4);
		s1.add(49);
		s1.add(456);
		s1.add(24);
		s1.add(14);
		System.out.println(s1);
		Enumeration<Integer> e1 = s1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
	}

}
