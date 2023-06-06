package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

	private String names;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;

	public String getNames() {
		return names;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [names=" + names + ",\n phones=" + phones + ",\n addresses=" + addresses + ", \ncourses=" + courses
				+ "]";
	}

	public void setNames(String names) {

		this.names = names;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
