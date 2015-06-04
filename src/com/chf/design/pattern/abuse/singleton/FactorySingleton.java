package com.chf.design.pattern.abuse.singleton;

import com.chf.design.pattern.abuse.factory.AbstractFactory;
import com.chf.design.pattern.abuse.factory.impl.HelloWorldFactory;

public class FactorySingleton {

	private static FactorySingleton instance = null;

	private AbstractFactory factory;

	private FactorySingleton() {
		factory = new HelloWorldFactory();
	}

	public static synchronized FactorySingleton getInstance() {
		if (instance == null) {
			instance = new FactorySingleton();
		}
		return instance;
	}

	public AbstractFactory getFactory() {
		return factory;
	}
}
