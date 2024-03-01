package methods;

public class Bank {
	static String name ="prathyusha";
	static int currentBalance = 3000;
	public static void greet() {
		System.out.println("Hello "+ name +", welcome to the ABC bank");
	}
	
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println(amount+" is deposited successfully "+"and your current balance is "+currentBalance );
	}
	
	public static void search(int amount) {
		if(currentBalance >= amount) {
			currentBalance = currentBalance - amount;
			System.out.println("successfully amount is deducted "+currentBalance);
		}else {
			System.out.println("Amount is not sufficient");
		}
	}
	
	/*public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println(amount+" is withdrawn successfully "+"and your current balance is "+currentBalance );
	}*/
	
	public int getCurrentBalance() {
		return currentBalance;
	}
	
	public static void main(String args[]) {
		greet();
		Bank bank = new Bank();
		System.out.println("Current balance is: "+bank.getCurrentBalance());
		bank.deposit(5000);
		System.out.println("Current balance is: "+bank.getCurrentBalance());
		//withdrawal(3500);
		search(9000);
		System.out.println("Current balance is: "+bank.getCurrentBalance());
	}
}
