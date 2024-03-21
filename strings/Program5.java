package strings;

import java.util.Scanner;

public class Program5 {
//to remove all starting and ending spaces from a string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string:");
		String a = scanner.nextLine();
		System.out.println(a.trim());
		scanner.close();
	}

}
