package com.fdmgroup.pizza;

public class ChickenPizza extends PizzaDecorator {

	public ChickenPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", chicken";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+5.50;
	}

}
