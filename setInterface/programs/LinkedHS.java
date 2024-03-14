package setInterface.programs;

import java.util.*;

public class LinkedHS {
//LinkedHashSet is internally using the LinkedHashMap implementation
//It will follow any insertion oder 
//It will not follow sorting order 
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(34);//addition
		lhs.add(90);
		lhs.add(3);
		lhs.add(9);
		lhs.add(78);
		System.out.println(lhs.remove(78));//deletion
		for(Integer a:lhs){//retrieval
			System.out.println(a);
		}
		System.out.println(lhs.contains(34));//verification
		System.out.println(lhs);
	}

}
