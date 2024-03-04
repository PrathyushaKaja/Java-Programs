package inheritanceConcept;

public class Sim5G extends Sim4G{
	public void FiveGPlus() {
/*
 * we can simply mention the method name here because 
 * we are extending the class with the parent class.
 * If we want to call the particular method from the parent class we have to use super keyword.
 */
		super.volte(); 
		System.out.println("5G+ feature");
	}//use F3 to point out 
	public void volte() {
		System.out.println("Sim4G volte feature");
	}
}
