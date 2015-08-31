package com.chf.design.pattern.creational.factory.v3;

import com.chf.design.pattern.creational.factory.v3.Sender;

public interface Factory {

	public Sender getSender(String type);

}
