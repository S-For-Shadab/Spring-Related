package com.springcore.constructorinjection;

public class A {
	private int x;
	private B obj;
	public A(int x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	 
}
