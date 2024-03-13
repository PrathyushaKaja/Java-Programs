package listInterface.programs;

import java.util.ArrayList;

public class CommonElements {
	//Create a list of common elements between two lists
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(9);
		al.add(8);
		al.add(5);
		System.out.println(al);
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(1);
		al2.add(8);
		al2.add(0);
		al2.add(5);
		al2.add(1);
		al2.add(6);
		System.out.println(al2);
		ArrayList<Integer> al3 = new ArrayList<>();
		for(int i=0;i<al.size();i++) {
			Integer number = al.get(i);
			for(int j=0;j<al2.size();j++) {
				Integer number2 = al2.get(j);
				if(number.equals(number2)) {
					al3.add(number2);
				}

			}
		}
		System.out.println(al3);
	}

}
