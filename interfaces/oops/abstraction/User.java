package interfaces.oops.abstraction;

public class User {

	public static void main(String[] args) {
		Laptop lenovo = new Lenovo();
		lenovo.audio();
		lenovo.capture();
		lenovo.copy();
		lenovo.paste();
		lenovo.touchScreen();
		Laptop.video();
		
		Apple apple = new Apple();
		apple.capture();
		apple.copy();

	}

}
