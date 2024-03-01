package javabasics;

public class String1 {

	public static void main(String[] args) {
		String str ="picture";
		char ch = 'a';
		boolean flag=false;
		char[] word = str.toCharArray();
		for(int i=0;i<word.length;) {
			if(word[i]==ch) {
				flag=true;
			}
			i++;
		}
		if(flag==true) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
	}

}
