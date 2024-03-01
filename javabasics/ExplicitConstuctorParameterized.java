package javabasics;

public class ExplicitConstuctorParameterized {
	int i = 37;
	public ExplicitConstuctorParameterized(int j) {
		i = j;
		System.out.println("This is a explicit paramterized constructor");
	}
	
	public ExplicitConstuctorParameterized() {
		
	}
	
	public static void main(String[] args) {
		ExplicitConstuctorParameterized ecp = new ExplicitConstuctorParameterized(89);
		System.out.println(ecp.i);
	}

}
