package listInterface.programs;

import java.util.ArrayList;

public class SumEvenNumbers {
//Print the sum of the even numbers in a list
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(10);
		System.out.println(al);
		int sum =0;
		for(int i=0;i<al.size();) {
			if(al.get(i)%2==0) {
				//System.out.println(al.get(i));
				sum+=al.get(i);
			}
			i++;
		}
		System.out.println("sum is "+sum);
	}

}
