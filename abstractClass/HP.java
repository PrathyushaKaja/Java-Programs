package abstractClass;
//if we have implemented methods and un-implemented methods then we will use abstract class
//And in abstract class abstract methods will involve if un-implemented methods are there 
//Advantage is we can use abstract class for code re-usability
//We cannot create an instance for the abstract class like class 
public abstract class HP implements Laptop {

	public void copy() {
		System.out.println("Copy code");
	}

	public void paste() {
			System.out.println("Paste code");
	}

	public abstract void capture();
	
}
