package javabasics;

public class ExplicitConstructorParameterless {
/*We can manually create the constructor like the method.
 But if we start creating the constructor then java will no longer creates any default constructor for us.
 we can create constructor in both ways with parameters and with out parameters
 For constructor we should provide only public, private or protected
 And it will not return any data so no need to enter returntype for the constructor otherwise it throws an error
 */
//Parameterless constructor
	int i;
	public ExplicitConstructorParameterless() {
		System.out.println("Hi!");
	}
	public static void main(String[] args) {
		ExplicitConstructorParameterless ec = new ExplicitConstructorParameterless();
		System.out.println(ec.i);
// output will be o because we didn't give any data to that variable the constructor will give default value
	}

}
