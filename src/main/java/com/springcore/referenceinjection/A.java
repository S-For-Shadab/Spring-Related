package com.springcore.referenceinjection;

public class A {
	private int x;
	private B obj;
	//here i am trying to make B class's bean and inject it into A class i.e reference injection
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

}
