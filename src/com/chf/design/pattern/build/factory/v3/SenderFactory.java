package com.chf.design.pattern.build.factory.v3;

public class SenderFactory implements Factory {

	public Sender getSender(String type) {
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
