package com.chf.design.pattern.creational.prototype.v1;

public class Product implements Cloneable {

	private String str;

	private int a;
	
	@Override
	public Product clone() throws CloneNotSupportedException {
		
		return (Product) super.clone();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Product p1 = new Product();
		p1.setStr("123");
		p1.setA(12);
		Product p2 = p1.clone();

		System.out.println(p1);
		System.out.println(p2);
	}

//	@Override
//	public String toString() {
//		return "Product [str=" + str + ", a=" + a + "]";
//	}

}
