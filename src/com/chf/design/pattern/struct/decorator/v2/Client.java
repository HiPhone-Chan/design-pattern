package com.chf.design.pattern.struct.decorator.v2;

public class Client {

	private Discount discount;

	public void operator() {
		float price = 1000;

		Decorator decorator = new DiscountC(new DiscountB(new DiscountA()));

		float priceAfter = decorator.discount(price);

		System.out.println(priceAfter);
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.operator();
	}

}
