package edu.gcu.bootcamp.eric.stoll.shopper;

import java.util.Scanner;

public class Shopper {
	
	static Scanner scanner = new Scanner(System.in);
	static GroceryList g = new GroceryList();
	
	public static void main(String[] args) {
		Shopper shopper = new Shopper();
		shopper.chooseListType();
		
	}
	/**
	 * create method to choose a list type 
	 */
	public void chooseListType() {
		System.out.println("Would you like to make a To Do list (enter TODO)? Grocery list (enter GROCERY)?, or "
				+ " Bucket List (enter BUCKET): ");
		String choice = scanner.nextLine().toUpperCase();
		if (choice.equals("TODO")) {
			displayToDoList();
		}
		else if (choice.equals("GROCERY")){
			displayGroceryList();
		}
		else if (choice.equals("BUCKET")){
			displayBucketList();
		}
		
		
	}
	/**
	 * Displays grocery list for user to choose options
	 * create instance of grocery list class 
	 * set string variable and call user name method from my grocery list class
	 * add to grocery list to personalize
	 */
	public static void displayGroceryList() {
		GroceryList list = new GroceryList();
		String name = list.userName();
		int option;

		do {
			System.out.println("=======================================");
			System.out.println("       Grocery List for " + name);
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
	
	/**
	 * Displays To Do list for user to choose options
	 * create instance of To Do list class 
	 * set string variable and call user name method from my To Do list class
	 * add to To Do list to personalize
	 */
	public static void displayToDoList() {
		GroceryList list = new GroceryList();
		ToDoList list2 = new ToDoList();
		String name = list.userName();
		int option;

		do {
			System.out.println("=======================================");
			System.out.println("       To Do List for " + name);
			System.out.println("=======================================");
			System.out.println("Pick an option: ");
			System.out.println("-----------------------");
			System.out.println(" 1: : Add Task");
			System.out.println(" 2: : Remove Task");
			System.out.println(" 3: : Check Task on List");
			System.out.println(" 4: : Sort Task");
			System.out.println("------------------------");
			System.out.println(" 9: : Exit");

			option = scanner.nextInt();
			list2.actionMenu(option);

		} while (option != 9);
	}
	/**
	 * Displays Bucket list for user to choose options
	 * create instance of bucket list class 
	 * set string variable and call user name method from my bucket list class
	 * add to bucket list to personalize
	 */
	public static void displayBucketList() {
		GroceryList list = new GroceryList();
		BucketList list2 = new BucketList();
		String name = list.userName();
		int option;

		do {
			System.out.println("=======================================");
			System.out.println("       Bucket List for " + name);
			System.out.println("=======================================");
			System.out.println("Pick an option: ");
			System.out.println("-----------------------");
			System.out.println(" 1: : Add Task");
			System.out.println(" 2: : Remove Task");
			System.out.println(" 3: : Check Task on List");
			System.out.println(" 4: : Sort Task");
			System.out.println("------------------------");
			System.out.println(" 9: : Exit");

			option = scanner.nextInt();
			list2.actionMenu(option);

		} while (option != 9);
	}
}
