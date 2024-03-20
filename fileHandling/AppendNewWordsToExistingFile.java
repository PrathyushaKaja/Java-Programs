package fileHandling;

import java.io.*;

public class AppendNewWordsToExistingFile {

	public static void main(String[] args) throws IOException {
		File file = new File("./NewFile.txt");
		if(!file.exists())
			file.createNewFile();
//		String s ="Prathyusha Shetty";
//		BufferedWriter br = new BufferedWriter(new FileWriter(file));
//		br.write(s);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String existingText="";
		String line = new String();
		while((line= br.readLine())!=null)
			existingText+=line +"\n";
		String s1 ="You are doing great job!";
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(existingText + s1);
		bw.close();
		br.close();
	}

}
