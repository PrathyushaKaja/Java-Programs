package conditionalStatements;

import java.util.Scanner;

public class SwitchArithOper {
//Arith operations
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = scanner.nextInt();
		System.out.println("Enter b value: ");
		int b = scanner.nextInt();
		System.out.println("Enter an operator: ");
		scanner.nextLine();
		String operator = scanner.nextLine();
		switch(operator) {
		case "+":
			System.out.printf("Result is: %s",a+b);
			break;
		case "-":
			System.out.printf("Result is: %s",a-b);
			break;
		case "*":
			System.out.printf("Result is: %s",a*b);
			break;
		case "/":
			System.out.printf("Result is: %s",a-b);
			break;
		case "%":
			System.out.printf("Result is: %s",a%b);
			break;
		default:
			System.err.println("No data");
		}
		scanner.close();
	}
}
