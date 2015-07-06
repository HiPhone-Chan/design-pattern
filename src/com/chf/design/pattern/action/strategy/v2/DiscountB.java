package com.chf.design.pattern.action.strategy.v2;

public class DiscountB extends Discount {
	public float discount(float price) {
		return price - 100f;
	}
}
