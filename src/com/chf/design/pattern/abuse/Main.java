package com.chf.design.pattern.abuse;

import com.chf.design.pattern.abuse.command.Command;
import com.chf.design.pattern.abuse.factory.AbstractFactory;
import com.chf.design.pattern.abuse.observe.Subject;
import com.chf.design.pattern.abuse.singleton.FactorySingleton;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = FactorySingleton.getInstance().getFactory();
		Subject subject = factory.createSubject();
		subject.attach(factory.createObserver());
		Command command = factory.createCommand(subject);
		command.execute();
	}

}
