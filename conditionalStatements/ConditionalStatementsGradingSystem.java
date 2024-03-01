package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsGradingSystem {

	public static void main(String[] args) {
		//<35 = fail
		// ==35 = pass
		// 35-70 = third class
		// 70-85 = second class
		// >85 = first class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your marks");
		int i = scanner.nextInt();
		if(i==35) {
			System.out.println("pass");	
		}else if(i>35 && i<=70) {
			System.out.println("third class");
		}else if(i>70 && i<=85) {
			System.out.println("second class");
		}
		else if(i>85) {
			System.out.println("first class");
		}
		else {
			System.out.println("fail");
		}
		scanner.close();
	}

}
