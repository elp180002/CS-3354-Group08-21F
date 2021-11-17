/**
 * File Name				: part5.java
 * 
 * Version Number			: 2.0
 *
 * Author Name(s)			: Ethan Peglar, Mithul Manivannan, Eddie Villarreal
 * 
 * Project Name				: Café du Vend
 *
 * Organization				: The University of Texas at Dallas, Erik Jonsson School of Engineering and Computer Science
 *
 * Input				: This class accepts input from the user in a such a way that mimics a vending machine
 *					  transaction, in order to test use cases.
 *
 * Output				: This class will output various messages based on user input so that it resembles a
 *					  vending machine.
 *
 * Copyright				: N/A
 *
 * Related Requirements			: Fulfill roughly half of the established use cases.
 *
 * List of Classes			: part5
 *
 * Related Documents			: Software Engineering Document and Presentation (submitted through eLearning)
 *
 * Update History			: N/A
 *
 * Reviewers				: N/A
 *
 * Test Cases				: Contained in SE Document
 *
 * Functional Description		: This program serves to simulate a real world coffee vending machine
 *
 * Error Messages			: N/A
 *
 * Assumptions				: N/A
 *
 * Constraints				: No error handling has been coded; therefore, user must type precise answers.
 *
 * 60% of the use cases have been coded, as per the suggested requirements of the professor.
 */

package Group08;
import java.util.*;

public class part5 {
	public static void main(String[] args) {
		double total = selection();
		if (payment(total)) dispensing();
		System.out.println("(Program ended)");
	}
	
	/* UC2
	 * Input: N/A
	 * Output: Total cost of transaction
	 * selection() serves to simulate the process of selecting coffee from the vending machine
	 */
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
			System.out.println("Welcome to Café du Vend!" + '\n');
			System.out.println("Please select option (type c1, f1, c2, pay, etc.): ");
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
			case "pay":
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
	
	/* UC1
	 * Input: Total cost of transaction
	 * Output: Boolean, true if successful transaction, false otherwise
	 * payment(total) serves to simulate the process of paying for coffee from the vending machine
	 */
	public static boolean payment(double total) {
		double moneyInserted, change;
		int paymentMethod;
		boolean successfulTransaction = false;
		Scanner method = new Scanner(System.in);
		Scanner pay = new Scanner(System.in);
		
		System.out.println("Pay with 1) Cash or 2) Credit Card? (type 1 or 2)");
		paymentMethod = method.nextInt();
		
		switch (paymentMethod) {
		case 1:
			System.out.println("Please insert cash (type total)");
			break;
		case 2:
			System.out.println("Please insert card (type total)");
			break;
		}
		
		moneyInserted = pay.nextDouble();
		
		if (moneyInserted >= total) {
			successfulTransaction = true;
			change = moneyInserted - total;
			System.out.println("Transaction successful");
			System.out.println("Change due: $" + change);
			if (paymentMethod == 1) System.out.println("Dispensing change..." + '\n');
		} else {
			System.out.println("Transaction failed");
		}
		
		return successfulTransaction;
	}
	
	/* UC3
	 * Input: N/A
	 * Output: N/A
	 * dispensing() serves to simulate the process of dispensing coffee from the vending machine
	 */
	public static void dispensing() { // UC 3
		Scanner dispense = new Scanner(System.in);
		System.out.println("Please place a cup and press OK (just press enter)");
		dispense.nextLine();
		
		System.out.println("Dispensing Coffee...");
		System.out.println("Dispensing Creamer...");
		System.out.println("Coffee is ready. Please remove cup and press OK to return to home screen. (just press enter)");
		dispense.nextLine();
		System.out.println("Dispensing Water for cleaning...");
		}
	
}
