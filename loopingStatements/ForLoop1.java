package loopingStatements;

public class ForLoop1 {
//print 1 to 100 numbers
	public static void main(String[] args) {
		/*
		 * for(int i=1;i<=100;i++) { System.out.println(i); }
		 */
		int i;
		for(i=1;;) {//Here condition and updation are not mandatory we can also mention inside for loop but we have to mention the ; 
			if(i<=100) {
				System.out.println(i);
				i++;
			}
		}
	}

}
