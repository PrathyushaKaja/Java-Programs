package arrays;

public class SingleDimensionalArray2 {
//print the average of the integers in an integer array
	public static void main(String[] args) {
		int[] j = {2,5,3,9,6};
		int average=0;
		int sum=0;
		for(int i=0;i<=j.length-1;) {
			sum+=j[i];
			i++;

			//			int length = j.length;

			average=sum/j.length;
		}
		System.out.println("average is:" +average);
	}

}
