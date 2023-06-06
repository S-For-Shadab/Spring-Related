package com.springcore.autowire;

public class A {
	
	private B obj;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B getObj() {
		return obj;
	}

	public A(B obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [obj=" + obj + "]";
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

}
