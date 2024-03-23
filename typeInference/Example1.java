package typeInference;

import methods.Bank;

public class Example1 {
/*
 * Type inference is a concept in which the compiler infers(choose) 
 * the type of the variable using the value provided.
 * 
 * 1.This type inference is restricted to local variables (within the block)
 * 2.This feature is introduced in java 10 version.
 * 
 * Var is just a keyword not a datatype
 */
	public static void main(String[] args) {
		var k =1000;
		var strName ="apple";
		var booleanValue = true;
		System.out.println(k);
		System.out.println(strName);
		System.out.println(booleanValue);
		//we can also use var keyword for creating a instance also 
		var Example1 = new Bank();
		Example1.deposit(200);
		Example1.getCurrentBalance();
		Bank.greet();
		Bank.search(50);
		//we can also use var keyword as a var name
		var var =300;
		var +=var;
		System.out.println(var);
		//we can also use var in arrays concept also, but we should not mention[]
		var arr =new int[] {1,2,3};
		//var arr1 = {1,2,3}//We shouldnot use like this
		var arr2 =new int[3];
		arr2[0] =10;
		arr2[1]=20;
		arr2[2]=30;
		for (int num : arr2) {
			System.out.println("arr2 is:"+num);
		}
		System.out.println();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("arr is:"+arr[i]);
		}
	}
	//we cannot give var as a parameter
//	public static int addition(int i, var j) {
//		return i-j;
//	}
//	public static String strName(String i, String j) {
//		return i+j;
//	}
}
