package edu.gcu.bootcamp.eric.stoll.shopper;

import java.util.Scanner;

public class Shopper {
	
	static Scanner scanner = new Scanner(System.in);
	static GroceryList g = new GroceryList();
	
	public static void main(String[] args) {
		
		displayGroceryList();
		
	}
	/*
	 * Displays grocery list for user to choose options
	 */
	public static void displayGroceryList() {
		
		int option;

		do {
			System.out.println("=======================================");
			System.out.println("            Grocery List");
			System.out.println("=======================================");
			System.out.println("Pick an option: ");
			System.out.println("-----------------------");
			System.out.println(" 1: : Add Item");
			System.out.println(" 2: : Remove Item");
			System.out.println(" 3: : Check Item on List");
			System.out.println(" 4: : Sort Items");
			System.out.println("------------------------");
			System.out.println(" 9: : Exit");

			option = scanner.nextInt();
			g.actionMenu(option);

		} while (option != 9);
	}
	}