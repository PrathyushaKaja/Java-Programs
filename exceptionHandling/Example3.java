package exceptionHandling;

import java.io.*;

public class Example3 {
//Multiple catch blocks
	public static void main(String[] args) {
		File file = new File("./NewFile2.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			int[] arr = new int[] { 1, 2, 3 };
			//System.out.println(arr[3]);
			//System.out.println(arr[2]/0);
			String line;
			while((line=br.readLine())!=null)
					System.out.println(line);
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
			System.err.println("This is the array index out of bounds exception");
		} catch (ArithmeticException e2) {
			e2.printStackTrace();
			System.err.println("This is the arithmetic exception");
		} catch (FileNotFoundException e3) {
			e3.printStackTrace();
			System.err.println("This is the file not found exception");
		} catch (IOException e4) {
			e4.printStackTrace();
			System.err.println("This is the IOException");
		}

	}

}
