package collections.List;

import java.util.ArrayList;

public class ArrayL{
	public static void main(String[] args) {
		ArrayList<String> all = new ArrayList<>();
		all.add("Apple");
		all.add("Pineapple");
		all.add("Banana");
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i)+ " ");
		}
		all.remove(2);
		System.out.println(all);
		all.set(0, "Strawberry");
		System.out.println(all);
		System.out.println(all.get(1));
		System.out.println(all.contains("Strawberry"));
	}
}
