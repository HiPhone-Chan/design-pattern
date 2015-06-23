package com.chf.design.pattern.build.factory.v4;

import com.chf.design.pattern.build.factory.v4.EmailSender;
import com.chf.design.pattern.build.factory.v4.SmsSender;

public class FactoryA implements Factory {

	@Override
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

	@Override
	public Product getProduct(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
