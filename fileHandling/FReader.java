package fileHandling;

import java.io.*;

public class FReader {
/*
 * FileInputStream and FileReader are similar
 */
//	public static void main(String[] args) throws IOException {
//		File file = new File("./FileReader.txt");
//		if(!file.exists()) {
//			file.createNewFile();
//		}
//		FileReader fr = new FileReader(file);
//		int asciiCode;
//		while((asciiCode=fr.read())!=-1)
//			System.out.print((char)asciiCode);
//			
//		fr.close();
//	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("./FileReader.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		int asciiCode;
		String value= new String();
		FileReader fr = new FileReader(file);
		while((asciiCode=fr.read())!=-1) {
			value+=String.valueOf((char)asciiCode);
		}
		System.out.println(value);
		fr.close();
	}

}
