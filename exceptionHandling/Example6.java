package exceptionHandling;

public class Example6 {
//Throw custom(user-defined)exceptions using throw keyword
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("1 cannot be divisble with 0");
		}
	}

}
