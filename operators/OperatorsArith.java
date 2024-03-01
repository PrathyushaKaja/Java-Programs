package operators;

public class OperatorsArith {
	//Arithmetic operators--> +,-,*,/,%
	int a;
	int b;
	int c;
	
	public void addsub() {
		if(a>b) {
			//add
			c = a + b;
			System.out.println("Add output is: "+c);//130
		}else{
			//sub
			c = a - b;
			System.out.println("Sub output is: "+c);//10
		}
	}
	
	public void mul() {
		c = a * b;
		System.out.println("Mul output is: "+c);//4200
	}
	
	public void div() {
		c = a / b;
		System.out.println("Div output is: "+c);//1
	}
	
	public void mod() {
		c = a % b;
		System.out.println("Mod output is: "+c);//10
	}
	
	public static void main(String[] args) {
		OperatorsArith oa = new OperatorsArith();
		oa.a=70;
		oa.b=60;
		oa.addsub();
		oa.mul();
		oa.div();
		oa.mod();
	}
}
