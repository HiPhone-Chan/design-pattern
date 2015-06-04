package com.chf.design.pattern.abuse.observe;

public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();
}
