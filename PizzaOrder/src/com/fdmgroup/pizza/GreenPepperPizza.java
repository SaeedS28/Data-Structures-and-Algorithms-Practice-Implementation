package com.fdmgroup.pizza;

public class GreenPepperPizza extends PizzaDecorator {

	public GreenPepperPizza(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.pizza.getDescription()+ ", green peppers";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice()+1.50;
	}

}
