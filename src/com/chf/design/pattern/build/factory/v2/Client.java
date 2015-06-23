package com.chf.design.pattern.build.factory.v2;

/**
 * ¼òµ¥¹¤³§
 * @author c00251918
 *
 */
public class Client {

	public void send(String content, String type) {
		Sender sender = Factory.getSender(type);
		sender.send(content);
	}
}
