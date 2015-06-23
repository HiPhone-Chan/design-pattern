package com.chf.design.pattern.build.factory.v1;

public class Client {

	public void send(String content, String type) {

		switch (type) {
		case "email": {
			EmailSender sender = new EmailSender();
			sender.send(content);
			break;
		}
		case "sms": {
			SmsSender sender = new SmsSender();
			sender.send(content);
			break;
		}
		}
	}
}
