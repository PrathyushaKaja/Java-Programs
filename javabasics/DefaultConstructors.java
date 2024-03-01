package javabasics;

public class DefaultConstructors {
	String name = "prathyusha";
/*default constructor is created by the java itself. 
It will create the constructor internally.
It is also called implicit constructor
Default constructor is always parameterless */
	public static void main(String[] args) {
		DefaultConstructors dc = new DefaultConstructors();
		System.out.println("Hello, "+dc.name);
	}

}
