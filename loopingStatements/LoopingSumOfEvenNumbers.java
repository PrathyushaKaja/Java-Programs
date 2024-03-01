package loopingStatements;

public class LoopingSumOfEvenNumbers {
//sum of even numbers between 40 to 80
	public static void main(String[] args) {
		int i=40;
		int sum=0;
		while(i<=80) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
        System.out.println("Sum of even numbers between 40 to 80: " + sum);

	}

}
