package conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsDayName {

	public static void main(String[] args) {
		//Mon-Fri --> uff,it's a weekday
		//sat, sun --> yayy,it's a weekend
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tell me any day");
		String day = scanner.nextLine();
		if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || 
				day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") || 
				day.equalsIgnoreCase("Friday") ) {
			System.out.println("uff,it's a weekday");
		}else if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday") ){
			System.out.println("yayy,it's a weekend");
		}else {
			System.out.println("Wrong input");
		}
		scanner.close();
	}

}
