/*
 * Ethan Peglar
 * elp180002
 * CS 3354.0w1
 * Part 4
 * 11/2/21
 *
 * 60% of the use cases have been coded, as per the suggested requirements of the professor.
 */

package Group08;
import java.util.*;

public class part4 {
	public static void main(String[] args) {
		double total = selection();
		if (payment(total)) dispensing();
		System.out.println("(Program ended)");
	}
	
	public static double selection() { // UC2
		Scanner vendor = new Scanner(System.in); // I don't close the scanners due to a bizzare exception error that occurs when closed
		
		double priceCapp = 4.50;
		double priceHotCoco = 2.50;
		double priceEspr = 3.50;
		double priceLatte = 5.00;
		double priceHazel = 0.50;
		double pricePumpkin = 0.50;
		double priceVanilla = 0.50;
		double priceIrish = 0.50;
		
		double total = 0.0;
		boolean checkoutSelected = false;

		while (!checkoutSelected) {
			System.out.println("Please select option (type c1, f1, c2, Pay, etc.): ");
			System.out.println("Coffee #1: Cappuchino, $4.50");
			System.out.println("Coffee #2: Hot Chocolate, $2.50");
			System.out.println("Coffee #3: Latte, $5.00");
			System.out.println("Coffee #4: Espresso, $4.50");
			System.out.println("Flavor #1: Hazelnut, $.50");
			System.out.println("Flavor #2: Pumpkin Spice, $.50");
			System.out.println("Flavor #3: French Vanilla, $.50");
			System.out.println("Flavor #4: Irish Creme, $.50");
			System.out.println("Pay");
			System.out.println("----------------------------------------------------" + '\n');
			
			
			String option = vendor.nextLine();
			System.out.println();
			
			switch (option) {
			case "c1":
				System.out.println("Cappuchino added");
				total += priceCapp;
				break;
			case "c2":
				System.out.println("Hot Chocolate added");
				total += priceHotCoco;
				break;
			case "c3":
				System.out.println("Espresso added");
				total += priceEspr;
				break;
			case "c4":
				System.out.println("Latte added");
				total += priceLatte;
				break;
			case "f1":
				System.out.println("Hazelnut added");
				total += priceHazel;
				break;
			case "f2":
				System.out.println("Pumpkin Spice added");
				total += pricePumpkin;
				break;
			case "f3":
				System.out.println("French Vanilla added");
				total += priceVanilla;
				break;
			case "f4":
				System.out.println("Irish Creme added");
				total += priceIrish;
				break;
			case "Pay":
				if (total == 0.0) {
					System.out.println("Error: No option selected.");
				} else {
					checkoutSelected = true;
				}
				break;
			default:
				System.out.println("Invalid option");
			}
			System.out.println();
		}
		return total;
	}
	
	public static boolean payment(double total) { // UC1
		double moneyInserted;
		boolean successfulTransaction = false;
		Scanner pay = new Scanner(System.in);
		
		System.out.println("Please insert cash or card (type total)");
		moneyInserted = pay.nextDouble();
		
		if (moneyInserted >= total) {
			successfulTransaction = true;
			System.out.println("Transaction successful");
		} else {
			System.out.println("Transaction failed");
		}
		
		return successfulTransaction;
	}
	
	public static void dispensing() { // UC 3
		Scanner dispense = new Scanner(System.in);
		System.out.println("Please place a cup and press OK (just press enter)");
		dispense.nextLine();
		
		System.out.println("Coffee is ready. Please remove cup and press OK to return to home screen. (just press enter)");
		dispense.nextLine();
		}
	
}
