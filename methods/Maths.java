package methods;

public class Maths {
	static int i=10;
	public static void sample() {
		System.out.println("Hi everyone! Good night");
	}
	
	public void addition(int add) {
		i = i + add;
		System.out.println("Sum is: "+i);
	}
	
	public void subtraction(int sub) {
		if(i>=sub) {
			i = i - sub;
			System.out.println("Sub is: "+i);
		}
		else {
			System.out.println("Value is not sufficient");
		}
	}
	
	public void multiplication(int mul) {
		if(i==mul) {
			i = i*30;
			System.out.println("Mul value is: "+i);
		}
	}
	
	public int total() {
		return i;
	}
	
	public static void main(String args[]) {
		sample();
		Maths m = new Maths();
		System.out.println("Total is: "+ m.total());
		m.addition(500);
		System.out.println("Total is: "+ m.total());
		m.subtraction(200);
		System.out.println("Total is: "+ m.total());
		m.multiplication(100);
		System.out.println("Total is: "+ m.total());
	}
}
