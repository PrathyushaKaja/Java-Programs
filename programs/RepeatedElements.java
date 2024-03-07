package listInterface.programs;

import java.util.ArrayList;

public class RepeatedElements {
//print the repeated/duplicate elements along with it's duplication count
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("baby");
		al.add("ball");
		al.add("soap");
		al.add("baby");
		al.add("shampoo");
		al.add("chalk");
		al.add("soap");
		al.add("makeup");
		al.add("baby");
		al.add("lotion");
		int flag =0;
		String duplicate;
		System.out.println(al);
		for(int i=0;i<al.size();i++) {
			duplicate=al.get(i);
			if(duplicate.contains(duplicate)) {
				System.out.println(duplicate);
			}
		}
	}

}
