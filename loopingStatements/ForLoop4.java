package loopingStatements;

public class ForLoop4 {
//Print the prime numbers between 50 to 150
	public static void main(String[] args) {
		
        int i;
		int j;
		int count;
		System.out.println("Prime numbers between 1 to 50:");
		for(i=50;i<=150;) {
			j=2;
			count=0;
			while(j<i) {
				if(i%j==0) {
					count++;
					break;
				}
				j++;
			}
			if(count==0) {
				System.out.println(i + " ");
			}
			i++;
		}
	}


}

