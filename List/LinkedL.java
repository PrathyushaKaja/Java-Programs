package collections.List;

import java.util.*;

public class LinkedL {
/*
 * Linked list implements two interfaces one is List and second is dequeue 
 * And dequeue extends queue 
 * So Linked list is indirectly implementing queue
 * Linked list is based on the objects 
 * object is nothing but node
 * Combination of multiple nodes is called LinkedList
 * That node contains three informations i.e., Previous, data, and next
 */
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("arr1");
		a1.add("arr2");
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("black");
		ll1.add("white");
		ll1.add(0, "gold");
		ll1.addAll(1,a1);//we can even add the other collection 
		ll1.set(0, "brown");//Updation
		System.out.println(ll1.get(0));//retrieval
		System.out.println(ll1.containsAll(a1));//verification
		ll1.remove(0);//element deletion
		System.out.println(ll1);
	}

}
