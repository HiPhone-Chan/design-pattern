package com.chf.design.pattern.behavioral.state.v2;

import com.chf.design.pattern.behavioral.state.v2.Processor;

public class State_OpenVPC extends State {

	@Override
	public void handle(Processor processor) {

		// ...
		System.out.println("Open VPC");
		processor.setState(new State_OpenNetwork());
	}

}
