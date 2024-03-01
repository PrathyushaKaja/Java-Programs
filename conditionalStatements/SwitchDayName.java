package conditionalStatements;

import java.util.Scanner;

public class SwitchDayName {
//Mon-Fri --> it's a weekday
//Sat, Sun --> it's a weekend
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any day");
		String day = scanner.nextLine();
		switch(day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("it's a weekday");
			break;
		case "saturday":
		case "sunday":
			System.out.println("it's a weekend");
			break;
		default:
			System.out.println("wrong data");
			break;
		}
		scanner.close();
		}
}
