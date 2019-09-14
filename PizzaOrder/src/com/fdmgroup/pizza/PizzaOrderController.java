package com.fdmgroup.pizza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PizzaOrderController {
	Scanner scan = new Scanner(System.in);
	int choice;
	Pizza pizza = null;
	int chk = 0;

	void orderNewPizza() throws IOException {
		System.out.println("Welcome to Saad's Pizzeria\n");

		do {
			System.out.println("Please choose from the following toppings");
			System.out.print("1. " + PizzaTopping.CHEESE + "\n2. " + PizzaTopping.CHICKEN + "\n3. "
					+ PizzaTopping.GREEN_PEPPER + "\n4. " + PizzaTopping.PEPPERONI + "\n5. " + PizzaTopping.MUSHROOM
					+ "\n6. " + PizzaTopping.PINEAPPLE + "\n\nAlternatively, please choose the following options"
					+ "\n7. Load a savepoint" + "\n8. Order the last choice" + "\n9. Quit" + "\nMake a choice: ");
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
				topping = "mushrooms";
			} else if (choice == 6) {
				topping = "pineapple";
			} else if (choice == 7) {
				orderFromSavePoint();
				if (chk == 1) {
					chk = 0;
					System.out.print("Finish ordering? [y/n]: ");
					char finish = scan.next().toLowerCase().charAt(0);
					if (finish == 'y') {
						break;
					}
				}
				continue;
			} else if (choice == 8) {
				
			} else {
				break;
			}
			if(pizza==null) {
				pizza = new PlainPizza();
			}
			pizza = PizzaFactory.createPizza(topping, pizza);
			System.out.println("Current Order details: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice()+"\n");
			
			System.out.println("Would you like to create a savepoint? [y/n]: ");
			char save = scan.next().toLowerCase().charAt(0);
			if (save == 'y') {
				createPizzaSavePoint();
				System.out.println("Savepoint created");
			}
			
			System.out.print("Finish ordering? [y/n]: ");
			char finish = scan.next().toLowerCase().charAt(0);
			if (finish == 'y') {
				break;
			}
			
		} while (true);
		
		if(pizza!=null) {
			System.out.println("\nFinal Order Details: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice()+"\n");
			System.out.print("Would you like to save this order? [y/n]: ");
			char save = scan.next().toLowerCase().charAt(0);
			
			if(save == 'y') {
				savePizzaOrder();
			}
		}else {
			System.out.println("Nothing was ordered");
		}
	}

	void createPizzaSavePoint() {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter("incompleteOrders.txt",false));
			System.out.println(pizza.getDescription());
			bfw.write(pizza.getDescription());
			bfw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void savePizzaOrder() {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter("completeOrder.txt",false));
			System.out.println(pizza.getDescription());
			bfw.write(pizza.getDescription());
			bfw.close();
			System.out.println("Pizza Order saved successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void orderFromSavePoint() {
		File incomplete = new File("incompleteOrders.txt");
		BufferedReader bfr = null;
		String[] savedToppings = {};
		try {
			bfr = new BufferedReader(new FileReader(incomplete));
			if (incomplete.length() <= 0) {
				System.out.println("No incomplete orders exist, try again\n");
				chk=0;
				return;
			}
			if(pizza==null) {
				pizza=new PlainPizza();
			}
			String lineOrder;
			while ((lineOrder = bfr.readLine()) != null) {
				savedToppings = lineOrder.split(", ");
			}

			for (int i = 2; i < savedToppings.length; i++) {
				pizza = PizzaFactory.createPizza(savedToppings[i], pizza);
			}
			chk = 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bfr != null) {
				try {
					bfr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Last savepoint: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice());
	}

	void reorderLast() {
		
	}
}
