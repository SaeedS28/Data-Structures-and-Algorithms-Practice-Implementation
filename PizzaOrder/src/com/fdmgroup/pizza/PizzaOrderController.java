package com.fdmgroup.pizza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PizzaOrderController {
	private Scanner scan = new Scanner(System.in);
	private int choice;
	private Pizza pizza = null;
	private int chk = 0;
	private int restore=-1;
	private static Logger orderLog = LogManager.getLogger("orderLog");
	
	void orderNewPizza() throws IOException {
		System.out.println("Welcome to Saad's Pizzeria");
		do {
			System.out.println("\nPlease choose from the following toppings");
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
				reorderLast();
				if(restore==1) {
					continue;
				}
				break;
			} else {
				break;
			}
			if(pizza==null) {
				pizza = new PlainPizza();
			}
			pizza = PizzaFactory.createPizza(topping, pizza);
			System.out.println("Current Order details: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice()+"\n");
			
			System.out.print("Would you like to create a savepoint? [y/n]: ");
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
			
			if(restore==1 || restore ==-1) {
				System.out.print("Would you like to save this order? [y/n]: ");
				char save = scan.next().toLowerCase().charAt(0);
				
				if(save == 'y') {
					savePizzaOrder();
				} else {
					orderLog.info("Order completed but not saved.");
				}
			}
		}else {
			System.out.println("Nothing was ordered");
			orderLog.info("No pizza ordered");
		}
	}

	private void createPizzaSavePoint() {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter("incompleteOrders.txt",false));
			bfw.write(pizza.getDescription());
			bfw.close();
			orderLog.info("Savepoint created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void savePizzaOrder() {
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter("completedOrder.txt",false));
			bfw.write(pizza.getDescription());
			bfw.close();
			System.out.println("Pizza Order saved successfully");
			orderLog.info("Order saved as complete.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void orderFromSavePoint() {
		File incomplete = new File("incompleteOrders.txt");
		BufferedReader bfr = null;
		String[] savedToppings = {};
		try {
			bfr = new BufferedReader(new FileReader(incomplete));
			if (incomplete.length() <= 0) {
				System.out.println("No incomplete orders exist, try again\n");
				chk=0;
				orderLog.info("Tried to restore an incomplete order, but none existed");
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
			
			orderLog.info("Order retrieved from last savepoint.");
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

	private void reorderLast() {
		File complete = new File("completedOrder.txt");
		BufferedReader bfr = null;
		String[] savedToppings = {};
		try {
			bfr = new BufferedReader(new FileReader(complete));
			if (complete.length() <= 0) {
				System.out.println("No completed orders exist, try again\n");
				restore=1;
				orderLog.info("Tried to order the last complete order, but none existed");
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
			restore=0;
			orderLog.info("Ordered the last completed order.");
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
	}
}
