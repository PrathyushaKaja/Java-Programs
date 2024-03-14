package enumeration.Iterator.ListIterator;

import java.util.*;

public class ListIteratorPractice {
/*It is an interface
 * Introduced for iterating only list type of collection objects 
 * Legacy classes and New classes
 * Bi-direction , Read and write
 */
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<>();
		l1.add(4);
		l1.add(49);
		l1.add(456);
		l1.add(24);
		l1.add(14);
		System.out.println(l1);
		ListIterator<Integer> Li =l1.listIterator();
		while(Li.hasNext()) {
			System.out.println(Li.next());
		}
		System.out.println();
		while(Li.hasPrevious()) {
			System.out.println(Li.previous());
		}
		Li.add(100);
		System.out.println(l1);
	}

}
