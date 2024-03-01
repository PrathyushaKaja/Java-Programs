package conditionalStatements;

import java.util.Scanner;

public class SwitchEvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any value:");
		int i = scanner.nextInt();
		int j =i%2;
		switch(j) {
		case 0:
			System.out.println("Given number is even");
			break;
		case 1:
			System.out.println("Given number is odd");
			break;
		default:
			System.err.println("Wrong input");
		}
		scanner.close();
	}

}
