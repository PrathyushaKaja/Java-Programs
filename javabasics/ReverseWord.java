package javabasics;

public class ReverseWord {
	
	public static void main(String[] args) {
		String word = "Hello";
		String reversedWord = "";

		for (int i = 0; i < word.length(); i++) {
		  reversedWord = word.charAt(i) + reversedWord;
		}

		System.out.println("Reversed string: "+ reversedWord);
	}
			
	}


