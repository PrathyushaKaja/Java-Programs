package fileHandling;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReader {
//	static String a;
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any string");
//		a=scanner.next();
//		System.out.println(a.length());
//		for(int i=0;i<a.length();i++) {
//			System.out.println(a.charAt(i));
//		}
//	}
	static String value="";
	public static void main(String[] args) throws IOException {
		File file = new File("./testing.txt");
		if(!file.exists()) {
			file.createNewFile();
		}	
		FileInputStream fis = new FileInputStream(file);
		/*
		 * In three ways we can write scanner class
		 * one is normal way
		 * creating fileInputStream instance
		 * Using fileInputStream instance 
		 */
		//Scanner scanner = new Scanner(file);
		//Scanner scanner = new Scanner(new FileInputStream(file));
		Scanner scanner = new Scanner(fis);
		//hasNext --> Returns true if this scanner has another token in its input
		//hasNextLine --> Returns true if this scanner has another line
		//next --> Finds and returns the next complete token from this scanner
		while(scanner.hasNextLine()) {
			value+=scanner.nextLine() + "\n";//\n denotes new line or next line 
		}
		System.out.println(value);
		scanner.close();
	}
	
	
}
