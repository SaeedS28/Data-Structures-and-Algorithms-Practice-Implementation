package com.fdmgroup.pizza;

public class PepperoniPizza extends PizzaDecorator {

	public PepperoniPizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", pepperoni";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+3.00;
	}

}
