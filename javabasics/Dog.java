package javabasics;

public class Dog {
	
	public String breed ="Golden Retriever";
	public int height =30;
	public int weight =35;
	public static void main(String[] args) {
		System.out.println("Testing the class output");
		Dog dog = new Dog();
		System.out.println(dog.breed);
	}

}
