package com.chf.design.pattern.structural.composite.v2;

public abstract class Category {

	protected String name;

	protected abstract void operation();

	protected abstract void add(String key, Category category);

	protected abstract void remove(String key, Category category);

	protected abstract Category get(String key);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
