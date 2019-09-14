package com.fdmgroup.pizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PizzaOrderController {
	Scanner scan = new Scanner(System.in);
	int choice;
	Pizza pizza = new PlainPizza();
	int chk = 0;

	void orderNewPizza() throws IOException {
		System.out.println("Welcome to Saad's Pizzeria\n\n");
		
		do {
			System.out.println("Please choose from the following toppings");
			System.out.print("1. " + PizzaTopping.CHEESE + "\n2. " + PizzaTopping.CHICKEN + "\n3. "
					+ PizzaTopping.GREEN_PEPPER + "\n4. " + PizzaTopping.PEPPERONI + "\n5. " + PizzaTopping.MUSHROOM
					+ "\n6. " + PizzaTopping.PINEAPPLE + "\n\nAlternatively, please choose the following options"
							+ "\n7. Load a savepoint" + "\n8. Order last choice"
					+ "\n9. Bail out" + "\nMake a choice: ");
			choice = scan.nextInt();
			System.out.println();
			String topping = "";

			if (choice == 1) {
				topping = "cheese";
			} else if (choice == 2) {
				topping = "chicken";
			} else if (choice == 3) {
				topping = "greenpeppers";
			} else if (choice == 4) {
				topping = "pepperoni";
			} else if (choice == 5) {
				topping = "mushroom";
			} else if (choice == 6) {
				topping = "pineapple";
			} else if (choice == 7) {
				orderFromSavePoint();
				continue;
			} else if (choice == 8) {
				
			} else {
				break;
			}
			pizza = PizzaFactory.createPizza(topping, pizza);
			System.out.println("Pizza description: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice());
		} while (true);
	}

	void createPizzaSavePoint() {
		
	}

	void savePizzaOrder() {

	}

	void orderFromSavePoint() {
		File incomplete = new File("incompleteOrders.txt");
		BufferedReader bfr;
		String[] savedToppings= {};
		try {
			 bfr= new BufferedReader(new FileReader(incomplete));
			 if(incomplete.length()<=0) {
				 System.out.println("No incomplete orders exist, try again\n");
				 return;
			 }
			 String lineOrder;
			 while((lineOrder=bfr.readLine())!=null) {
				 savedToppings=lineOrder.split(", ");
			 }
			 
			 for(int i =2;i<savedToppings.length;i++) {
				 pizza=PizzaFactory.createPizza(savedToppings[i], pizza);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	void reorderLast() {

	}
}
