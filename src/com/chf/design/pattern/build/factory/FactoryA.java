package com.chf.design.pattern.build.factory;

public class FactoryA extends Factory {

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
