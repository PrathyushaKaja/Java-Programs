package strings;

import java.util.Scanner;

public class Program2 {
//to count number of words in a string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = scanner.nextLine();
		System.out.println(s1.split("\\s").length);
		scanner.close();
	}

}
