package com.chf.design.pattern.struct.decorator.v2;

public abstract class Decorator extends Discount {

	protected Discount discount;

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}
