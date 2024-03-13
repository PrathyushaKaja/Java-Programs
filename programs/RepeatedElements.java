package listInterface.programs;

import java.util.*;

public class RepeatedElements {
	// print the repeated/duplicate elements along with its duplication count
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

		ArrayList<String> countedElements = new ArrayList<>();

		System.out.println("Duplicate Elements and their counts:");
		for(int i=0;i<al.size();i++) {
			String duplicates = al.get(i);
			if(!countedElements.contains(duplicates)) {
				int count =1;
				for(int j=i+1;j<al.size();j++) {
					if(duplicates.equals(al.get(j))) {
						count++;
					}

				}
				if (count > 1) {
					System.out.println(duplicates + " - " + count + " times");
				}
				countedElements.add(duplicates);
			}
		}


	}
}
