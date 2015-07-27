package com.chf.design.pattern.struct.composite.v2;

public class Client {

	public static void main(String[] args) {

		Category root = new Composite();
		root.setName("root");

		Category ec2 = new Composite();
		ec2.setName("ec2");
		Category s3 = new Composite();
		s3.setName("s3");

		Category vm = new Leaf();
		vm.setName("vmN");

		root.add("ec2", ec2);
		root.add("s3", s3);

		ec2.add("vm", vm);

		root.operation();

	}
}
