package listInterface.programs;

import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(8);
		ll1.add(0);
		ll1.add(5);
		ll1.add(1);
		ll1.add(6);
		System.out.println(ll1);
		LinkedList<Integer> ll2 = new LinkedList<>();
		for (int i = ll1.size() - 1; i >= 0; i--) {
            int a = ll1.get(i);
            ll2.add(a);
        }
		System.out.println(ll2);
	}
}
