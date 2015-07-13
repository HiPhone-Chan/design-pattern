package com.chf.design.pattern.action.state.v2;

public class Processor {

	private State state;

	public void open() {

		state.handle(this);
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public static void main(String[] args) {
	}
}
