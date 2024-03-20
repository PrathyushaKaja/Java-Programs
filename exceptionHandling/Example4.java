package exceptionHandling;

public class Example4 {
//Multiple exceptions in a single catch block 
	public static void main(String[] args) {
		try {
			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[3]);
			System.out.println(arr[2]/0);
		} catch (ArrayIndexOutOfBoundsException|ArithmeticException e1) {
			e1.printStackTrace();
			System.err.println("This is the common exception");
		} 

	}

}
