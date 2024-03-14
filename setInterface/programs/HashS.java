package setInterface.programs;

import java.util.*;

public class HashS {
//HashSet is internally using the hashMap implementation
//Set is all about to store the unique values and avoid duplicates 
//It will not follow any insertion/ sorting order 
//In hashmap, it stores key-value pairs where keys are unique 
//In hashSet, it stores only the values and java considered it as keys 
// But for values it creates one dummy object and for every key it contains that object as a value
//Updation concept is not there in set collection
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		//Addition of elements into the set
		hs.add(89);
		hs.add(6);
		hs.add(167);
		hs.add(9);
		hs.add(55);
		hs.add(6);//It ignores this value
		/*
		 * Retrieval of elements into the set
		 * To retrieve the set we have to use for loop or iterator
		 */
		for (Integer a : hs) {
			System.out.println(a);
		}
		/*
		 * Deletion of elements from the set
		 * we should only mention the value not index
		 */
		System.out.println(hs.remove(1));//return false because '1' value is not there in the set
		System.out.println(hs.remove(55));//returns true
		 //verification of the elements in the set
		System.out.println(hs.contains(9));//returns true
		
		System.out.println(hs);
	}

}
