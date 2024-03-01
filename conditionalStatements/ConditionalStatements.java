package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		String result;
		String round1;
		String round2;
		String interview;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your result");
		result = scanner.nextLine();
		if(result.equals("pass")) {
			System.out.println("You are selected for the round 1");
			System.out.println("Please enter your result");
			round1 = scanner.nextLine();
			if(round1.equals("pass")) {
				System.out.println("You are selected for the round 2");
				System.out.println("Please enter your result");
				round2 = scanner.nextLine();
				if(round2.equals("pass")) {
					System.out.println("You are selected for the interview");
					System.out.println("Please enter your result");
					interview = scanner.nextLine();
					if(interview.equals("pass")) {
						System.out.print("You cracked the interview");
					}else {
						System.out.print("Disqualified");
					}
				}else {
					System.out.print("Disqualified");
				}
			}else {
				System.out.print("Disqualified");
			}
		}else {
			System.out.print("Disqualified");
		}
		scanner.close();
	}

}
