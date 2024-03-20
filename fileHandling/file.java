package fileHandling;

import java.io.File;
import java.io.IOException;

public class file {
/*
 * java will handle the file (txt, pdf, word…), folders (to segregate the files) same	
 * we have to create the file instance(object) in java then only we can access the files and do the operations
 * import java.io.File;
 * File(string pathname) and File(URI uri) are the main constructors
 */
	public static void main(String[] args) throws IOException {
//		File f1 = new File("C:\\Users\\Basic User\\eclipse-workspace\\JavaPractice\\src\\test.docx");
		File f2 = new File("./testing.txt");
//		if(f1.exists())
//			f1.delete();
//		f1.createNewFile();
//		System.out.println(f1.createNewFile());
//		System.out.println(f1.canWrite());
//		System.out.println(f1.canRead());
//		System.out.println(f1.getAbsolutePath());
//		System.out.println(f1.getName());
//		System.out.println(f1.getParent());
//		if(f1.exists())
//			f1.delete();
//		System.out.println(f2.createNewFile());
		System.out.println(f2.canWrite());
		System.out.println(f2.canRead());
		System.out.println(f2.setWritable(true));
	}

}
