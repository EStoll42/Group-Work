package edu.gcu.bootcamp.eric.stoll.shopper;

import java.util.Scanner;

public class GroceryList extends MyList {
	
	Scanner scanner = new Scanner(System.in);
	/*
	 * if else statement decides where to go to run each method
	 */
	public void actionMenu(int option) {

		if (option == 1) {
			this.addItem();

		}else if
			(option == 2) {
			this.removeItem();
			
		}else if
			(option == 3) {
			this.checkItemOnList();

		}else if
			(option == 4) {
			this.sortItems();
			
		}else if
			(option == 9) {
			this.displayExitScreen();

		}else
			// If any other number or key is pressed this prints
			System.out.println("Wrong Entry");
	}
	/*
	 * After done adding items to the list this displays them for your viewing
	 */
	public void displayExitScreen() {
		System.out.println("SHOPPING LIST\n");
		for(String item : myList) {	
		System.out.println(item);
		}
	}
}