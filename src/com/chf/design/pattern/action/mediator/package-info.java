/**
 * @author c00251918
 *
 * 中介者模式：包装了一系列对象相互作用的方式，使得这些对象不必相互明显作用。从而使他们可以松散偶合。当某些对象之间的作用发生改变时，不会立即影响其他的一些对象之间的作用。保证这些作用可以彼此独立的变化。调停者模式将多对多的相互作用转化为一对多的相互作用。调停者模式将对象的行为和协作抽象化，把对象在小尺度的行为上与其他对象的相互作用分开处理。
 *
 * @see in jdk like java.util.Timer java.util.concurrent.Executor#execute()
 * java.util.concurrent.ExecutorService#submit() java.lang.reflect.Method#invoke()
 */
package com.chf.design.pattern.action.mediator;