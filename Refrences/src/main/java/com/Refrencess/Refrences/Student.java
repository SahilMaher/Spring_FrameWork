package com.Refrencess.Refrences;
import java.util.*;

public class Student {
	private String  name;
	private String age;
	private Set<String> number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Set<String> getNumber() {
		return number;
	}
	public void setNumber(Set<String> number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
