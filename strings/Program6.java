package strings;

import java.util.Scanner;

public class Program6 {
    //to reverse each word of a given string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string:");
        String input = scanner.nextLine();//hello world
        String[] words = input.split("\\s+");
        String reversedString = "";
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedString += reversedWord + " ";
        }
        System.out.println("Reversed string with reversed words: " + reversedString.trim());

        scanner.close();
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
