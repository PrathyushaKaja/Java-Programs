package accessModifiers;

public class PublicModifier {
/*In every place we can access the public modifier.
 * This modifier is for the class and class members
 * (variables, methods and constructors)*/
	public int a =10;
	public int b=78;
	public int c;
	public PublicModifier() {
		subtract();
	}
	public static void main(String[] args) {
		PublicModifier pm = new PublicModifier();
		System.out.println(pm.c);
		
	}
	public void subtract() {
		c = a-b;
		System.out.println(c);
	}
}
