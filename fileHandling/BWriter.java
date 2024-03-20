package fileHandling;

import java.io.*;

public class BWriter {
//BufferedWriter extends Writer 
//FileWriter extends OutputStreamWriter
//OutputStreamWriter extends Writer
//Same methods like file writer
	public static void main(String[] args) throws IOException {
		File file = new File("./FileOutputStreamWriting.txt");
		if(!file.exists())
			file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String s ="Pshetty";
		bw.write(s);
		bw.close();
		fw.close();
	}

}
