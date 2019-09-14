package com.fdmgroup.pizza;

public class CheesePizza extends PizzaDecorator {

	public CheesePizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", cheese";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+2;
	}

}
