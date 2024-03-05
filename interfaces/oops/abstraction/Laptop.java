package interfaces.oops.abstraction;
//Interface is a blueprint of a class
//It is like a business document with user guidelines
//Until java 1.7 we can only use methods inside interface like we can only tell what should do in interfaces
//But in java 1.8 version we can also implement code which means we can tell what should do and how should do in the interfaces
//But in java 1.9 version we can use private methods also for code reusability
public interface Laptop {
	public void copy();
	public void paste();
	public void capture();
	/*
	 * Default is used to be reused by the implementers if wants.
	 * We can access this through the classes
	 */
	default void audio() {
		commonCode();
		System.out.println("Audio code");
	}
	static void video() {
		commonCode();
		System.out.println("Video code");
	}
	/*Private method is used for the code re-usability.
	 * We can use this inside default and static methods
	 * And also we make private static or non-static.
	 * We cannot use non-static method inside static method.
	 * So, we can make private as static method
	 * */
	private static void commonCode() {
		System.out.println("private common code");
	}
	default void touchScreen() {
		System.out.println("Laptop touch screen code");
	}
}
