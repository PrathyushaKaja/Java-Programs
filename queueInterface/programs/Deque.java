package queueInterface.programs;

import java.util.*;

public class Deque {
/*Deque extends the queue interface meanwhile linkedlist and array deque implements the deque interface
 * Addition --> add,offer,offerFirst,offerLast,addFirst,addLast,addAll
 * Retrieval --> peek,peekFirst,peekLast
 * Deletion --> remove,removeFirst,removeLast,poll,pollFirst,pollLast
 * Both insertion and deletion can be performed from head and tail
 * And these methods also contains in LinkedList  
*/
	
	public static void main(String[] args) {
		ArrayDeque<Integer> q1 = new ArrayDeque<>();
		q1.offer(101);
		q1.offer(89);
		q1.add(66);
		q1.offer(900);
		System.out.println(q1);
		q1.offerFirst(77);
		q1.offerLast(7);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.peekFirst());
		System.out.println(q1.peekLast());
		System.out.println(q1.removeLast());
		System.out.println(q1);
		System.out.println(q1.removeFirst());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
	}

}
