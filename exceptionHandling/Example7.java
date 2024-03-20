package exceptionHandling;

public class Example7 {
//Throw custom(user-defined)exceptions using throw keyword
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new LoginException("This is the login exception");
		}
	}
}
