package com.fdmgroup.pizza;

public class PizzaFactory {
	public static Pizza createPizza(String pizzaName, Pizza pizzaTemplate){
		Pizza pizza = pizzaTemplate;
		
		String type= pizzaName.toLowerCase();
		
		switch(type){
		case "cheese":
			pizza = new CheesePizza(pizza);
			break;
		case "chicken":
			pizza = new ChickenPizza(pizza);
			break;
		case "greenpeppers":
			pizza = new GreenPepperPizza(pizza);
			break;
		case "mushroom":
			pizza = new MushroomPizza(pizza);
			break;
		case "pepperoni":
			pizza = new PepperoniPizza(pizza);
			break;
		case "pineapple":
			pizza = new PineapplePizza(pizza);
			break;
		}
		return pizza;
	}
	
	private PizzaFactory(){}
}
