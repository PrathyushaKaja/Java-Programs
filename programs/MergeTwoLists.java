package listInterface.programs;

import java.util.ArrayList;

public class MergeTwoLists {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(9);
		l1.add(8);
		System.out.println("l1 is:" +l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(0);
		l2.add(10);
		System.out.println("l2 is:" +l2);
		ArrayList<Integer> MergeList = new ArrayList<>();
		System.out.println("Merge list is:"+MergeList);
//		l1.addAll(l2);
//		System.out.println(l1);
		for(int i=0;i<l1.size();i++) {
			MergeList.add(l1.get(i));
		}
		for(int i=0;i<l2.size();i++) {
			MergeList.add(l2.get(i));
		}
		System.out.println(MergeList);
	}

}
