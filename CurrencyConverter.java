package p1;
import java.util.Scanner;

public class CurrencyConverter {

public static void main(String[] args) {

	double currencyTotal = 0.0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Which currency would you like to convert into?");
	System.out.println("1: Pound");
	System.out.println("2: Euro");
		
		int currencyType = scanner.nextInt();
		
	System.out.println("How many USD would you like to convert?");

		double dollarAmount = scanner.nextDouble();

		if(currencyType == 1) {
			currencyTotal = dollarAmount * 1.23;
			
			System.out.println("Your total is " + currencyTotal);
		}
		if(currencyType == 2) {
			currencyTotal = dollarAmount * .94;
			
			System.out.println("Your total is " + currencyTotal);
		}
		
		System.out.println("Would you like to convert again? (y/n)");
		
			scanner.nextLine();
			String reRun = scanner.nextLine();
				if(reRun == "y") {

		}
	}
}
