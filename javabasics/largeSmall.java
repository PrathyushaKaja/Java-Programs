package javabasics;
//even or odd
//leap year or not
//vowels or not
public class largeSmall {
	static int a =140;
	static int b = 100;
	public void max() {
		if(a>b) {
			System.out.println("a: "+a);
		}else {
			System.out.println("b: "+b);
		}
	}
	public static void main(String args[]) {
		largeSmall ls = new largeSmall();
		ls.max();
	}
}
