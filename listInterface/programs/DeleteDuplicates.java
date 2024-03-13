package listInterface.programs;

import java.util.Stack;
//delete the duplicates from the list
public class DeleteDuplicates {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.add(4);
		s1.add(1);
		s1.add(9);
		s1.add(4);
		s1.add(8);
		s1.add(0);
		s1.add(5);
		s1.add(1);
		s1.add(8);
		s1.add(6);
		for(int i=0;i<s1.size();i++) {
			Integer number = s1.get(i);
			for(int j=i+1;j<s1.size();j++) {
				if(number.equals(s1.get(j))) {
					s1.remove(j);
                    j--;
					
				}
			}
		}
	System.out.println(s1);
}
}
