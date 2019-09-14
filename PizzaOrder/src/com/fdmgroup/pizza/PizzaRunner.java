package com.fdmgroup.pizza;

import java.io.IOException;

public class PizzaRunner {

	public static void main(String[] args) throws IOException {
		PizzaOrderController poc = new PizzaOrderController();
		
		poc.orderNewPizza();
	}

}
