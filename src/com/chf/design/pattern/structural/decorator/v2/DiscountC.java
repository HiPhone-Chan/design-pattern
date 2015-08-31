package com.chf.design.pattern.structural.decorator.v2;

public class DiscountC extends Decorator {

	public DiscountC(Discount discount) {
		setDiscount(discount);
	}

	public float discount(float price) {
		return discount.discount(price) * 0.8f;
	}

}
