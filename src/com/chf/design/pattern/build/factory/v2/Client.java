package com.chf.design.pattern.build.factory.v2;

public class Client {

	public void send(String content, String type) {
		Sender sender = Factory.getSender(type);
		sender.send(content);
	}
}
