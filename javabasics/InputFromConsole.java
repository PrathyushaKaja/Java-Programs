package javabasics;

import java.util.Scanner;

public class InputFromConsole {
	static int age;
	static float height; 
	public static void age() {
		if(age >= 18) {
			System.out.println("what is your height?");
		}else {
			System.out.print("You are not applicable");//To stop going to the next line
		}
	}
	
	public static void height() {
		if(height >5.9) {
			System.out.println("Your home town");
		}else {
			System.out.print("You are not applicable");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//here we have created the scanner object and it will takes input from the console 
		System.out.println("Hi! What is your name");//system prints this
		String name = scanner.nextLine();//console takes the string input from the user
		System.out.printf("How are you? %s %n",name);//system prints this
		String status = scanner.nextLine();//console takes the string input from the user
		System.out.println("What is your age? ");//system prints this
		age = scanner.nextInt();//console takes the integer input from the user
		scanner.nextLine();//next line
		age();//calling age method
		height = scanner.nextFloat();//console takes the float input from the user
		scanner.nextLine();//next line
		height();//calling float method
		String location = scanner.nextLine();//console takes the string input from the user
		System.out.println("Thanks for your information");//system prints this	
		scanner.close();//closing the scanner
	}
}
