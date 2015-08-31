package com.chf.design.pattern.structural.composite.v2;

public class Leaf extends Category {

	@Override
	public void operation() {
		System.out.print(name);
	}

	@Override
	protected void add(String key, Category category) {
		throw new RuntimeException("This is leaf.");
	}

	@Override
	protected void remove(String key, Category category) {
		throw new RuntimeException("This is leaf.");
	}

	@Override
	protected Category get(String key) {
		throw new RuntimeException("This is leaf.");
	}

}
