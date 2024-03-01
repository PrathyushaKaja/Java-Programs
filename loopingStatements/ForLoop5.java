package loopingStatements;

public class ForLoop5 {
//Sum of the even numbers between 40 to 80
	public static void main(String[] args) {
		int i;
		int sum=0;
		for(i=40;i<=80;) {
			if(i%2==0) {
				sum+=i;
				
				
			}
			i++;
			
		}
		System.out.println("Sum of even numbers between 40 to 80: " + sum);
	}

}
