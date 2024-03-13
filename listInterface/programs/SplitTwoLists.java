package listInterface.programs;

import java.util.*;

public class SplitTwoLists {

	public static void main(String[] args) {
		List<Integer> originalList = new ArrayList<>();
		List<Integer> v2 = new ArrayList<>();
		List<Integer> v3 = new ArrayList<>();
		originalList.add(4);
		originalList.add(9);
		originalList.add(8);
		originalList.add(5);
		originalList.add(0);
		originalList.add(10);
		int halfSize = originalList.size()/2;
		for(int i=0;i<originalList.size();i++) {
			if(i<halfSize) {
				v2.add(originalList.get(i));
			}else {
				v3.add(originalList.get(i));
			}
		}
		System.out.println(v2);
		System.out.println(v3);
	}

}
