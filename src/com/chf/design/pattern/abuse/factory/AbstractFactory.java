package com.chf.design.pattern.abuse.factory;

import com.chf.design.pattern.abuse.command.Command;
import com.chf.design.pattern.abuse.observe.Observer;
import com.chf.design.pattern.abuse.observe.Subject;

public interface AbstractFactory {
	Subject createSubject();

	Observer createObserver();

	Command createCommand(Subject subject);
}
