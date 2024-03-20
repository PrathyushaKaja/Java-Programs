package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamWriter {
/*
 * There are three different ways to writing the data into text files
 * 1. FileOutputStream
 * 2. FileWriter
 * 3. BufferedWriter
 */
	public static void main(String[] args) throws IOException,FileNotFoundException {
		File file = new File("./FileOuputStreamWriting.txt");
		FileOutputStream fos = new FileOutputStream(file);
		if(!file.exists())
			file.createNewFile();
//		fos.write(72);
//		fos.write(69);
//		fos.write(76);
//		fos.write(76);
//		fos.write(79);
		String a = "apple";
		for (char ch : a.toCharArray()) {
			fos.write((int)ch);
		}
		fos.flush();
		fos.close();
		
	}

}
