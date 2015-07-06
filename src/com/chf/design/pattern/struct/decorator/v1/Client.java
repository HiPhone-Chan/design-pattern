package com.chf.design.pattern.struct.decorator.v1;

public class Client {

	private Discount discount;

	public void operator() {
		float price = 100;

		float priceAfter = discount.discount(price);

		System.out.println(priceAfter);
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
