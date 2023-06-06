package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*
 * bwlow are the ways we can use spring expression language*/
@Component
public class Student {
	
	@Value("#{12+3+5+0}")
	private int age;
	
	
	@Value("#{ new java.lang.String('shadab')}")    //it could be any object you want
	private String name;
	
	
	@Value("#{ T(java.lang.Math).sqrt(25)}")   //calling static methods
	private double sqrt;
	
	@Value("#{ T(java.lang.Math).E}")         //calling static variable
	private double e;
	
	
	@Value("#{city}")                       //calling list,map,etc from configuration file
	private List<String> city;
	
	
	@Value("#{ 8>3 }")              //this type of operator is used which can give true or false
	private boolean random;

	public boolean isRandom() {
		return random;
	}

	public void setRandom(boolean random) {
		this.random = random;
	}

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSqrt() {
		return sqrt;
	}
 
 

	 

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", sqrt=" + sqrt + ", e=" + e + ", city=" + city + ", random="
				+ random + "]";
	}

	public void setSqrt(double sqrt) {
		this.sqrt = sqrt;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}
	
	
	
}
