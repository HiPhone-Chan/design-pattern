package com.chf.design.pattern.struct.facade.v1;

import com.chf.design.pattern.struct.facade.subsystem.Callback;
import com.chf.design.pattern.struct.facade.subsystem.CreateOrderId;
import com.chf.design.pattern.struct.facade.subsystem.OtherOpr;
import com.chf.design.pattern.struct.facade.subsystem.Subscribe;

public class OrderSubscribe {

	private CreateOrderId createOrderId;

	private Subscribe subscribe;

	private Callback callback;

	private OtherOpr otherOpr;

	public void subscribe() {
		String orderId = createOrderId.createOrderId();
		subscribe.subscribe(orderId);

		// .....
		String content = "";
		callback.callback(content);
		otherOpr.otherOpr();
	}
}
