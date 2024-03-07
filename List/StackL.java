package collections.List;

import java.util.Stack;

public class StackL {
/*
 * Stack is introduced in java 1.0 version.
 * It extends the vector class
 * It implements the list interface
 * Stack contains all the vector methods and 
 * It has additional methods also that represents LIFO principle
 * Push, Pop, Search, and Peek methods
 * We can't mention the size of the elements like vector and arrayList
 * Like vector it's default size and initial size is: 10
 */
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(45);
		s.push(33);
		s.push(78);
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(45));//It verifies from top to bottom 
		System.out.println(s.empty());
		s.clear();
		System.out.println(s.empty());
	}

}
