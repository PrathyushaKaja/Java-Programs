package arrays;

public class SingleDimensionalArray3 {
//Merge two arrays and print the output in the console
	public static void main(String[] args) {
		/*
		 * String[] a = {"chai","coffee"}; String[] b = {"milk","water","coke"}; int
		 * totalLength = a.length+b.length; String[] mergedArray = new
		 * String[totalLength]; for(int i=0;i<a.length;i++) {
		 * 
		 * mergedArray[i]=a[i];
		 * 
		 * 
		 * } for(int j=0;j<b.length;j++) { mergedArray[a.length+j]=b[j]; }
		 * System.out.print("["); for (int k = 0; k < totalLength; k++) { if (k > 0) {
		 * System.out.print(", "); } System.out.print("\""+ mergedArray[k] +"\""); }
		 * System.out.println("]");
		 */
		String a[] = {"chai","coffee","watermelon","apple"};
		String b[] = {"milk","water","coke","juicy"};
		System.out.print("[");
		for(int i=0;i<a.length;) {
			System.out.print("\""+ a[i] +"\"");
			i++;
			if(i>0) {
				System.out.print(',');
			}
		}
		
		for(int j=0;j<b.length;) {
			if(j>0) {
				System.out.print(',');
			}
			System.out.print("\""+ b[j] +"\"");
			j++;
		}
		System.out.print("]");
	}

}
