package loopingStatements;

public class ForLoop6 {
//odd numbers between 200 to 25(reverse order)
	public static void main(String[] args) {
		int i;
		for(i=200;i>=25;) {
			if(i%2!=0) {
				
				System.out.println(i);
			}
			i--;
		}
	}

}
