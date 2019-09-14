package com.fdmgroup.pizza;

public class PineapplePizza extends PizzaDecorator {

	public PineapplePizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", pineapple";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+5.50;
	}

}
