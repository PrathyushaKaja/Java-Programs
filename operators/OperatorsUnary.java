package operators;

public class OperatorsUnary {
	//UnaryOperators --> ++(increment), --(decrement)
	static int a;//30
	static int b;//20
	static int c;
	public static void Preincrement() {
		c = ++a + ++b; //52
		System.out.println("Pre increment is: "+c);
	}
	
	public static void PostIncrement() {
		c = a++ + b++;//50
		System.out.println("Post increment is: "+c);
	}
	
	public static void Predecrement() {
		c = --a - --b;//10
		System.out.println("Pre decrement is: "+c);
	}
	
	public static void Postdecrement() {
		c = a-- - b--;//10
		System.out.println("Post decrement is: "+c);
	}
	
	public static void main(String[] args) {
		a=30;
		b=20;
		Preincrement();
		Predecrement();
		PostIncrement();
		Postdecrement();
	}
}
