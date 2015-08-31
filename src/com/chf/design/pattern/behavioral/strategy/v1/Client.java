package com.chf.design.pattern.behavioral.strategy.v1;

public class Client {

	public void operator() {
		float price = 100;

//		float priceAfter = dicount(price);
		float priceAfter = dicount2(price);

		System.out.println(priceAfter);
	}

	public float dicount(float price) {
		float dicount = 0.9f;
		return price * dicount;
	}
	
	public float dicount2(float price) {
		float dicount = 80;
		return price - dicount;
	}
}
