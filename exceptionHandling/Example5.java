package exceptionHandling;

public class Example5 {
//when will the finally block not be executed
	//if we use system.exit(0) in any block then the statements and 
	public static void main(String[] args) {
		try {
			int[] arr = new int[] { 1, 2, 3 };
			System.out.println(arr[3]);
			System.out.println(arr[2]/0);
//			System.exit(0);
		} catch (ArrayIndexOutOfBoundsException|ArithmeticException e) {
//			System.exit(0);
			e.printStackTrace();
			System.out.println("This is catch block");
		} finally {
			System.exit(0);
			System.out.println("This is finally block");
			
		}

	}

}
