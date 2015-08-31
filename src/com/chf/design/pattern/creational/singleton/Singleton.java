package com.chf.design.pattern.creational.singleton;

/**
 * 
 * @author chhfeng
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
