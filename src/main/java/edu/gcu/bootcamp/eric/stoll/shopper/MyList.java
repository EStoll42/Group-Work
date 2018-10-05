package edu.gcu.bootcamp.eric.stoll.shopper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class MyList {

	Scanner scanner = new Scanner(System.in);
	public List<String> myList = new ArrayList<String>();
	
	private String item;
	
	public String getItem() {
		return item;
	}
	/*
	 * adds an item to the arraylist
	 */
	
	public void addItem() {
	//	String answer; 
		String item = null;
		System.out.println("Enter multiple items, enter exit to exit:");
		System.out.println("Add an item: ");
		item = scanner.nextLine();
		
		while(!"exit".equals(item)){
			myList.add(item);
			item = scanner.nextLine();
		
		};
		
	}
	/*
	 * after checking for item in list this method adds it to list
	 */
	public void addItem(String item) {
		myList.add(item);
	}
	
	public void removeItem() {
		// If you want to remove an item this will do it for you
		System.out.println("What item to remove: ");
		String item = scanner.nextLine();
		myList.remove(item);
	}
	/*
	 * This checks if item is on list and then decides if it needs to add item or not
	 */
	public void checkItemOnList() {
		System.out.println("What item would you like to search: ");
		String searchItem = scanner.nextLine();
		
		boolean hasItem = myList.contains(searchItem);
		// if else does the work for checking item
		if(hasItem == true) {
			System.out.println("Item is already on list.");
		// add else statement to add item on list if not already there
		}else {
			addItem(searchItem);
			System.out.println(searchItem + " is not on the list. It will be added.");
		}
	}
	/*
	 * Sorts items in list to alphabetical order
	 */
	public void sortItems() {
		Collections.sort(myList);
		// Shows everything on the list
		System.out.println("Here are the items on your list\n");
		for(String item : myList) {	
			System.out.println(item);
			}	
	}
	/**
	 * create method to get user input name 
	 * @return string variable value of user input 
	 */
	public String userName() {
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		return name;
	}
	
	public MyList() {
		
	}
}