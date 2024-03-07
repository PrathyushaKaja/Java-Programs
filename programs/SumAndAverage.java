package listInterface.programs;

import java.util.ArrayList;

public class SumAndAverage {
//print the sum and average of the elements present in the list
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
		int average=0;
		for(int i=0;i<al.size();i++) {
			sum+=al.get(i);
			average=sum/al.size();
		}
		System.out.println("sum is:"+sum);
		System.out.println("average is:"+average);
	}

}
