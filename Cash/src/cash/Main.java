package cash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cents;
		do {
			System.out.println("Enter amount:");
			cents = scanner.nextInt();
		} while (cents <=  0);
		
		int quarters = calculateQuarters(cents);
		
		cents = cents - (quarters * 25);
		
		int dimes = calculateDimes(cents);
		
		cents = cents - (dimes * 10);
		
		int nickels = calculateNickels(cents);
		
		cents = cents - (nickels * 5);
		
		int pennies = calculatePennies(cents);
		
		cents = cents - (pennies * 1);
		
		int coins = quarters + dimes + nickels + pennies;
		
		System.out.println("Coins: " + coins);
		
	}
	
	static int calculateQuarters(int cents) {
			int quarters = 0;
			while (cents >= 25) {
				cents -= 25;
				quarters ++;
			} 
			return quarters;
	}
	
	static int calculateDimes(int cents) {
			int dimes = 0;
			while (cents >= 10) {
				cents -= 10;
				dimes ++;
			}
			return dimes;
	}
	
	static int calculateNickels(int cents) {
			int nickels = 0;
			while (cents >= 5) {
				cents -= 5;
				nickels ++;
			}
			return nickels;
	}
	
	static int calculatePennies(int cents) {
			int pennies = 0;
			while (cents >= 1) {
				cents -= 1;
				pennies ++;
			}
			return pennies;
	}
	
}
