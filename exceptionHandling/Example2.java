package exceptionHandling;

import java.io.*;

public class Example2 {
//Try with resources
	public static void main(String[] args) throws Exception{
		File file = new File("./NewFile1.txt");
		//AutoClosable
		try (
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);){
			System.out.println(br.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
