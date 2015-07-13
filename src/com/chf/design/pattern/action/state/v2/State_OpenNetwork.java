package com.chf.design.pattern.action.state.v2;


public class State_OpenNetwork extends State {

	@Override
	public void handle(Processor processor) {

		// ...
		System.out.println("Open Network");
		processor.setState(new State_OpenVm());
	}

}
