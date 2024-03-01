package loopingStatements;

import java.util.Scanner;

/*
 * we are giving the input assume its 133
 * first we have to give the input > 1
 * and have to take another input and assign 2 to that variable we can also give
 * and give another variable count to increment to print prime or not
 */
public class PrimeNumbers {
    public static void main(String[] args) {
    	int j =2;
    	int count=0;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter any number");//29
    	int i = scanner.nextInt();
    	while(j<i) {//2<29
    		if(i%j==0) {//29%2==0
    			count++;
    			break;//to stop the iteration if it found any number is divisible
    		}
    		j++;
    	}
    	if(count==0) {
    		System.out.println("prime number");
    	}else {
    		System.out.println("not a prime number");
    	}
       scanner.close();
    }
}
