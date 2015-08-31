package com.chf.design.pattern.creational.factory.v4;

/**
 * ³éÏó¹¤³§
 * 
 * @author chhfeng
 *
 */
public class Client {

	private Factory factory;

	public void send(String content, String type) {
		Sender sender = factory.getSender(type);
		sender.send(content);

		Product product = factory.getProduct(type);
		product.operate(content);
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

}
