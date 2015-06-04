package com.chf.design.pattern.abuse.command.impl;

import com.chf.design.pattern.abuse.command.Command;
import com.chf.design.pattern.abuse.observe.Subject;
import com.chf.design.pattern.abuse.observe.impl.HelloWorldSubject;

public class HelloWorldCommand implements Command {
	private HelloWorldSubject subject;

	public HelloWorldCommand(Subject subject) {
		this.subject = (HelloWorldSubject) subject;
	}

	@Override
	public void execute() {
		subject.setStr("hello world");
	}

}
