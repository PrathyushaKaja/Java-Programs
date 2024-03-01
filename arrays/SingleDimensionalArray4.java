package arrays;

public class SingleDimensionalArray4 {
//Find the max number from an array and print it along with its index
	public static void main(String[] args) {
		int[] a= {2,5,1,9,6};
		
		//System.out.println(a.length);
		int largest=0;int index=0;
		for(int i=0;i<=a.length-1;) {//If we are using = operator then we have to give -1 otherwise no need to give
			if(a[i]>largest) {//2>0,5>2,100>5,120>100,60>120
				largest=a[i];//2,5,100,120,break
				index=i;
			}
			i++;
		}
		System.out.print("Largest number is: "+largest);
		System.out.print('-');
		System.out.println(index);
	}

}
