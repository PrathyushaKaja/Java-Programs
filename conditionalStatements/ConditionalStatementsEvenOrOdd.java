package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsEvenOrOdd {
//Even or odd
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int i = scanner.nextInt();
		if(i%2 ==0) {
			System.out.print("Given number is even number");
		}else {
			System.out.print("Given number is odd number");
		}
		scanner.close();
	}
}
