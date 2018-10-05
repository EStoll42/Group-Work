package edu.gcu.bootcamp.eric.stoll.shopper;

import java.util.Scanner;

public class BucketList extends MyList{

	Scanner scanner = new Scanner(System.in);
	
	/**
	 * create method to display the action menu for the list
	 * create if else statements to allow options to be inputed by user and print out an action
	 */
	public void actionMenu(int option) {

		switch(option) {
		
			case 1 : this.addItem();
				break;
			case 2 : this.removeItem();
				break;
			case 3 : this.checkItemOnList();
				break;
			case 4 : this.sortItems();
				break;
			case 9 : this.displayExitScreen();
				break;
			default :
				// If any other number or key is pressed this prints
				System.out.println("Wrong Entry");
		}
	}
	/*
	 * After done adding items to the list this displays them for your viewing
	 */
	public void displayExitScreen() {
		System.out.println("BUCKET LIST\n");
		for(String item : myList) {	
		System.out.println(item);
		}
	}
	
	
}
