package arrays;

public class SingleDimensionalArray1 {
//Print the sum of the integers in an integer array
	public static void main(String[] args) {
		int[] j = {2,5,2,3,4};
		int sum =0;
		System.out.println(j.length);
		for(int i=0;i<=j.length-1;) {
			sum+=j[i];
			i++;
		}
		System.out.println("sum is:"+sum);
	}

}
