package javabasics;

public class HelloWord {

	public static void main(String[] args) {
		String word ="Hello";
//		for(int i=0;i<word.length();) {
//			System.out.println(word.charAt(i));
//			i++;
//		}
//		char[] reverseWord = word.toCharArray();
//		for(int i=0;i<reverseWord.length;) {
//			System.out.println(reverseWord[i]);
//			i++;
//		}
		for(int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i));
		}
		
	}

}
