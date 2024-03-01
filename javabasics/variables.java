package javabasics;

public class variables {
	int studentId = 301;//instance variable(non-static)
	static String name = "prathyusha";//class variables (static)
	public static void main(String[] args) {
		String address = "hyderabad";//Local variable
		variables var = new variables();
		System.out.println(var.studentId);
		//System.out.println(name);
		student();// Method calling
		System.out.println(address);
		parameter(6);//parameter
	}
	public static void student() {
		System.out.println(name);
	}
	public static void parameter(int height) {
		System.out.println("height is" + height);
	}
}
