package javabasics;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		int j=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		System.out.println("Enter the character");
		/*
		 * next() function returns the next token/word in the input as a string and 
		 * charAt(0) function returns the first character in that string, 
		 * the number 0 in the function in CharAt(NUMBER)  represents the index of the 
		 * single word of the string taken input, and set that index character 
		 * to the char variable.
		 */
		char ch = scanner.next().charAt(0);
		char[] findWord = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(findWord[i]==ch) {
				j=1;
			}
		}
		if(j==1) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		scanner.close();
	}

}
