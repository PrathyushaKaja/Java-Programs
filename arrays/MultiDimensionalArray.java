package arrays;

public class MultiDimensionalArray {
//print the sum of the elements of a multi-dimensional array
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		a[0]= new int[]{1,2,3};
		a[1]= new int[]{4,5,6};
		a[2]=new int[]{7,8,9};
		for(int i=0;i<a.length;i++) {
			int[] arr1 = a[i];
			
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[j]+" ");
			}
			System.out.println();
		}
	}

}
