package strings;

import java.util.Scanner;

public class Program3 {
//to count the total number of occurrences of a given character in a string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string:");
		String s1 = scanner.nextLine();
		System.out.println("Enter any character");
		char c1 = scanner.next().charAt(0);
		int j=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c1) {
				j++;
			}
		}
		System.out.println(j);
		scanner.close();
	}

}
