package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	List<String> friends;
	Map<String,String> course;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
