package com.chf.design.pattern.behavioral.strategy.v2;

public class DiscountA extends Discount {
	public float discount(float price) {
		return price * 0.9f;
	}
}
