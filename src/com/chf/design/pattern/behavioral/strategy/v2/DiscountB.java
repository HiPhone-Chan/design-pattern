package com.chf.design.pattern.behavioral.strategy.v2;

public class DiscountB extends Discount {
	public float discount(float price) {
		return price - 100f;
	}
}
