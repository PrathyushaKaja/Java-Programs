package javabasics;

import java.util.Scanner;
/**
 * This class defines to equal the i,j values
 * @author Prathyusha Kaja
 * @version 1.0
 */
public class Comments {
	static int i;
	static int j = 10;// Here j value is 10
	static int k;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the number: ");
		i = scanner.nextInt();
		if(i!=j) {//Here i value is not equal to j then this block will be executed
			k = j-i;// storing the value in k variable 
			System.out.println("k value is:"+k);//printing the k value
			System.out.println(i+k);//adding the i value with k value
		}else {//otherwise this block will be executed
			System.err.println("No data");
		}
		scanner.close();
	}

}
