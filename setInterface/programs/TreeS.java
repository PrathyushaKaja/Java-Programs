package setInterface.programs;

import java.util.*;

public class TreeS {
//TreeSet is internally using the TreeMap implementation
//It will not follow any insertion oder 
//It will only follow sorting order 
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(89);//addition
		ts.add(34);
		ts.add(90);
		ts.add(3);
		ts.add(9);
		ts.add(78);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		/*Virtual subset but whatever operations we are performing in subset 
		 * then those will be reflected to the actual set*/
		System.out.println(ts.subSet(1, 80).remove(78));
		System.out.println(ts);
	}

}
