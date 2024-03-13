package listInterface.programs;

import java.util.LinkedList;

public class DeleteElementsOfList1FromList2 {
//Delete the elements of list1 from list2
	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(4);
		ll1.add(9);
		ll1.add(8);
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.add(4);
		ll2.add(1);
		ll2.add(9);
		ll2.add(4);
		ll2.add(8);
		ll2.add(0);
		ll2.add(5);
		ll2.add(1);
		ll2.add(8);
		ll2.add(6);
		for(int i=0;i<ll1.size();i++) {
			Integer element =ll1.get(i);
//			for(int j=0;j<ll2.size();j++) {
//				Integer element1 =ll2.get(j);
//				if(element==element1) {
//					ll2.remove(ll2.get(j));
//				}
//			}
			while (ll2.contains(element)) {
                ll2.remove(element);
            }
		}
		System.out.println(ll2);
	}

}
