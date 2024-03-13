package listInterface.programs;

import java.util.Vector;

public class ElementPosition {
//print the position of an element in the list
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		v1.add(1);
		v1.add(8);
		v1.add(0);
		v1.add(5);
		v1.add(1);
		v1.add(6);
		for(int i=0;i<v1.size();i++) {
			Integer data = v1.get(i);
			Integer number =0;
			if(data.equals(number)) {
				System.out.println(v1.indexOf(i));
			}
		}
	}

}
