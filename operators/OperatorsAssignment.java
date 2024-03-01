package operators;

public class OperatorsAssignment {
	//Assignment operators --> =, +=, -=, *=, /=, %=
    static int i=8;
	public static void addsubeq() {
		if(i==1) {
			i+=1;
			System.out.println(i);
		}else {
			i-=4;
			System.out.println(i);
		}
	}
	
	public static void muleq() {
		if(i>=8) {
			i*=78;
			System.out.println(i);
		}else {
			i/=90;//Remainder value
			System.out.println(i);		
			}
	}
	
	public static int value() {
		return i;
	}
	
	public static void main(String[] args) {
		System.out.println("i value: "+i);
		addsubeq();
		System.out.println("i value: "+i);
		muleq();
		System.out.println("i value: "+i);
	}
}
