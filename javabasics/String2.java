package javabasics;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		char ch = 'c';
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string value");
		String str = scanner.next();
		char[] word = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(word[i]==ch) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		scanner.close();
	}

}
