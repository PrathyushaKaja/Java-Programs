package oops.polymorphism;
//polymorphism is the ability of an object to take an many forms
//overloading--> compile-time polymorphism
public class Overloading {
	int c;
	public void add(int a, int b) {
		c = a+b;
		System.out.println("Addition is: "+c);
	}
	
	public void add(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Addition is:"+d);
	}
	
	public void add(String a, String b) {
		String c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Overloading sc = new Overloading();
		sc.add(5, 10);
		sc.add(1, 2, 3);
		sc.add("prathyusha", "kaja");
	}
	
	
}
