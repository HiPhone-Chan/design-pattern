package com.chf.design.pattern.abuse.observe.impl;

import com.chf.design.pattern.abuse.observe.Observer;
import com.chf.design.pattern.abuse.observe.Subject;

public class HelloWorldObserver implements Observer {

	@Override
	public void update(Subject subject) {
		HelloWorldSubject sub = (HelloWorldSubject) subject;
		System.out.println(sub.getStr());
	}

}
