package interfaces.oops.abstraction;
//We are using this class for implementation based on the laptop business document
//Here we have to implement everything which are in laptop business document 
public class Lenovo implements Laptop {

	public void copy() {
		System.out.println("Copy code");
	}

	public void paste() {
		System.out.println("Paste code");
	}

	public void capture() {
		System.out.println("Capture code");
	}
	//Here, we can also implement the new functionalities even these functionalities are not present in the business document
	@Override
	public void touchScreen() {
		System.out.println("Touch screen code");
	}
	
}
