package com.chf.design.pattern.build.factory.v3;

public class Client {

	private Factory factory;

	public void send(String content, String type) {
		Sender sender = factory.getSender(type);
		sender.send(content);
	}

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

}
