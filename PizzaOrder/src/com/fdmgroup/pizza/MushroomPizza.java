package com.fdmgroup.pizza;

public class MushroomPizza extends PizzaDecorator {

	public MushroomPizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", mushrooms";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+5.50;
	}

}
