package edu.gcu.bootcamp.eric.stoll.shopper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	    @Test
	    public void testPrintList() {
	    	GroceryList list = new GroceryList();
	    	String actual = null;
	    	String expected = "Beer";
	    	// adding beer to our list
	    	list.addItem("Beer");
	    	for(String item : list.myList) {	
	    		actual = item;
	    		}
	        assertEquals(expected, actual);
	    }
	}