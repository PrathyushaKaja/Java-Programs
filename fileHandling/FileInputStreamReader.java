package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReader {
/*
 * There are few different types to read the data from text files
 * For file, we have to create the instance. File is also a class
 * 1.FileInputStream ---> class
 * 2.Scanner ---> class
 * 3.FileReader ---> class
 * 4.BufferedReader ---> class
 */
	static int asciiCode;
	public static void main(String[] args) throws IOException {
		//IOException is the compiler suggested error
		File file = new File("./testing.txt");
		if(!file.exists())
			file.createNewFile();
		/*if we want the output in the string then we have to create one variable
		 * we can assign string value to "" also 
		 */
		String value = new String(); 
		//System.out.println(file);
		FileInputStream fis = new FileInputStream(file);
		
		while((asciiCode =fis.read())!=-1) {
			value+=String.valueOf((char)asciiCode);
			//System.out.print((char)asciiCode);
		}
		System.out.println(value);//output is string
		fis.close();//we have to close the streamers otherwise data leakeage will be happen 

		//It will return the ascii code 
		//read()-->Reads a byte of data from this input stream
		//System.out.println(fis.read());
		
		/*It will return the second character in the text file because the first 
		character is returned in the ascii value*/
		//System.out.println((char)fis.read());//Type casting 
	}

}
