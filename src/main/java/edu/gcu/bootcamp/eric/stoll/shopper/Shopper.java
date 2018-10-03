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
		System.out.println("Would you like to make a to do list (enter TODO)? or Gorcery list "
				+ "(enter GROCERY)");
		String choice = scanner.nextLine().toUpperCase();
		if (choice.equals("TODO")) {
			displayToDoList();
		}
		else {
			displayGroceryList();
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
	}