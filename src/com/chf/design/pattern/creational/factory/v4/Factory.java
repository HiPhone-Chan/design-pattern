package com.chf.design.pattern.creational.factory.v4;

import com.chf.design.pattern.creational.factory.v4.Sender;

public interface Factory {

	public Sender getSender(String type);

	public Product getProduct(String type);

}
