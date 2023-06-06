package com.springcore.constructorinjection;

public class Ambiguity {
	private int x;
	private int y;
	public Ambiguity(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void doSum() {
		System.out.println("the addition of"+this.x+" and "+this.y+" is :"+(this.x+this.y));
	}
	

}
