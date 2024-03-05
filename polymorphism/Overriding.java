package oops.polymorphism;

import abstractClass.HP;

public class Overriding extends HP{

	public void capture() {
		System.out.println("capture code");
		
	}
	
	@Override
	public void paste() {
		System.out.println("Override paste code");
	}
	public static void main(String[] args) {
		Overriding o = new Overriding();
		o.capture();
		o.paste();
	}
}
