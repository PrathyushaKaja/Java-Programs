package interfaces.oops.abstraction;

public class Apple implements Laptop {
	public void copy() {
		System.out.println("Copy code");
	}

	public void paste() {
		System.out.println("Paste code");
	}

	public void capture() {
		System.out.println("Capture code");
	}
}
