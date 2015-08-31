package com.chf.design.pattern.creational.factory.v2;

public class Factory {

	public static Sender getSender(String type) {
		switch (type) {
		case "email": {
			return new EmailSender();
		}
		case "sms": {
			return new SmsSender();
		}
		}
		return null;
	}
}
