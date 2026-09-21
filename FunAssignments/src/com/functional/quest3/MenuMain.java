package com.functional.quest3;

public class MenuMain {

	public static void main(String[] args) {
		String[] starters= {"Chicken 65", "Paneer Tikka", "Gobi Manchurian", "French Fries"};
		String[] mainCourse = { "Chicken Biryani", "Veg Fried Rice", "Butter Chicken", "Paneer Butter Masala" };
		String[] desserts = { "Ice Cream", "Gulab Jamun", "Brownie", "Fruit Salad" }; 
	    String[] drinks = { "Fresh Lime Juice", "Orange Juice", "Mango Shake", "Cold Coffee" };
	    IMenu starterMenu= (items)->{System.out.println("----STARTER----");
	    for (String item : items) {
			System.out.println(item);}
		};
		starterMenu.printMenu(starters);
		System.out.println();
	    IMenu mainCourseMenu= (items)->{System.out.println("----MAINCOURSE----");
	    for (String item : items) {
			System.out.println(item);
		}
	    };
	    starterMenu.printMenu(mainCourse);
	    System.out.println();
	    IMenu dessertMenu= (items)->{System.out.println("----DESSERTMENU----");
	    for (String item : items) {
			System.out.println(item);
		}
	    };
	    dessertMenu.printMenu(desserts);
	    System.out.println();
	    IMenu drinksMenu= (items)->{System.out.println("----DRINKSMENU----");
	    for (String item : items) {
			System.out.println(item);
		}
	    };
	    drinksMenu.printMenu(drinks);
	    System.out.println();
	}

}
