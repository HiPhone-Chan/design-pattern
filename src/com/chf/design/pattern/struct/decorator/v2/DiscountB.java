package com.chf.design.pattern.struct.decorator.v2;

public class DiscountB extends Decorator {

	public DiscountB(Discount discount) {
		setDiscount(discount);
	}
	
	public float discount(float price) {
		return discount.discount(price) - 100f;
	}

}
