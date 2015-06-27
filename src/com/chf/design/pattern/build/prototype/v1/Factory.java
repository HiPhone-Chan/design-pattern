package com.chf.design.pattern.build.prototype.v1;

public class Factory {

	private Product product;

	public Product getProduct() {
		try {
			return product.clone();
		} catch (CloneNotSupportedException e) {
		}
		return null;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
