package com.chf.design.pattern.structural.decorator.v1;

public class DiscountA extends Discount {
	public float discount(float price) {
		return price * 0.9f;
	}
}
