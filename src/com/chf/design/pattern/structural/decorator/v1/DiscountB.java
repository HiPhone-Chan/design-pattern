package com.chf.design.pattern.structural.decorator.v1;

public class DiscountB extends DiscountA {

	public float discount(float price) {

		return super.discount(price) - 100f;
	}
}
