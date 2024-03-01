package operators;

public class OperatorsConditional {
	//Conditional operators --> AND (&&), OR(||)
	static int a;//80
	static int b;//90
	
	public static void Andop() {
		if(a !=b && a<=b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void Orop() {
		if(a==b || a>=b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		a = 180;
		b = 900;
		Andop();
		Orop();
	}
}
