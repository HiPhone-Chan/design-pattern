package com.chf.design.pattern.creational.factory.v2;

/**
 * �򵥹���
 * @author chhfeng
 *
 */
public class Client {

	public void send(String content, String type) {
		Sender sender = Factory.getSender(type);
		sender.send(content);
	}
}
