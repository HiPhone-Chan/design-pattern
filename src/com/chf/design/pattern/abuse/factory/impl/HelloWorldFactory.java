package com.chf.design.pattern.abuse.factory.impl;

import com.chf.design.pattern.abuse.command.Command;
import com.chf.design.pattern.abuse.command.impl.HelloWorldCommand;
import com.chf.design.pattern.abuse.factory.AbstractFactory;
import com.chf.design.pattern.abuse.observe.Observer;
import com.chf.design.pattern.abuse.observe.Subject;
import com.chf.design.pattern.abuse.observe.impl.HelloWorldObserver;
import com.chf.design.pattern.abuse.observe.impl.HelloWorldSubject;

public class HelloWorldFactory implements AbstractFactory {
	public Subject createSubject() {
		return new HelloWorldSubject();
	}

	public Observer createObserver() {
		return new HelloWorldObserver();
	}

	public Command createCommand(Subject subject) {
		return new HelloWorldCommand(subject);
	}
}
