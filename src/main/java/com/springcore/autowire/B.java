package com.springcore.autowire;

public class B {
	private String name;
	private String id;
	@Override
	public String toString() {
		return "B [name=" + name + ", id=" + id + "]";
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
