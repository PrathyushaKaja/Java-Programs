package strings;

import java.util.Scanner;
//To count number of characters in a string
public class Program1 {
/*
 * String is a sequence of characters and it is a class in java but considered as a 
 * literal because of its unique behavior.
 * 
 * It is a data type but it is under non-primitive data type.
 * 
 * String will store the text whereas character will only store 
 * single character(special character, digits and alphabets).
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any text:");
		String s1 = scanner.nextLine();
		System.out.println("Length of the string is:"+s1.length());
		scanner.close();
	}

}
