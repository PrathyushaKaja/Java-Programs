package arrays;

public class SingleDimensionalArray5 {
//Find the min length word  from an array and print it along with its index
	public static void main(String[] args) {
		String[] a= {"coffee","water","chai","diet coke"};
		int minLength =0;
		int index=0;
		String variable="";
		int k=0;
		for(int i=0;i<a.length;i++) {
			index=a[i].length();//length() is used to find "coffee" length -> which is 6
			if(minLength<index) {
				variable=a[i];
				minLength=index;
				k= i;
			}
			
		}
		System.out.println(variable);
		System.out.println(k);
		}
}
