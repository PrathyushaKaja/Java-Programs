package fileHandling;

import java.io.*;

public class BReader {
/*
 * BufferedReader extends Reader
 * FileReader extends InputStreamReader
 * InputStreamReader extends Reader
 */
	public static void main(String[] args) throws IOException {
		File file = new File("./BufferedReader.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		String value = new String();
		String line = new String();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		/*readLine --> internally it reads char by char only but externally it 
		will prints line by line*/
		while((line = br.readLine())!=null) {
			value+=line +"\n";
		}
			System.out.print(value);
		br.close();
		fr.close();
	}

}
