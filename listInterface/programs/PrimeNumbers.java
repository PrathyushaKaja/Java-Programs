package listInterface.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num=2;num<=a;num++) {
        	boolean flag =false;
        	for(int i=2;i<=num/2;i++) {
        		if(num%i==0) {
        			flag=true;
        			break;
        		}
        	}
        	if(flag==false) {
        		al.add(num);
        	}
        }
        System.out.println("Prime numbers up to " + a + ": " + al);
        scanner.close();
    }
}
