package strings;

import java.util.Scanner;

//to reverse a string
public class Program4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string:");
		String a = scanner.nextLine();
		String reversedWord="";
		for (int i = 0; i < a.length(); i++) {
			  reversedWord = a.charAt(i) + reversedWord;
			}
		System.out.println(reversedWord);
		scanner.close();
	}

}
