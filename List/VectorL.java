package collections.List;

import java.util.Vector;

public class VectorL {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		int sum =0;
		for(int i=0;i<v.size();i++) {
			sum+=v.get(i);	
		}
		System.out.println("sum is:"+sum);
	}
}
