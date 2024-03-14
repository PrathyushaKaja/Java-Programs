package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {
/*
 * Exception is an event that occurs during the execution of a program 
 * that disrupts the normal flow of instructions.
 * 
 * When user wants to handle the exception then that process is called exception handling.
 * 
 * If the user is not handling the exception, then java will handle the exception by 
 * stopping the execution whenever it faces the issue 
 * To take the control of exceptions from java we need exception handling
 * 
 * Different types of an exception:
	1.	Checked execution (compile-time exception)
	2.	Unchecked execution (runtime exception)
 * To handle the exceptions we need try, catch and finally blocks 
 * and we also use throw and throws keywords
 */
	/*
	 * stackTrace 
	 * Exception name -->java.lang.ArithmeticException
	 * Exception message -->/ by zero
	 * which line number -->Example.java:24
	 * methods info -->div
	 */
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Before exception");
		int a =67;
		int b =0;
		int c = 0;
		File file = new File("C:\\Users\\Basic User\\Downloads\\EOS Defects Test signoff document_New.docx");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		try {
			c = a/b;
		}catch(ArithmeticException ae){
			System.out.println(ae.toString());
			throw ae;
		}finally {
			System.out.println("Finally block");
		}
		System.out.println(c);
		System.out.println("After exception");
	}
	
}
