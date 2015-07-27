package com.chf.design.pattern.struct.composite.v2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Composite extends Category {

	private Map<String, Category> map = new HashMap<String, Category>();

	@Override
	public void operation() {
		System.out.println("{");
		for (Entry<String, Category> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":");
			entry.getValue().operation();
			System.out.println(";");
		}
		System.out.print("}");
	}

	@Override
	public void add(String key, Category category) {
		map.put(key, category);
	}

	@Override
	public void remove(String key, Category category) {
		map.remove(key, category);
	}

	@Override
	public Category get(String key) {
		return map.get(key);
	}

}
