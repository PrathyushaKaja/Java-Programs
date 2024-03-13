package queueInterface.programs;

import java.util.PriorityQueue;
import java.util.Queue;
/*Priority queue only implements queue interface
 * Based on priority, It follows FIFO principle
 * Default capacity is 11 and initial capacity is also 11
 * Only head will contain the high priority value and remaining values will be in zigzag order
 * Lowest number is the highest priority in PQ
 * Insertion is performed at tail meanwhile deletion is performed at head
 */
//Addition--> add, offer
//Removal--> poll,remove
//Retrieval--> peek 
public class PriorityQ {

	public static void main(String[] args) {
		/*
		 * If we want highest number will be head then we have to use comparator 
		 * comparator.reverseOrder()--> It will print according to that 
		 */
		Queue<Integer> pq = new PriorityQueue<>();
		System.out.println(pq);
		pq.offer(78);
		pq.add(10);
		pq.offer(99);
		pq.offer(66);
		System.out.println("printing the elements:"+pq);
		System.out.println();
		System.out.println("retrieval element:"+pq.peek());//retrieval
		System.out.println();
		System.out.println("deleting the element is:"+pq.poll());//deletion
		System.out.println();
		System.out.println("deleted the element:"+pq);
		pq.offer(3);
		System.out.println();
		System.out.println("added new element:"+pq);
		System.out.println();
		while(!pq.isEmpty())
			System.out.println("deleting the elements:"+pq.poll());
		System.out.println(pq);
		//System.out.println(pq.remove());//if there are no elements in the queue then it will throw exception
		
	}

}
