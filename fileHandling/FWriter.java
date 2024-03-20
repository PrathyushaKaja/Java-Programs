package fileHandling;

import java.io.*;

public class FWriter {
//FileWriter and fileOutputStream are similar
	public static void main(String[] args) throws IOException {
		File file = new File("./FileOutputStreamWriting.txt");
		if(!file.exists())
			file.createNewFile();
		FileWriter fw = new FileWriter(file);
		String s ="shetty1";
		fw.write("a");
		fw.write(s);
		fw.write(s.toCharArray());
		fw.flush();
		fw.close();
	}

}
