package com.chf.design.pattern.action.template;

public abstract class OrderSubscribe {

	public void subscribe() {
		String orderId = createOrderId();
		subscribe(orderId);

		// .....
		String content = "";
		callback(content);
		otherOpr();
	}

	public abstract String createOrderId();

	public abstract void subscribe(String orderId);

	public abstract void callback(String content);

	public abstract void otherOpr();
}
