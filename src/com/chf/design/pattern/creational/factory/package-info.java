/**
 * @author chhfeng
 * 
 *  静态工厂（1）代替构造函数创建对象 （2）方法名比构造函数清晰
 *  in jdk like Integer.valueOf  Class.forName
 *  
 *  工厂方法  定义一个用于创建对象的接口，让接口子类通过工厂方法决定实例化哪一个类。 
 *  子类决定哪一个类实例化
 *  in jdk like Collection.iterator
 *  
 *  抽象工厂  提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们的具体类。
 *  创建某一种类的对象
 *  in jdk like java.sql   UIManager
 */
package com.chf.design.pattern.creational.factory;