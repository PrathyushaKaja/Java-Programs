/*print fizz buzz if the no is divisble by 3
buzz fizz if the no is divisble by 5
if the number is divisble by both 3 and 5 the display buzz buzz
 * 
 * 
 */
package javabasics;

import java.util.Scanner;

public class Division {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a= scanner.nextInt();
		
			if(a%3==0 && a%5!=0) {
				System.out.println("fizz buzz");
			}
			else if(a%5==0 && a%3!=0) {
					System.out.println("buzz fizz");
				}
			else if(a%3==0 && a%5==0) {
						System.out.println("buzz buzz");
					}
			else {
				System.err.println("wrong input");
			}
			scanner.close();
			
		}
	}
